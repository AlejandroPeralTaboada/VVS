
package vvs.registro;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * The Class Registro.
 */
public class Registro {

  /** The numero registros. */
  private int numeroRegistros;
  
  /** The registro. */
  private LinkedList<Suceso> regis;

  /**
   * Instantiates a new regis.
   *
   * @param tamanho the tamanho
   */
  public Registro(int tamanho) {
    this.numeroRegistros = tamanho;
    if (this.numeroRegistros < 0) {
      this.numeroRegistros = 0;
    }
    this.regis = new LinkedList<>();
  }

  /**
   * Gets the numero registros.
   *
   * @return the numero registros
   */
  public int getNumeroRegistros() {
    return this.numeroRegistros;
  }

  /**
   * set numeroRegistros.
   * 
   * @param tam
   *          tam
   */

  public void setNumeroRegistros(int tam) {

    if (this.numeroRegistros > tam) {
      int cant;
      for (cant = 0; cant < (this.numeroRegistros - tam); cant++) {
        if (this.regis.isEmpty()) {
          break;
        }
        this.regis.removeFirst();
      }
    }
    this.numeroRegistros = tam;
    if (this.numeroRegistros < 0) {
      this.numeroRegistros = 0;
    }
  }

  /**
   * añade suceso.
   * 
   * @param suceso
   *          suceso
   */

  public void addSuceso(Suceso suceso) {
    this.regis.add(suceso);
    if (this.regis.size() > this.numeroRegistros) {
      this.regis.removeFirst();
    }
  }

  /**
   * Crea un informe.
   * 
   * @return String
   */

  public String informe() {
    ListIterator<Suceso> aux = regis.listIterator();
    StringBuilder sb = new StringBuilder();
    while (aux.hasNext()) {
      sb.append(aux.next().toString() + " ");
    }
    return remove(new String(sb));
  }

  /**
   * Removes the.
   *
   * @param str the str
   * @return the string
   */
  public String remove(String str) {
    String strin = str;
    if (str != null && str.length() > 0) {
      strin = str.substring(0, str.length() - 1);
    }
    return strin;
  }

  /**
   * Borrar.
   */
  public void borrar() {
    this.regis.removeAll(regis);
  }

  /**
   * Gets the registro.
   *
   * @return the registro
   */
  LinkedList<Suceso> getRegistro() {
    return regis;
  }

}
