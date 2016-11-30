package vvs.piscinas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * The Class EstadosTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class EstadosTest {

  // LAS PISCINAS COMIENZAN SIEMPRE EN MODO EVACUAR
  /**
   * Pr U N estados 001.
   */
  // ESTADO INICIAL ACTIVA
  @Test
  public void pr_UN_Estados_001() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.activar();
    assertEquals(Activa.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 002.
   */
  @Test
  public void pr_UN_Estados_002() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.mantenimiento();
    assertEquals(Activa.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 003.
   */
  @Test
  public void pr_UN_Estados_003() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.cerrar();
    assertEquals(Activa.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 004.
   */
  @Test
  public void pr_UN_Estados_004() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.evacuar();
    assertEquals(Evacuacion.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 005.
   */
  // ESTADO INICIAL CERRADA
  @Test
  public void pr_UN_Estados_005() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.cerrar();
    piscina.activar();
    assertEquals(Cerrada.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 006.
   */
  @Test
  public void pr_UN_Estados_006() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.cerrar();
    piscina.mantenimiento();
    assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 007.
   */
  @Test
  public void pr_UN_Estados_007() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.cerrar();
    piscina.cerrar();
    assertEquals(Cerrada.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 008.
   */
  @Test
  public void pr_UN_Estados_008() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.cerrar();
    piscina.evacuar();
    assertEquals(Cerrada.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 009.
   */
  // ESTADO INICIAL MANTENIMIENTO
  @Test
  public void pr_UN_Estados_009() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    assertEquals(Activa.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 010.
   */
  @Test
  public void pr_UN_Estados_010() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.mantenimiento();
    assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 011.
   */
  @Test
  public void pr_UN_Estados_011() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.cerrar();
    assertEquals(Cerrada.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 012.
   */
  @Test
  public void pr_UN_Estados_012() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.evacuar();
    assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 013.
   */
  // ESTADO INICIAL EVACUACION
  @Test
  public void pr_UN_Estados_013() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.evacuar();
    piscina.activar();
    assertEquals(Evacuacion.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 014.
   */
  @Test
  public void pr_UN_Estados_014() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.setPersonas(10);
    piscina.evacuar();
    assertEquals(Evacuacion.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 015.
   */
  @Test
  public void pr_UN_Estados_015() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.evacuar();
    assertEquals(Evacuacion.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 016.
   */
  @Test
  public void pr_UN_Estados_016() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.setPersonas(10);
    piscina.evacuar();
    piscina.setPersonas(0);
    assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 017.
   */
  @Test
  public void pr_UN_Estados_017() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.evacuar();
    piscina.cerrar();
    assertEquals(Evacuacion.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 018.
   */
  @Test
  public void pr_UN_Estados_018() {
    Piscina piscina = new PiscinaImp("", "");
    piscina.activar();
    piscina.evacuar();
    piscina.mantenimiento();
    assertEquals(Evacuacion.class, piscina.getEstado().getClass());
  }

  /**
   * Pr U N estados 019.
   */
  // Métodos Estados
  @Test
  public void pr_UN_Estados_019() {
    EstadoPiscina estadoPiscina = Activa.getInstancia();
    Piscina piscina = Mockito.mock(Piscina.class);
    assertTrue(estadoPiscina.registrarParametros(piscina));
    assertTrue(estadoPiscina.saltarAlarmaNiveles(piscina));
    assertTrue(estadoPiscina.saltarAlarmaPersonas(piscina));
    assertTrue(estadoPiscina.lanzarAlarmas(piscina));
  }

  /**
   * Pr U N estados 020.
   */
  @Test
  public void pr_UN_Estados_020() {
    EstadoPiscina estadoPiscina = Cerrada.getInstancia();
    Piscina piscina = Mockito.mock(Piscina.class);
    assertFalse(estadoPiscina.registrarParametros(piscina));
    assertFalse(estadoPiscina.saltarAlarmaNiveles(piscina));
    assertTrue(estadoPiscina.saltarAlarmaPersonas(piscina));
    assertFalse(estadoPiscina.lanzarAlarmas(piscina));
  }

  /**
   * Pr U N estados 021.
   */
  @Test
  public void pr_UN_Estados_021() {
    EstadoPiscina estadoPiscina = Evacuacion.getInstancia();
    Piscina piscina = Mockito.mock(Piscina.class);
    assertTrue(estadoPiscina.registrarParametros(piscina));
    assertFalse(estadoPiscina.saltarAlarmaNiveles(piscina));
    assertTrue(estadoPiscina.saltarAlarmaPersonas(piscina));
    assertFalse(estadoPiscina.lanzarAlarmas(piscina));
  }

  /**
   * Pr U N estados 022.
   */
  @Test
  public void pr_UN_Estados_022() {
    EstadoPiscina estadoPiscina = Mantenimiento.getInstancia();
    Piscina piscina = Mockito.mock(Piscina.class);
    assertFalse(estadoPiscina.registrarParametros(piscina));
    assertFalse(estadoPiscina.saltarAlarmaNiveles(piscina));
    assertTrue(estadoPiscina.saltarAlarmaPersonas(piscina));
    assertFalse(estadoPiscina.lanzarAlarmas(piscina));
  }

}
