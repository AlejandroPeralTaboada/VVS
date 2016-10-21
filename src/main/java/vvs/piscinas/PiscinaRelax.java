/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.piscinas;

import vvs.registro.SucesoNivelSales;

public class PiscinaRelax extends PiscinaImp {

  float nivelSales;

  public PiscinaRelax(String nombre, String ubicacion) {
    super(nombre, ubicacion);
  }

  public float getNivelSales() {
    return this.nivelSales;
  }

  /**
   * set Nivel sales.
   * 
   * @param nivel nivel sales
   */
  
  public void setNivelSales(float nivel) {
    if (nivel < 0) {
      throw new IllegalArgumentException();
    }
    if (nivel == this.nivelSales) {
      return;
    }
    float nivelInicial = this.nivelSales;
    this.nivelSales = nivel;
    this.setChanged();
    this.notifyObservers();
    if (getEstado().registrarParametros(this)) {
      getRegistro().addSuceso(new SucesoNivelSales(nivelInicial, nivel));
    }

  }
}
