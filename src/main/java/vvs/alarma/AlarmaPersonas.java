
package vvs.alarma;

import vvs.piscinas.Activa;
import vvs.piscinas.Piscina;

import java.util.Observable;

/**
 * The Class AlarmaPersonas.
 */
public class AlarmaPersonas extends Alarma {

  /** The numero maximo. */
  int numeroMaximo;
  
  /**
   * Instantiates a new AlarmaPersonas.
   *
   * @param max
   *            personas
   */
  public AlarmaPersonas(int max) {
    this.numeroMaximo = max;
  }

  /* (non-Javadoc)
   * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
   */
  @Override
  public void update(Observable obs, Object arg) {
    Piscina piscina = (Piscina) obs;
    StringBuilder sb = new StringBuilder();
    sb.append("# Alarma en piscina \"" + piscina.getNombre() + "\" ("
        + piscina.getEstado().toString() + "), ubicada en \"" + piscina.getUbicacion() + "\".\n");
    if (piscina.getPersonas() > this.numeroMaximo) {
      sb.append("# Parámetro \"personas\", exceden de " + this.numeroMaximo + ", numero actual: "
          + piscina.getPersonas() + "\n");
      sb.append(super.avisar());
      registro.add(new String(sb));
      return;
    }
    if ((piscina.getPersonas() != 0) && (piscina.getEstado() != Activa.getInstancia())) {
      sb.append("# Parámetro \"personas\", exceden de 0 en fase de "
          + piscina.getEstado().toString() + ", numero actual: " + piscina.getPersonas() + "\n");
      sb.append(super.avisar());
      registro.add(new String(sb));
      return;
    }
  }

}
