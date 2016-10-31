/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.plantilla;

import vvs.piscinas.Piscina;

// TODO: Auto-generated Javadoc
/**
 * The Class Gestor.
 */
public class Gestor extends Empleado {

  /**
   * Instantiates a new gestor.
   *
   * @param nombre the nombre
   * @param genero the genero
   */
  public Gestor(String nombre, Genero genero) {
    super(nombre, genero);
  }

  /* (non-Javadoc)
   * @see vvs.plantilla.Empleado#avisar()
   */
  @Override
  public String avisar() {
    return ("- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(gestor)\n");
  }

  /**
   * Generar informe.
   *
   * @param piscina the piscina
   * @return the string
   */
  public String generarInforme(Piscina piscina) {
    return piscina.informe();
  }
}
