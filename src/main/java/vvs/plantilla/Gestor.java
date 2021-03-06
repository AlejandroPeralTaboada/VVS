
package vvs.plantilla;

import vvs.piscinas.Piscina;

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
    return "- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(gestor)\n";
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
