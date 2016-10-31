/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.alarma;

import vvs.piscinas.PiscinaRelax;

import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Class AlarmaNivelSales.
 */
public class AlarmaNivelSales extends Alarma {
  
  /** The maximo. */
  final float maximo;
  
  /** The minimo. */
  final float minimo;

  /**
   * Instantiates a new AlarmaNivelSales.
   *
   * @param max
   *            sales
   * @param min
   *            sales
   */
  
  public AlarmaNivelSales(float max, float min) {
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
    PiscinaRelax piscina = (PiscinaRelax) obs;
    if (piscina.lanzarAlarmas()) {
      StringBuilder sb = new StringBuilder();
      sb.append("# Alarma en piscina \"" + piscina.getNombre() + "\" ("
          + piscina.getEstado().toString() + "), ubicada en \"" + piscina.getUbicacion() + "\".\n");
      if (piscina.getNivelSales() > this.maximo) {
        sb.append("# Parámetro \"NivelSales\", excede de " + this.maximo + ", numero actual: "
            + piscina.getNivelSales() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        return;
      }
      if (piscina.getNivelSales() < this.minimo) {
        sb.append("# Parámetro \"NivelSales\", inferior a " + this.minimo + ", numero actual: "
            + piscina.getNivelSales() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        return;
      }
    }
  }

}
