/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.registro;

import java.util.LinkedList;
import java.util.ListIterator;

public class Registro {

  private int numeroRegistros;
  private LinkedList<Suceso> registro;

  public Registro(int tamanho) {
    this.numeroRegistros = tamanho;
    this.registro = new LinkedList<Suceso>();
  }

  public int getNumeroRegistros() {
    return this.numeroRegistros;
  }

  /**
   * set numeroRegistros.
   * 
   * @param tam tam
   */
  
  public void setNumeroRegistros(int tam) {
    if (this.numeroRegistros > tam) {
      int cant;
      for (cant = 0; cant < (this.numeroRegistros - tam); cant++) {
        this.registro.removeFirst();
      }
    }
    this.numeroRegistros = tam;
  }

  /**
   * añade suceso.
   * 
   * @param suceso suceso
   */
  
  public void addSuceso(Suceso suceso) {
    this.registro.add(suceso);
    if (this.registro.size() > this.numeroRegistros) {
      this.registro.removeFirst();
    }
  }

  /**
   * Crea un informe.
   * 
   * @return String
   */
  
  public String informe() {
    ListIterator<Suceso> aux = registro.listIterator();
    StringBuilder sb = new StringBuilder();
    while (aux.hasNext()) {
      sb.append(aux.next().toString());
    }
    return (new String(sb));
  }

  public void borrar() {
    this.registro.removeAll(registro);
  }

  LinkedList<Suceso> getRegistro() {
    return registro;
  }

}
