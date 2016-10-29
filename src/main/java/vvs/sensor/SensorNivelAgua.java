/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.sensor;

import vvs.piscinas.Piscina;

public class SensorNivelAgua implements Sensor {

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

  public void medirNivelAgua(float nivel) {
    this.piscina.setNivelAgua(nivel);
  }

  @Override
  public Piscina getPiscina() {
    return (piscina);
  }

  @Override
  public void setPiscina(Piscina piscina) {
	this.piscina=piscina;
  }

}
