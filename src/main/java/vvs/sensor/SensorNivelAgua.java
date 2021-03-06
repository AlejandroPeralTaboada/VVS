
package vvs.sensor;

import vvs.piscinas.Piscina;

/**
 * The Class SensorNivelAgua.
 */
public class SensorNivelAgua implements Sensor {

  /** The piscina. */
  private Piscina piscina;

  /**
   * Instancia sensor nivel agua.
   * 
   * @param piscina piscina
   */
  
  public SensorNivelAgua(Piscina piscina) {
    if (piscina == null) {
      throw new IllegalArgumentException();
    }
    this.piscina = piscina;
  }

  /**
   * Medir nivel agua.
   *
   * @param nivel the nivel
   */
  public void medirNivelAgua(float nivel) {
    this.piscina.setNivelAgua(nivel);
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
