/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.sensor;

import vvs.piscinas.Piscina;

/**
 * The Class SensorNivelCloro.
 */
public class SensorNivelCloro implements Sensor {

  /** The piscina. */
  private Piscina piscina;

  /**
   * Instantiates a new sensor nivel cloro.
   *
   * @param piscina the piscina
   */
  public SensorNivelCloro(Piscina piscina) {
    this.piscina = piscina;
  }

  /**
   * Medir nivel cloro.
   *
   * @param nivel the nivel
   */
  public void medirNivelCloro(float nivel) {
    this.piscina.setNivelCloro(nivel);
  }

  /* (non-Javadoc)
   * @see vvs.sensor.Sensor#getPiscina()
   */
  @Override
  public Piscina getPiscina() {
    return (piscina);
  }
  
  /* (non-Javadoc)
   * @see vvs.sensor.Sensor#setPiscina(vvs.piscinas.Piscina)
   */
  @Override
  public void setPiscina(Piscina piscina) {
    this.piscina = piscina;
  }
}
