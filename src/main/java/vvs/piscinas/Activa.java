/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.piscinas;

import vvs.registro.SucesoEstado;

// TODO: Auto-generated Javadoc
/**
 * The Class Activa.
 */
public class Activa implements EstadoPiscina {

  /** The Constant instancia. */
  private static final Activa instancia = new Activa();

  /**
   * Instantiates a new activa.
   */
  private Activa() {
  }

  /**
   * Gets the instancia.
   *
   * @return the instancia
   */
  public static Activa getInstancia() {
    return instancia;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Activa";
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#activar(vvs.piscinas.Piscina)
   */
  @Override
  public void activar(Piscina piscina) {
    System.out.println("La piscina ya esta activada");
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#evacuar(vvs.piscinas.Piscina)
   */
  @Override
  public void evacuar(Piscina piscina) {
    piscina.getRegistro().addSuceso((new SucesoEstado("Activa", "Evacuación")));
    piscina.setEstado(Evacuacion.getInstancia());
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#cerrar(vvs.piscinas.Piscina)
   */
  @Override
  public void cerrar(Piscina piscina) {
    System.out.println("La piscina debe ser evacuada");
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#mantenimiento(vvs.piscinas.Piscina)
   */
  @Override
  public void mantenimiento(Piscina piscina) {
    System.out.println("La piscina debe ser evacuada");
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#registrarParametros(vvs.piscinas.Piscina)
   */
  @Override
  public boolean registrarParametros(Piscina piscina) {
    return true;
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#notificarPersonas(vvs.piscinas.Piscina)
   */
  @Override
  public void notificarPersonas(Piscina piscina) {

  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#saltarAlarmaNiveles(vvs.piscinas.Piscina)
   */
  @Override
  public boolean saltarAlarmaNiveles(Piscina piscina) {
    return (true);
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#saltarAlarmaPersonas(vvs.piscinas.Piscina)
   */
  @Override
  public boolean saltarAlarmaPersonas(Piscina piscina) {
    return (true);
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#lanzarAlarmas(vvs.piscinas.Piscina)
   */
  @Override
  public boolean lanzarAlarmas(Piscina piscina) {
    return true;
  }

}
