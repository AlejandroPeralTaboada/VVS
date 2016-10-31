/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.alarma;

import vvs.plantilla.Empleado;
import vvs.plantilla.Equipo;
import vvs.plantilla.Plantilla;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Observer;


// TODO: Auto-generated Javadoc
/**
 * The Class Alarma.
 */
public abstract class Alarma implements Observer {

  /** The plantilla. */
  private Plantilla plantilla;
  
  /** The registro. */
  protected List<String> registro;

  /**
   * Instantiates a new alarma.
   */
  public Alarma() {
    plantilla = new Plantilla();
    registro = new LinkedList<String>();
  }

  /**
   * Gets the plantilla.
   *
   * @return the plantilla
   */
  public Plantilla getPlantilla() {
    return plantilla;
  }

  /**
   * Sets the plantilla.
   *
   * @param plantilla the new plantilla
   */
  public void setPlantilla(Plantilla plantilla) {
    this.plantilla = plantilla;
  }

  /**
   * Gets the registro.
   *
   * @return the registro
   */
  public List<String> getRegistro() {
    return registro;
  }

  /**
   * Sets the registro.
   *
   * @param registro the new registro
   */
  public void setRegistro(List<String> registro) {
    this.registro = registro;
  }

  /**
   * Adds the responsable.
   *
   * @param equipo the equipo
   */
  public void addResponsable(Equipo equipo) {
    plantilla.addEquipo(equipo);
  }

  /**
   * Adds the responsable.
   *
   * @param empleado the empleado
   */
  public void addResponsable(Empleado empleado) {
    plantilla.addEmpleado(empleado);
  }

  /**
   * Avisar.
   *
   * @return the string
   */
  protected String avisar() {
    return (plantilla.avisar());
  }
  
  /**
   *  Create a inform.
   *
   * @return string
   *            
   */
  
  public String informe() {
    ListIterator<String> aux = registro.listIterator();
    StringBuilder sb = new StringBuilder();
    while (aux.hasNext()) {
      sb.append(aux.next().toString());
    }
    return (new String(sb));
  }

}
