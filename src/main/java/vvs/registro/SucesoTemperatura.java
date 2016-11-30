
package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class SucesoTemperatura.
 */
public class SucesoTemperatura implements Suceso {

  /** The momento. */
  final Date momento;
  
  /** The inicio. */
  float inicio;
  
  /** The fin. */
  float fin;

  /**
   * Instancia un sensor de temperatura.
   * 
   * @param inicio inicio
   * @param fin fin 
   */
  
  public SucesoTemperatura(float inicio, float fin) {
    momento = new Date();
    this.inicio = inicio;
    this.fin = fin;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return ("- " + new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(momento)
        + " Parametro \"temperatura\" cambia de " + inicio + "º a " + fin + "º\n");
  }

}
