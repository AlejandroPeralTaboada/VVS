
package vvs.sensor;

import vvs.piscinas.Piscina;

/**
 * The Class SensorPersonas.
 */
public class SensorPersonas implements Sensor {

  /** The piscina. */
  private Piscina piscina;

  /**
   * Instantiates a new sensor personas.
   *
   * @param piscina the piscina
   */
  public SensorPersonas(Piscina piscina) {
    this.piscina = piscina;
  }

  /**
   * Medir personas.
   *
   * @param personas the personas
   */
  public void medirPersonas(int personas) {
    this.piscina.setPersonas(personas);
  }

  /* (non-Javadoc)
   * @see vvs.sensor.Sensor#getPiscina()
   */
  @Override
  public Piscina getPiscina() {
    return piscina;
  }
  
  /* (non-Javadoc)
   * @see vvs.sensor.Sensor#setPiscina(vvs.piscinas.Piscina)
   */
  @Override
  public void setPiscina(Piscina piscina) {
    this.piscina = piscina;
  }
}
