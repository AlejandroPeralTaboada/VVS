
package vvs.alarma;


import vvs.piscinas.Piscina;

import java.util.Observable;

/**
 * The Class AlarmaNivelAgua.
 */
public class AlarmaNivelAgua extends Alarma {

  /** The maximo. */
  final float maximo;
  
  /** The minimo. */
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