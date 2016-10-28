package vvs.registro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaImp;
import vvs.piscinas.PiscinaRelax;

public class IntegracionPiscinasRegistroTest {

  @Test
  public void pr_IN_PiscinasRegistro_001() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.setNivelAgua(1);
    assertEquals(0, piscina.getRegistro().getRegistro().size());
  }

  @Test
  public void pr_IN_PiscinasRegistro_002() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.setNivelAgua(1);
    // Esperamos 2 sucesos uno por el cambio de estado y otro por el cambio
    // del nivel del agua
    assertEquals(2, piscina.getRegistro().getRegistro().size());
  }

  @Test
  public void pr_IN_PiscinasRegistro_003() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.setNivelCloro(1);
    // Esperamos 2 sucesos uno por el cambio de estado y otro por el cambio
    // del nivel del agua
    assertEquals(2, piscina.getRegistro().getRegistro().size());
  }

  @Test
  public void pr_IN_PiscinasRegistro_004() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.setNivelPh(1);
    // Esperamos 2 sucesos uno por el cambio de estado y otro por el cambio
    // del nivel del agua
    assertEquals(2, piscina.getRegistro().getRegistro().size());
  }

  @Test
  public void pr_IN_PiscinasRegistro_005() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.setPersonas(1);
    // Esperamos 2 sucesos uno por el cambio de estado y otro por el cambio
    // del nivel del agua
    assertEquals(2, piscina.getRegistro().getRegistro().size());
  }

  @Test
  public void pr_IN_PiscinasRegistro_006() {
    PiscinaRelax piscina = new PiscinaRelax("", "");
    piscina.activar();
    piscina.setNivelSales(1);
    // Esperamos 2 sucesos uno por el cambio de estado y otro por el cambio
    // del nivel del agua
    assertEquals(2, piscina.getRegistro().getRegistro().size());
  }

  @Test
  public void pr_IN_PiscinasRegistro_007() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.cerrar();
    piscina.setNivelAgua(1);
    // Esperamos 0 sucesos uno porque la pasicina esta cerrada y al cerrarse
    // se borra el registro
    assertEquals(0, piscina.getRegistro().getRegistro().size());
  }

  @Test
  public void pr_IN_PiscinasRegistro_008() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.setPersonas(10);
    piscina.evacuar();
    piscina.setNivelCloro(1);
    // Esperamos 4 sucesos 2 por el cambio de estado y otros 2 por el cambio
    // de parametros
    assertEquals(4, piscina.getRegistro().getRegistro().size());
  }

}
