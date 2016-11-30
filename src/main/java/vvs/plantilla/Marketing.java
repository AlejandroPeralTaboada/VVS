
package vvs.plantilla;

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
    return "- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(marketing)\n";
  }
}
