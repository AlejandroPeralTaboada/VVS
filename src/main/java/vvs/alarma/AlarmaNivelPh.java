/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.alarma;

import vvs.piscinas.Piscina;

import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Class AlarmaNivelPh.
 */
public class AlarmaNivelPh extends Alarma {

  /** The maximo. */
  final float maximo;
  
  /** The minimo. */
  final float minimo;

  /**
   * Instantiates a new AlarmaNivelPh.
   *
   * @param max
   *            ph
   * @param min
   *            ph
   */
  public AlarmaNivelPh(float max, float min) {
    if ((max < min) || (min < 0)) {
      throw new IllegalArgumentException();
    }
    this.maximo = max;
    this.minimo = min;
  }

  /* (non-Javadoc)
   * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
   */
  @Override
  public void update(Observable obs, Object arg) {
    Piscina piscina = (Piscina) obs;
    if (piscina.lanzarAlarmas()) {
      StringBuilder sb = new StringBuilder();
      sb.append("# Alarma en piscina \"" + piscina.getNombre() + "\" ("
          + piscina.getEstado().toString() + "), ubicada en \"" + piscina.getUbicacion() + "\".\n");
      if (piscina.getNivelPh() > this.maximo) {
        sb.append("# Parámetro \"NivelPH\", excede de " + this.maximo + ", numero actual: "
            + piscina.getNivelPh() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        return;
      }
      if (piscina.getNivelPh() < this.minimo) {
        sb.append("# Parámetro \"NivelPH\", inferior a " + this.minimo + ", numero actual: "
            + piscina.getNivelPh() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        return;
      }
    }
  }

}
