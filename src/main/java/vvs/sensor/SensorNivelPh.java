/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.sensor;

import vvs.piscinas.Piscina;

public class SensorNivelPh implements Sensor {

  private Piscina piscina;

  public SensorNivelPh(Piscina piscina) {
    this.piscina = piscina;
  }

  public void medirNivelPh(float nivel) {
    this.piscina.setNivelPh(nivel);
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
