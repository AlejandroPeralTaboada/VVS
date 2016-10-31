/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.sensor;

import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaRelax;

// TODO: Auto-generated Javadoc
/**
 * The Class SensorNivelSales.
 */
public class SensorNivelSales implements Sensor {

  /** The piscina. */
  private PiscinaRelax piscina;

  /**
   * Instantiates a new sensor nivel sales.
   *
   * @param piscina the piscina
   */
  public SensorNivelSales(PiscinaRelax piscina) {
    this.piscina = piscina;
  }

  /**
   * Medir nivel sales.
   *
   * @param nivel the nivel
   */
  public void medirNivelSales(float nivel) {
    this.piscina.setNivelSales(nivel);
  }

  /* (non-Javadoc)
   * @see vvs.sensor.Sensor#getPiscina()
   */
  @Override
  public PiscinaRelax getPiscina() {
    return (piscina);
  }
  
  /* (non-Javadoc)
   * @see vvs.sensor.Sensor#setPiscina(vvs.piscinas.Piscina)
   */
  @Override
  public void setPiscina(Piscina piscina) {
    this.piscina = (PiscinaRelax)piscina;
  }
}