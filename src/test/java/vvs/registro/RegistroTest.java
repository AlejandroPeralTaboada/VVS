package vvs.registro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// TODO: Auto-generated Javadoc
/**
 * The Class RegistroTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class RegistroTest {

  /** The suceso. */
  @Mock
  private Suceso suceso;

  /**
   * Pr U N registro 001.
   */
  @Test
  public void pr_UN_Registro_001() {
    Registro registro = new Registro(0);
    registro.addSuceso(suceso);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 002.
   */
  @Test
  public void pr_UN_Registro_002() {
    Registro registro = new Registro(-1);
    registro.addSuceso(suceso);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 003.
   */
  @Test
  public void pr_UN_Registro_003() {
    Registro registro = new Registro(1);
    registro.addSuceso(suceso);
    boolean result = (registro.getRegistro().size() == 1 && registro.getNumeroRegistros() == 1);
    assertTrue(result);
  }

  /**
   * Pr U N registro 004.
   */
  @Test
  public void pr_UN_Registro_004() {
    Registro registro = new Registro(10);
    for (int i = 0; i < 10; i++) {
      registro.addSuceso(suceso);
    }
    boolean result = (registro.getRegistro().size() == 10 && registro.getNumeroRegistros() == 10);
    assertTrue(result);
  }

  /**
   * Pr U N registro 005.
   */
  @Test
  public void pr_UN_Registro_005() {
    Registro registro = new Registro(0);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(0);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 006.
   */
  @Test
  public void pr_UN_Registro_006() {
    Registro registro = new Registro(-1);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(0);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 007.
   */
  @Test
  public void pr_UN_Registro_007() {
    Registro registro = new Registro(1);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(0);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 008.
   */
  @Test
  public void pr_UN_Registro_008() {
    Registro registro = new Registro(0);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(-1);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 009.
   */
  @Test
  public void pr_UN_Registro_009() {
    Registro registro = new Registro(-1);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(-1);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 010.
   */
  @Test
  public void pr_UN_Registro_010() {
    Registro registro = new Registro(1);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(-1);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
    assertTrue(result);
  }

  /**
   * Pr U N registro 011.
   */
  @Test
  public void pr_UN_Registro_011() {
    Registro registro = new Registro(0);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(1);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 1);
    assertTrue(result);
  }

  /**
   * Pr U N registro 012.
   */
  @Test
  public void pr_UN_Registro_012() {
    Registro registro = new Registro(-1);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(1);
    boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 1);
    assertTrue(result);
  }

  /**
   * Pr U N registro 013.
   */
  @Test
  public void pr_UN_Registro_013() {
    Registro registro = new Registro(1);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(1);
    boolean result = (registro.getRegistro().size() == 1 && registro.getNumeroRegistros() == 1);
    assertTrue(result);
  }

  /**
   * Pr U N registro 014.
   */
  @Test
  public void pr_UN_Registro_014() {
    Registro registro = new Registro(1);
    registro.addSuceso(suceso);
    registro.setNumeroRegistros(2);
    boolean result = (registro.getRegistro().size() == 1 && registro.getNumeroRegistros() == 2);
    assertTrue(result);
  }

  /**
   * Pr U N registro 015.
   */
  @Test
  public void pr_UN_Registro_015() {
    Registro registro = new Registro(1);
    registro.addSuceso(suceso);
    when(suceso.toString()).thenReturn("Suceso1");
    assertEquals(registro.informe(), "Suceso1");
  }

  /**
   * Pr U N registro 016.
   */
  @Test
  public void pr_UN_Registro_016() {
    Registro registro = new Registro(2);
    registro.addSuceso(suceso);
    registro.addSuceso(suceso);
    when(suceso.toString()).thenReturn("Suceso1");
    assertEquals(registro.informe(), "Suceso1 Suceso1");
  }

  /**
   * Pr U N registro 017.
   */
  @Test
  public void pr_UN_Registro_017() {
    Registro registro = new Registro(2);
    assertEquals(registro.informe(), "");
  }
}
