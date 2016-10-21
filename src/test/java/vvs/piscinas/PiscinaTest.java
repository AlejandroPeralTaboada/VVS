package vvs.piscinas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import vvs.sensor.Sensor;

import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class PiscinaTest {
  private static float delta = 0.00001f;
  private static String nombre = "Nombre";
  private static String ubicacion = "Ubicacion";
  private static Random random = new Random();
  private static int randomInt = 100000;

  @Test
  public void pr_UN_Piscina_001() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelAgua(0);
    assertEquals(0f, piscina.getNivelAgua(), delta);
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_002() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelAgua(-1);
  }

  @Test
  public void pr_UN_Piscina_003() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelAgua(10);
    assertEquals(10f, piscina.getNivelAgua(), delta);
  }

  @Test
  public void pr_UN_Piscina_004() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float value = random.nextFloat() * random.nextInt(randomInt);
    piscina.setNivelAgua(value);
    assertEquals(value, piscina.getNivelAgua(), delta);
  }

  @Test
  public void pr_UN_Piscina_005() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setTemperatura(0);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  @Test
  public void pr_UN_Piscina_006() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setTemperatura(-273.15f);
    assertEquals(-273.15f, piscina.getTemperatura(), delta);
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_007() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setTemperatura(-273.16f);
  }

  @Test
  public void pr_UN_Piscina_008() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float range = random.nextFloat() * 10000 - 273.15f;
    piscina.setTemperatura(range);
    assertEquals(range, piscina.getTemperatura(), delta);
  }

  @Test
  public void pr_UN_Piscina_009() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(10.00f);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  @Test
  public void pr_UN_Piscina_010() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(0);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_011() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(-0.01f);
  }

  @Test
  public void pr_UN_Piscina_012() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(100);
    assertEquals(0, piscina.getTemperatura(), delta);
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_013() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelCloro(100.01f);
  }

  @Test
  public void pr_UN_Piscina_014() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float range = random.nextFloat() * 100;
    piscina.setTemperatura(range);
    assertEquals(range, piscina.getTemperatura(), delta);
  }

  @Test
  public void pr_UN_Piscina_015() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(10.00f);
    assertEquals(10f, piscina.getNivelPh(), delta);
  }

  @Test
  public void pr_UN_Piscina_016() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(0);
    assertEquals(0, piscina.getNivelPh(), delta);
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_017() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(-0.01f);
  }

  @Test
  public void pr_UN_Piscina_018() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(14);
    assertEquals(14, piscina.getNivelPh(), delta);
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_019() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setNivelPh(14.01f);
  }

  @Test
  public void pr_UN_Piscina_020() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    float range = random.nextFloat() * 14;
    piscina.setNivelPh(range);
    assertEquals(range, piscina.getNivelPh(), delta);
  }

  @Test
  public void pr_UN_Piscina_021() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setPersonas(0);
    assertEquals(0, piscina.getPersonas());
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_022() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setPersonas(-1);
  }

  @Test
  public void pr_UN_Piscina_023() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    piscina.setPersonas(10);
    assertEquals(10, piscina.getPersonas());
  }

  @Test
  public void pr_UN_Piscina_024() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    int value = random.nextInt(randomInt);
    piscina.setPersonas(value);
    assertEquals(value, piscina.getPersonas());
  }

  @Test
  public void pr_UN_Piscina_025() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    Sensor sensor = Mockito.mock(Sensor.class);
    Mockito.when(sensor.getPiscina()).thenReturn(piscina);
    piscina.addSensor(sensor);
    assertEquals(sensor, piscina.getSensores().get(0));
  }

  @Test
  public void pr_UN_Piscina_026() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    PiscinaImp piscina2 = new PiscinaImp(nombre + "2", ubicacion);
    Sensor sensor = Mockito.mock(Sensor.class);
    Mockito.when(sensor.getPiscina()).thenReturn(piscina2);
    piscina.addSensor(sensor);
    assertEquals(sensor, piscina.getSensores().get(0));
  }

  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Piscina_027() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    Sensor sensor = Mockito.mock(Sensor.class);
    piscina.addSensor(sensor);
    piscina.addSensor(sensor);
  }

  @Test
  public void pr_UN_Piscina_028() {
    PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
    String informe = piscina.informe();
    String[] partes = informe.split("\\r\\n|\\n|\\r");
    assertEquals("# Informe de piscina \"" + nombre + "\", ubicada en \"" + ubicacion + "\".",
        partes[0]);
  }
}
