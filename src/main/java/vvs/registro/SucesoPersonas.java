/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

// TODO: Auto-generated Javadoc
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
    return ("- " + new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(momento)
        + " Parametro \"personas\" cambia de " + inicio + " a " + fin + "\n");
  }

}
