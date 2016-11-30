
package vvs.sensor;

import vvs.piscinas.Piscina;

/**
 * The Class SensorTemperatura.
 */
public class SensorTemperatura implements Sensor {

  /** The piscina. */
  private Piscina piscina;

  /**
   * Instantiates a new sensor temperatura.
   *
   * @param piscina the piscina
   */
  public SensorTemperatura(Piscina piscina) {
    this.piscina = piscina;
  }

  /**
   * Medir temperatura.
   *
   * @param nivel the nivel
   */
  public void medirTemperatura(float nivel) {
    this.piscina.setTemperatura(nivel);
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
