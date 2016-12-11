/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.plantilla;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Class Plantilla.
 */
public class Plantilla {

  /** The empleados. */
  private List<Empleado> empleados;
  
  /** The equipos. */
  private List<Equipo> equipos;

  /**
   * Instantiates a new plantilla.
   */
  public Plantilla() {
    empleados = new ArrayList<Empleado>();
    equipos = new ArrayList<Equipo>();
  }

  /**
   * Gets the empleados.
   *
   * @return the empleados
   */
  public List<Empleado> getEmpleados() {
    return empleados;
  }

  /**
   * Sets the empleados.
   *
   * @param empleados the new empleados
   */
  public void setEmpleados(List<Empleado> empleados) {
    this.empleados = empleados;
  }

  /**
   * Gets the equipos.
   *
   * @return the equipos
   */
  public List<Equipo> getEquipos() {
    return equipos;
  }

  /**
   * Sets the equipos.
   *
   * @param equipos the new equipos
   */
  public void setEquipos(List<Equipo> equipos) {
    this.equipos = equipos;
  }

  /**
   * Añade empleado.
   * 
   * @param empleado empleado
   */
  
  public void addEmpleado(Empleado empleado) {
    if (!empleados.contains(empleado)) {
      empleados.add(empleado);
    }
  }

  /**
   * Añade equipo.
   * 
   * @param equipo equipo
   */
  
  public void addEquipo(Equipo equipo) {
    if (!equipos.contains(equipo)) {
      equipos.add(equipo);
    }
  }

  /**
   * Avisar al equipo y empleados.
   * 
   * @return String
   */
  
  public String avisar() {
    Iterator<Empleado> aux = empleados.listIterator();
    Iterator<Equipo> aux1 = equipos.listIterator();
    StringBuilder sb = new StringBuilder("");
    while (aux.hasNext()) {
      sb.append(aux.next().avisar());
    }
    while (aux1.hasNext()) {
      sb.append(aux1.next().avisar());
    }
    return (new String(sb));
  }

}
