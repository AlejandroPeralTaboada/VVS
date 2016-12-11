package vvs.piscinas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import vvs.sensor.Sensor;

import java.util.Random;

/**
 * The Class PiscinaTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class PiscinaTest {
  
  /** The delta. */
  private static float delta = 0.00001f;
  
  /** The nombre. */
  private static String nombre = "Nombre";
  
  /** The ubicacion. */
  private static String ubicacion = "Ubicacion";
  
  /** The random. */
  private static Random random = new Random();
  
  /** The random int. */
  private static int randomInt = 100000;

  /**
   * Pr U N piscina 001.
   */
  @Test
  public void pr_UN_Piscina_001() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelAgua(0);
    assertEquals(0f, piscina.getNivelAgua(), delta);
  }

  /**
   * Pr U N piscina 002.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_002() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelAgua(-1);
  }

  /**
   * Pr U N piscina 003.
   */
  @Test
  public void pr_UN_Piscina_003() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelAgua(10);
    assertEquals(10f, piscina.getNivelAgua(), delta);
  }

  /**
   * Pr U N piscina 004.
   */
  @Test
  public void pr_UN_Piscina_004() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float value = random.nextFloat() * random.nextInt(randomInt);
    piscina.setNivelAgua(value);
    assertEquals(value, piscina.getNivelAgua(), delta);
  }

  /**
   * Pr U N piscina 005.
   */
  @Test
  public void pr_UN_Piscina_005() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setTemperatura(0);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  /**
   * Pr U N piscina 006.
   */
  @Test
  public void pr_UN_Piscina_006() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setTemperatura(-273.15f);
    assertEquals(-273.15f, piscina.getTemperatura(), delta);
  }

  /**
   * Pr U N piscina 007.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_007() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setTemperatura(-273.16f);
  }

  /**
   * Pr U N piscina 008.
   */
  @Test
  public void pr_UN_Piscina_008() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float range = random.nextFloat() * 10000 - 273.15f;
    piscina.setTemperatura(range);
    assertEquals(range, piscina.getTemperatura(), delta);
  }

  /**
   * Pr U N piscina 009.
   */
  @Test
  public void pr_UN_Piscina_009() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(10.00f);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  /**
   * Pr U N piscina 010.
   */
  @Test
  public void pr_UN_Piscina_010() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(0);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  /**
   * Pr U N piscina 011.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_011() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(-0.01f);
  }

  /**
   * Pr U N piscina 012.
   */
  @Test
  public void pr_UN_Piscina_012() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(100);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  /**
   * Pr U N piscina 013.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_013() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(100.01f);
  }

  /**
   * Pr U N piscina 014.
   */
  @Test
  public void pr_UN_Piscina_014() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float range = random.nextFloat() * 100;
    piscina.setTemperatura(range);
    assertEquals(range, piscina.getTemperatura(), delta);
  }

  /**
   * Pr U N piscina 015.
   */
  @Test
  public void pr_UN_Piscina_015() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(10.00f);
    assertEquals(10f, piscina.getNivelPh(), delta);
  }

  /**
   * Pr U N piscina 016.
   */
  @Test
  public void pr_UN_Piscina_016() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(0);
    assertEquals(0, piscina.getNivelPh(), delta);
  }

  /**
   * Pr U N piscina 017.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_017() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(-0.01f);
  }

  /**
   * Pr U N piscina 018.
   */
  @Test
  public void pr_UN_Piscina_018() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(14);
    assertEquals(14, piscina.getNivelPh(), delta);
  }

  /**
   * Pr U N piscina 019.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_019() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(14.01f);
  }

  /**
   * Pr U N piscina 020.
   */
  @Test
  public void pr_UN_Piscina_020() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float range = random.nextFloat() * 14;
    piscina.setNivelPh(range);
    assertEquals(range, piscina.getNivelPh(), delta);
  }

  /**
   * Pr U N piscina 021.
   */
  @Test
  public void pr_UN_Piscina_021() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setPersonas(0);
    assertEquals(0, piscina.getPersonas());
  }

  /**
   * Pr U N piscina 022.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_022() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setPersonas(-1);
  }

  /**
   * Pr U N piscina 023.
   */
  @Test
  public void pr_UN_Piscina_023() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setPersonas(10);
    assertEquals(10, piscina.getPersonas());
  }

  /**
   * Pr U N piscina 024.
   */
  @Test
  public void pr_UN_Piscina_024() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    int value = random.nextInt(randomInt);
    piscina.setPersonas(value);
    assertEquals(value, piscina.getPersonas());
  }

  /**
   * Pr U N piscina 025.
   */
  @Test
  public void pr_UN_Piscina_025() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    Sensor sensor = Mockito.mock(Sensor.class);
    Mockito.when(sensor.getPiscina()).thenReturn(piscina);
    piscina.addSensor(sensor);
    assertEquals(sensor, piscina.getSensores().get(0));
  }

  /**
   * Pr U N piscina 026.
   */
  @Test
  public void pr_UN_Piscina_026() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    PiscinaImp piscina2 = new PiscinaImp(nombre + "2", ubicacion);
    Sensor sensor = Mockito.mock(Sensor.class);
    Mockito.when(sensor.getPiscina()).thenReturn(piscina2);
    piscina.addSensor(sensor);
    assertEquals(sensor, piscina.getSensores().get(0));
  }

  /**
   * Pr U N piscina 027.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_027() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    Sensor sensor = Mockito.mock(Sensor.class);
    piscina.addSensor(sensor);
    piscina.addSensor(sensor);
  }

  /**
   * Pr U N piscina 028.
   */
  @Test
  public void pr_UN_Piscina_028() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    String informe = piscina.informe();
    String[] partes = informe.split("\\r\\n|\\n|\\r");
    assertEquals("# Informe de piscina \"" + nombre + "\", ubicada en \"" + ubicacion + "\".",
        partes[0]);
  }
}
