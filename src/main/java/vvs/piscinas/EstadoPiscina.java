
package vvs.piscinas;

import vvs.piscinas.Piscina;

/**
 * The Interface EstadoPiscina.
 */
public interface EstadoPiscina {

  /**
   * Registrar parametros.
   *
   * @param piscina the piscina
   * @return true, if successful
   */
  public boolean registrarParametros(Piscina piscina);

  /**
   * Saltar alarma niveles.
   *
   * @param piscina the piscina
   * @return true, if successful
   */
  public boolean saltarAlarmaNiveles(Piscina piscina);

  /**
   * Saltar alarma personas.
   *
   * @param piscina the piscina
   * @return true, if successful
   */
  public boolean saltarAlarmaPersonas(Piscina piscina);

  /**
   * Activar.
   *
   * @param piscina the piscina
   */
  public void activar(Piscina piscina);

  /**
   * Evacuar.
   *
   * @param piscina the piscina
   */
  public void evacuar(Piscina piscina);

  /**
   * Cerrar.
   *
   * @param piscina the piscina
   */
  public void cerrar(Piscina piscina);

  /**
   * Mantenimiento.
   *
   * @param piscina the piscina
   */
  public void mantenimiento(Piscina piscina);

  /**
   * Notificar personas.
   *
   * @param piscina the piscina
   */
  public void notificarPersonas(Piscina piscina);

  /**
   * Lanzar alarmas.
   *
   * @param piscina the piscina
   * @return true, if successful
   */
  public boolean lanzarAlarmas(Piscina piscina);
}
