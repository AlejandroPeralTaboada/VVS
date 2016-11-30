
package vvs.piscinas;

import vvs.registro.SucesoEstado;

/**
 * The Class Mantenimiento.
 */
public class Mantenimiento implements EstadoPiscina {

  /** The Constant instancia. */
  private static final Mantenimiento instancia = new Mantenimiento();
  private static final String MANTEN = "Mantenimiento";

  /**
   * Instantiates a new mantenimiento.
   */
  private Mantenimiento() {}

  /**
   * Gets the instancia.
   *
   * @return the instancia
   */
  public static Mantenimiento getInstancia() {
    return instancia;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return MANTEN;
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#activar(vvs.piscinas.Piscina)
   */
  @Override
  public void activar(Piscina piscina) {
    piscina.getRegistro().addSuceso(new SucesoEstado(MANTEN, "Activa"));
    piscina.setEstado(Activa.getInstancia());
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#evacuar(vvs.piscinas.Piscina)
   */
  @Override
  public void evacuar(Piscina piscina) {
    System.out.println("La piscina está en mantenimiento");
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#cerrar(vvs.piscinas.Piscina)
   */
  @Override
  public void cerrar(Piscina piscina) {
    piscina.getRegistro().addSuceso((new SucesoEstado("Mantenimiento", "Cerrada")));
    piscina.setEstado(Cerrada.getInstancia());
    piscina.getRegistro().borrar();
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#mantenimiento(vvs.piscinas.Piscina)
   */
  @Override
  public void mantenimiento(Piscina piscina) {
    System.out.println("La piscina ya está en mantenimiento");
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#registrarParametros(vvs.piscinas.Piscina)
   */
  @Override
  public boolean registrarParametros(Piscina piscina) {
    return false;
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#notificarPersonas(vvs.piscinas.Piscina)
   */
  @Override
  public void notificarPersonas(Piscina piscina) {
    /* this method is empty. */
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#saltarAlarmaNiveles(vvs.piscinas.Piscina)
   */
  @Override
  public boolean saltarAlarmaNiveles(Piscina piscina) {
    return false;
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#saltarAlarmaPersonas(vvs.piscinas.Piscina)
   */
  @Override
  public boolean saltarAlarmaPersonas(Piscina piscina) {
    return true;
  }

  /* (non-Javadoc)
   * @see vvs.piscinas.EstadoPiscina#lanzarAlarmas(vvs.piscinas.Piscina)
   */
  @Override
  public boolean lanzarAlarmas(Piscina piscina) {
    return false;
  }
}
