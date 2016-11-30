
package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class SucesoNivelCloro.
 */
public class SucesoNivelCloro implements Suceso {

  /** The momento. */
  final Date momento;
  
  /** The inicio. */
  float inicio;
  
  /** The fin. */
  float fin;

  /**
   * Instancia suceso nivel cloro.
   * 
   * @param inicio inicio
   * @param fin fin 
   */
  
  public SucesoNivelCloro(float inicio, float fin) {
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
        + " Parametro \"nivel de cloro\" cambia de " + inicio + " a " + fin + "\n";
  }

}
