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


public abstract class Alarma implements Observer {

  private Plantilla plantilla;
  protected List<String> registro;

  public Alarma() {
    plantilla = new Plantilla();
    registro = new LinkedList<String>();
  }

  public Plantilla getPlantilla() {
    return plantilla;
  }

  public void setPlantilla(Plantilla plantilla) {
    this.plantilla = plantilla;
  }

  public List<String> getRegistro() {
    return registro;
  }

  public void setRegistro(List<String> registro) {
    this.registro = registro;
  }

  public void addResponsable(Equipo equipo) {
    plantilla.addEquipo(equipo);
  }

  public void addResponsable(Empleado empleado) {
    plantilla.addEmpleado(empleado);
  }

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
