/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.plantilla;

import vvs.piscinas.Piscina;

// TODO: Auto-generated Javadoc
/**
 * The Class Encargado.
 */
public class Encargado extends Empleado {

  /**
   * Instantiates a new encargado.
   *
   * @param nombre the nombre
   * @param genero the genero
   */
  public Encargado(String nombre, Genero genero) {
    super(nombre, genero);
  }

  /* (non-Javadoc)
   * @see vvs.plantilla.Empleado#avisar()
   */
  @Override
  public String avisar() {
    return ("- " + this.getAvisadoGenero() + "\"" + this.getNombre() + "\" " + "(encargado)\n");
  }

  /**
   * Activa.
   *
   * @param piscina the piscina
   */
  public void activa(Piscina piscina) {
    piscina.activar();
  }

  /**
   * Mantenimiento.
   *
   * @param piscina the piscina
   */
  public void mantenimiento(Piscina piscina) {
    piscina.mantenimiento();
  }

  /**
   * Cerrar.
   *
   * @param piscina the piscina
   */
  public void cerrar(Piscina piscina) {
    piscina.cerrar();
  }

  /**
   * Evacuar.
   *
   * @param piscina the piscina
   */
  public void evacuar(Piscina piscina) {
    piscina.evacuar();
  }
}
