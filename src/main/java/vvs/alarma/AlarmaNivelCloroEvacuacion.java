
package vvs.alarma;

import vvs.piscinas.Piscina;

import java.util.Observable;

/**
 * The Class AlarmaNivelCloroEvacuacion.
 */
public class AlarmaNivelCloroEvacuacion extends Alarma {

  /** The maximo. */
  final float maximo;
  
  /** The minimo. */
  final float minimo;

  /**
   * Instantiates a new AlarmaNivelCloroEvacuacion.
   *
   * @param max
   *            cloro
   * @param min
   *            cloro
   */
  public AlarmaNivelCloroEvacuacion(float max, float min) {
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
      if (piscina.getNivelCloro() > this.maximo) {
        sb.append("# Parámetro \"NivelCloro\", excede de " + this.maximo + ", numero actual: "
            + piscina.getNivelCloro() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        piscina.evacuar();
        return;
      }
      if (piscina.getNivelCloro() < this.minimo) {
        sb.append("# Parámetro \"NivelCloro\", inferior a " + this.minimo + ", numero actual: "
            + piscina.getNivelCloro() + "\n");
        sb.append(super.avisar());
        registro.add(new String(sb));
        piscina.evacuar();
        return;
      }
    }
  }
}