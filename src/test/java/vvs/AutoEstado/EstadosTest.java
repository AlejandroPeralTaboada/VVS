package vvs.AutoEstado;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.condition.TimeDuration;
import org.graphwalker.core.generator.AStarPath;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.test.TestBuilder;
import org.junit.Test;

import vvs.piscinas.Activa;
import vvs.piscinas.Cerrada;
import vvs.piscinas.Evacuacion;
import vvs.piscinas.Mantenimiento;
import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaImp;

public class EstadosTest extends ExecutionContext implements Estados {

  public final static Path MODEL_PATH = Paths.get("vvs/AutoEstado/Estados.graphml");

  private Piscina piscina;

  public EstadosTest() {
    piscina = new PiscinaImp("Olímpica", "Zona 1");
  }

  @Override
  public void activar() {
    piscina.activar();

  }

  @Override
  public void evacuar() {
    piscina.evacuar();

  }

  @Override
  public void Activa() {
    if (piscina.getEstado().getClass() == Activa.class) {
      System.err.println("ERROR, excepted ACTIVA was " + Activa.class.getName());
      throw new RuntimeException();
    }
  }

  @Override
  public void cerrar() {
    piscina.cerrar();

  }

  @Override
  public void Evacuacion() {
    if (piscina.getEstado().getClass() == Evacuacion.class) {
      System.err.println("ERROR, excepted Evacuacion was " + Evacuacion.class.getName());
      throw new RuntimeException();
    }
  }

  @Override
  public void Cerrada() {
    if (piscina.getEstado().getClass() == Cerrada.class) {
      System.err.println("ERROR, excepted CERRADA was " + Cerrada.class.getName());
      throw new RuntimeException();
    }

  }

  @Override
  public void mantenimiento() {
    piscina.mantenimiento();

  }

  @Override
  public void Mantenimiento() {
    if (piscina.getEstado().getClass() == Mantenimiento.class) {
      System.err.println("ERROR, excepted MANTENIMIENTO was " + Mantenimiento.class.getName());
      throw new RuntimeException();
    }

  }

  @Test
  public void runSmokeTest() {
    new TestBuilder().setModel(MODEL_PATH).setContext(new EstadosTest())
        .setPathGenerator(new AStarPath(new ReachedVertex("v_Browse"))).setStart("e_Init")
        .execute();
  }

  @Test
  public void runFunctionalTest() {
    new TestBuilder().setModel(MODEL_PATH).setContext(new EstadosTest())
        .setPathGenerator(new RandomPath(new EdgeCoverage(100))).setStart("e_Init").execute();
  }

  @Test
  public void runStabilityTest() {
    new TestBuilder().setModel(MODEL_PATH).setContext(new EstadosTest())
        .setPathGenerator(new RandomPath(new TimeDuration(30, TimeUnit.SECONDS))).setStart("e_Init")
        .execute();
  }

}
