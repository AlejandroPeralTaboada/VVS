
package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class SucesoNivelPh.
 */
public class SucesoNivelPh implements Suceso {

  /** The momento. */
  final Date momento;
  
  /** The inicio. */
  float inicio;
  
  /** The fin. */
  float fin;

  /**
   * Instancia sensor nivel pH.
   * 
   * @param inicio inicio
   * @param fin fin 
   */
  
  public SucesoNivelPh(float inicio, float fin) {
    momento = new Date();
    this.inicio = inicio;
    this.fin = fin;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "- " + new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(momento)
        + " Parametro \"nivel de PH\" cambia de " + inicio + " a " + fin + "\n";
  }

}
