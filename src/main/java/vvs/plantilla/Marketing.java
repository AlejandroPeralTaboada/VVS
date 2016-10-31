/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.plantilla;

// TODO: Auto-generated Javadoc
/**
 * The Class Marketing.
 */
public class Marketing extends Empleado {

  /**
   * Instantiates a new marketing.
   *
   * @param nombre the nombre
   * @param genero the genero
   */
  public Marketing(String nombre, Genero genero) {
    super(nombre, genero);
  }

  /* (non-Javadoc)
   * @see vvs.plantilla.Empleado#avisar()
   */
  @Override
  public String avisar() {
    return ("- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(marketing)\n");
  }
}
