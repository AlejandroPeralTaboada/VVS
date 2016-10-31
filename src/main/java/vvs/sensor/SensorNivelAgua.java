/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.sensor;

import vvs.piscinas.Piscina;

// TODO: Auto-generated Javadoc
/**
 * The Class SensorNivelAgua.
 */
public class SensorNivelAgua implements Sensor {

  /** The piscina. */
  private Piscina piscina;

  /**
   * Instancia sensor nivel agua.
   * 
   * @param piscina piscina
   */
  
  public SensorNivelAgua(Piscina piscina) {
    if (piscina == null) {
      throw new IllegalArgumentException();
    }
    this.piscina = piscina;
  }

  /**
   * Medir nivel agua.
   *
   * @param nivel the nivel
   */
  public void medirNivelAgua(float nivel) {
    this.piscina.setNivelAgua(nivel);
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
