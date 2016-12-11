/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.piscinas;

import vvs.registro.SucesoNivelSales;

/**
 * The Class PiscinaRelax.
 */
public class PiscinaRelax extends PiscinaImp {

  /** The nivel sales. */
  float nivelSales;

  /**
   * Instantiates a new piscina relax.
   *
   * @param nombre the nombre
   * @param ubicacion the ubicacion
   */
  public PiscinaRelax(String nombre, String ubicacion) {
    super(nombre, ubicacion);
  }

  /**
   * Gets the nivel sales.
   *
   * @return the nivel sales
   */
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
