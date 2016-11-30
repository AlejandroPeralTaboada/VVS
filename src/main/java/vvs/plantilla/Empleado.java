
package vvs.plantilla;

/**
 * The Class Empleado.
 */
public abstract class Empleado {

  /**
   * The Enum Genero.
   */
  public enum Genero {

    /** The h. */
    H, /** The m. */
 M
  }

  /** The nombre. */
  private final String nombre;
  
  /** The genero. */
  private final Genero genero;

  /**
   * Instantiates a new empleado.
   *
   * @param nombre the nombre
   * @param genero the genero
   */
  public Empleado(String nombre, Genero genero) {
    this.nombre = nombre;
    this.genero = genero;
  }

  /**
   * Gets the nombre.
   *
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Gets the avisado genero.
   *
   * @return the avisado genero
   */
  protected String getAvisadoGenero() {
    if (this.genero == Genero.H) {
      return "Avisado";
    } else {
      return "Avisada";
    }
  }

  /**
   * Avisar.
   *
   * @return the string
   */
  public abstract String avisar();
}
