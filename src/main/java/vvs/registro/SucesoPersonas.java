
package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class SucesoPersonas.
 */
public class SucesoPersonas implements Suceso {

  /** The momento. */
  final Date momento;
  
  /** The inicio. */
  int inicio;
  
  /** The fin. */
  int fin;

  /**
   * Añade un suceso de personas.
   * 
   * @param inicio inicio
   * @param fin fin
   */
  
  public SucesoPersonas(int inicio, int fin) {
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
        + " Parametro \"personas\" cambia de " + inicio + " a " + fin + "\n";
  }

}
