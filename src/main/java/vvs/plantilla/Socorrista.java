/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.plantilla;

// TODO: Auto-generated Javadoc
/**
 * The Class Socorrista.
 */
public class Socorrista extends Empleado {

  /**
   * Instantiates a new socorrista.
   *
   * @param nombre the nombre
   * @param genero the genero
   */
  public Socorrista(String nombre, Genero genero) {
    super(nombre, genero);
  }

  /* (non-Javadoc)
   * @see vvs.plantilla.Empleado#avisar()
   */
  @Override
  public String avisar() {
    return ("- " + this.getAvisadoGenero() + " \"" + this.getNombre() + "\" " + "(socorrista)\n");
  }
}
