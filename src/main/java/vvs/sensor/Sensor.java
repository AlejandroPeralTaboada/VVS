/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.sensor;

import vvs.piscinas.Piscina;

public interface Sensor {
  public Piscina getPiscina();
  public void setPiscina(Piscina piscina);
}
