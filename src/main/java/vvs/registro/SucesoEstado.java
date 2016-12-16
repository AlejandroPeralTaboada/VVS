
package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Class SucesoEstado.
 */
public class SucesoEstado implements Suceso {

  /** The momento. */
  final Date momento;
  
  /** The inicio. */
  String inicio;
  
  /** The fin. */
  String fin;

  /**
   * Instancia un estado del suceso.
   * 
   * @param inicio inicio
   * @param fin fin
   * 
   */
  
  public SucesoEstado(String inicio, String fin) {
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
        + " Cambio de fase de \"" + inicio + "\" a \"" + fin + "\"\n";
  }
}
