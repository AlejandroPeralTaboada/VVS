/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.registro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SucesoNivelSales implements Suceso {

  final Date momento;
  float inicio;
  float fin;

  /**
   * Instancia sensor nivel sales.
   * 
   * @param inicio inicio
   * @param fin fin 
   */
  
  public SucesoNivelSales(float inicio, float fin) {
    momento = new Date();
    this.inicio = inicio;
    this.fin = fin;
  }

  @Override
  public String toString() {
    return ("- " + new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(momento)
        + " Parametro \"nivel de sales en el agua\" cambia de " + inicio + " a " + fin + "\n");
  }

}
