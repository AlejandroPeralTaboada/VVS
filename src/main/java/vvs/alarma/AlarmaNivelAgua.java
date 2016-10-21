/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.alarma;


import vvs.piscinas.Piscina;

import java.util.Observable;

public class AlarmaNivelAgua extends Alarma {

  final float maximo;
  final float minimo;

  /**
   * Instantiates a new AlarmaNivelAgua.
   *
   * @param max
   *            agua
   * @param min
   *            agua
   */
  
  public AlarmaNivelAgua(float max, float min) {
    if ((max < min) || (min < 0)) {
      throw new IllegalArgumentException();
    }
    this.maximo = max;
    this.minimo = min;
  }

  @Override
  public void update(Observable obs, Object arg) {
    Piscina piscina = (Piscina) obs;
    if (piscina.lanzarAlarmas()) {
      StringBuilder sb = new StringBuilder();
      sb.append("# Alarma en piscina \"" + piscina.getNombre() + "\" ("
          + piscina.getEstado().toString() + "), ubicada en \"" + piscina.getUbicacion() + "\".\n");
      if (piscina.getNivelAgua() > this.maximo) {
        sb.append("# Parámetro \"NivelAgua\", excede de " + this.maximo + ", numero actual: "
            + piscina.getNivelAgua() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        return;
      }
      if (piscina.getNivelAgua() < this.minimo) {
        sb.append("# Parámetro \"NivelAgua\", inferior a " + this.minimo + ", numero actual: "
            + piscina.getNivelAgua() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        return;
      }
    }
  }

}
