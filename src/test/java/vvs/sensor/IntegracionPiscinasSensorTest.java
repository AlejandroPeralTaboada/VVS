package vvs.sensor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaImp;
import vvs.piscinas.PiscinaRelax;

/**
 * The Class IntegracionPiscinasSensorTest.
 */
public class IntegracionPiscinasSensorTest {

  /**
   * Pr I N piscinas sensor 001.
   */
  @Test
  public void pr_IN_PiscinasSensor_001() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
    float valor = 15f;
    sensorAgua.medirNivelAgua(valor);
    assertEquals(piscina.getNivelAgua(),valor,0.001);
  }
  
  /**
   * Pr I N piscinas sensor 002.
   */
  @Test
  public void pr_IN_PiscinasSensor_002() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
    float valor = 12f;
    sensorCloro.medirNivelCloro(valor);
    assertEquals(piscina.getNivelCloro(),valor,0.001);
  }
  
  /**
   * Pr I N piscinas sensor 004.
   */
  @Test
  public void pr_IN_PiscinasSensor_004() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorNivelPh sensorPh = new SensorNivelPh(piscina);
    float valor = 13f;
    sensorPh.medirNivelPh(valor);
    assertEquals(piscina.getNivelPh(),valor,0.001);
  }
  
  /**
   * Pr I N piscinas sensor 005.
   */
  @Test
  public void pr_IN_PiscinasSensor_005() {
    PiscinaRelax piscinaRelax = new PiscinaRelax("Caranza","Caranza");
    SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
    float valor = 15f;
    sensorSales.medirNivelSales(valor);
    assertEquals(piscinaRelax.getNivelSales(),valor,0.001);
  }
  
  /**
   * Pr I N piscinas sensor 006.
   */
  @Test
  public void pr_IN_PiscinasSensor_006() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorPersonas sensorPersonas = new SensorPersonas(piscina);
    sensorPersonas.medirPersonas(7);
    assertEquals(piscina.getPersonas(),7);
  }
  
  /**
   * Pr I N piscinas sensor 007.
   */
  @Test
  public void pr_IN_PiscinasSensor_007() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
    float valor = 15f;
    sensorTemperatura.medirTemperatura(valor);
    assertEquals(piscina.getTemperatura(),valor,0.001);
  }
  
  /**
   * Pr in piscinas sensor 008.
   */
  @Test 
  public void pr_In_PiscinasSensor_008() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
    assertEquals(piscina,sensorAgua.getPiscina());
  }
  
  /**
   * Pr in piscinas sensor 009.
   */
  @Test 
  public void pr_In_PiscinasSensor_009() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
    assertEquals(piscina,sensorCloro.getPiscina());
  }
  
  /**
   * Pr in piscinas sensor 010.
   */
  @Test 
  public void pr_In_PiscinasSensor_010() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorNivelPh sensorPh = new SensorNivelPh(piscina);
    assertEquals(piscina,sensorPh.getPiscina());
  }
  
  /**
   * Pr in piscinas sensor 011.
   */
  @Test 
  public void pr_In_PiscinasSensor_011() {
    PiscinaRelax piscinaRelax = new PiscinaRelax("Caranza","Caranza");
    SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
    assertEquals(piscinaRelax,sensorSales.getPiscina());
  }
  
  /**
   * Pr in piscinas sensor 012.
   */
  @Test 
  public void pr_In_PiscinasSensor_012() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorPersonas sensorPersonas = new SensorPersonas(piscina);
    assertEquals(piscina,sensorPersonas.getPiscina());
  }
  
  /**
   * Pr in piscinas sensor 013.
   */
  @Test 
  public void pr_In_PiscinasSensor_013() {
    Piscina piscina = new PiscinaImp("Caranza","Caranza");
    SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
    assertEquals(piscina,sensorTemperatura.getPiscina());
  }
  
  
  
  
}
