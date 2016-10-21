/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.plantilla;

public abstract class Empleado {

  public enum Genero {

    H, M
  }

  private final String nombre;
  private final Genero genero;

  public Empleado(String nombre, Genero genero) {
    this.nombre = nombre;
    this.genero = genero;
  }

  public String getNombre() {
    return nombre;
  }

  protected String getAvisadoGenero() {
    if (this.genero == Genero.H) {
      return ("Avisado");
    } else {
      return ("Avisada");
    }
  }

  public abstract String avisar();
}
