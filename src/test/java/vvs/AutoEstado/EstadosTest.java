package vvs.AutoEstado;
import static org.junit.Assert.assertEquals;
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
import org.junit.Ignore;
import org.junit.Test;

import vvs.piscinas.Activa;
import vvs.piscinas.Cerrada;
import vvs.piscinas.Evacuacion;
import vvs.piscinas.Mantenimiento;
import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaImp;

/**
 * The Class EstadosTest.
 */
public class EstadosTest extends ExecutionContext implements Estados {

	/** The Constant MODEL_PATH. */
	public final static Path MODEL_PATH = Paths.get("vvs/AutoEstado/Estados.graphml");

	/** The piscina. */
	private Piscina piscina;

	/**
	 * Instantiates a new estados test.
	 */
	public EstadosTest() {
		piscina = null;
	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#activar()
	 */
	@Override
	public void activar() {
		System.out.println("Cambiando a activa");
		piscina.activar();

	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#evacuar()
	 */
	@Override
	public void evacuar() {
		System.out.println("Cambiando a evacuar");
		piscina.evacuar();

	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#Activa()
	 */
	@Override
	public void Activa() {
		assertEquals(Activa.class,piscina.getEstado().getClass());
	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#cerrar()
	 */
	@Override
	public void cerrar() {
		System.out.println("Cambiando a cerrar");
		piscina.cerrar();

	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#Evacuacion()
	 */
	@Override
	public void Evacuacion() {
		assertEquals(Evacuacion.class,piscina.getEstado().getClass());
	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#Cerrada()
	 */
	@Override
	public void Cerrada() {
		assertEquals(Cerrada.class,piscina.getEstado().getClass());
	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#mantenimiento()
	 */
	@Override
	public void mantenimiento() {
		System.out.println("Cambiando a mantenimiento");
		piscina.mantenimiento();

	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#Mantenimiento()
	 */
	@Override
	public void Mantenimiento() {
		assertEquals(Mantenimiento.class,piscina.getEstado().getClass());
	}

	/**
	 * Run functional test.
	 */
	@Test
	public void runFunctionalTest() {
		new TestBuilder().setModel(MODEL_PATH).setContext(new EstadosTest())
				.setPathGenerator(new RandomPath(new EdgeCoverage(100))).setStart("crearPiscina").execute();
	}

	/**
	 * Run stability test.
	 */
	 @Ignore @Test
	public void runStabilityTest() {
		new TestBuilder().setModel(MODEL_PATH).setContext(new EstadosTest())
				.setPathGenerator(new RandomPath(new TimeDuration(30, TimeUnit.SECONDS))).setStart("crearPiscina")
				.execute();
	}

	/* (non-Javadoc)
	 * @see vvs.AutoEstado.Estados#crearPiscina()
	 */
	@Override
	public void crearPiscina() {
		piscina = new PiscinaImp("Olímpica", "Zona 1");

	}

}
