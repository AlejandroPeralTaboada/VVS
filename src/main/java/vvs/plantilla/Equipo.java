
package vvs.plantilla;

/**
 * The Class Equipo.
 */
public class Equipo {

  /** The nombre. */
  private final String nombre;
  
  /** The plantilla. */
  private Plantilla plantilla;

  /**
   * Instantiates a new equipo.
   *
   * @param nombre the nombre
   */
  public Equipo(String nombre) {
    this.nombre = nombre;
    plantilla = new Plantilla();
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
   * Sets the empleado.
   *
   * @param empleado the new empleado
   */
  public void setEmpleado(Empleado empleado) {
    plantilla.addEmpleado(empleado);
  }

  /**
   * Sets the equipo.
   *
   * @param equipo the new equipo
   */
  public void setEquipo(Equipo equipo) {
    plantilla.addEquipo(equipo);
  }

  /**
   * Avisar al equipo.
   * 
   * @return String
   */
  
  public String avisar() {

    StringBuilder sb = new StringBuilder();
    sb.append("* Avisado equipo \"" + this.getNombre() + "\"\n");
    sb.append(plantilla.avisar());
    return new String(sb);
  }

}
