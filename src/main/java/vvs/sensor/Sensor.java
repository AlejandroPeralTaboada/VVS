
package vvs.sensor;

import vvs.piscinas.Piscina;

/**
 * The Interface Sensor.
 */
public interface Sensor {
  
  /**
   * Gets the piscina.
   *
   * @return the piscina
   */
  public Piscina getPiscina();
  
  /**
   * Sets the piscina.
   *
   * @param piscina the new piscina
   */
  public void setPiscina(Piscina piscina);
}
