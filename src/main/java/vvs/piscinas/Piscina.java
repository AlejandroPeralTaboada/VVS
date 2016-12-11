package vvs.piscinas;

import vvs.registro.Registro;
import vvs.sensor.Sensor;

import java.util.List;
import java.util.Observable;

/**
 * The Class Piscina.
 */
public abstract class Piscina extends Observable {

  /** The nombre. */
  String nombre;
  
  /** The ubicacion. */
  String ubicacion;
  
  /** The nivel agua. */
  float nivelAgua;
  
  /** The temperatura. */
  float temperatura;
  
  /** The nivel cloro. */
  float nivelCloro;
  
  /** The nivel ph. */
  float nivelPh;
  
  /** The personas. */
  int personas;
  
  /** The estado. */
  EstadoPiscina estado;
  
  /** The registro. */
  Registro registro;
  
  /** The sensores. */
  List<Sensor> sensores;

  // public abstract void regsitrarNuevoSuceso(Suceso suceso);

  /**
   * Informe.
   *
   * @return the string
   */
  public abstract String informe();

  /**
   * Activar.
   */
  public abstract void activar();

  /**
   * Cerrar.
   */
  public abstract void cerrar();

  /**
   * Evacuar.
   */
  public abstract void evacuar();

  /**
   * Mantenimiento.
   */
  public abstract void mantenimiento();

  /**
   * Lanzar alarmas.
   *
   * @return true, if successful
   */
  public abstract boolean lanzarAlarmas();

  /**
   * Adds the sensor.
   *
   * @param sensor the sensor
   */
  public abstract void addSensor(Sensor sensor);

  /**
   * Sets the nivel agua.
   *
   * @param nivel the new nivel agua
   */
  public abstract void setNivelAgua(float nivel);

  /**
   * Sets the temperatura.
   *
   * @param temperatura the new temperatura
   */
  public abstract void setTemperatura(float temperatura);

  /**
   * Sets the nivel cloro.
   *
   * @param nivel the new nivel cloro
   */
  public abstract void setNivelCloro(float nivel);

  /**
   * Sets the nivel ph.
   *
   * @param nivel the new nivel ph
   */
  public abstract void setNivelPh(float nivel);

  /**
   * Sets the personas.
   *
   * @param personas the new personas
   */
  public abstract void setPersonas(int personas);

  /**
   * Gets the registro.
   *
   * @return the registro
   */
  public Registro getRegistro() {
    return registro;
  }

  /**
   * Gets the nombre.
   *
   * @return the nombre
   */
  public String getNombre() {
    return this.nombre;
  }

  /**
   * Gets the ubicacion.
   *
   * @return the ubicacion
   */
  public String getUbicacion() {
    return this.ubicacion;
  }

  /**
   * Gets the nivel agua.
   *
   * @return the nivel agua
   */
  public float getNivelAgua() {
    return this.nivelAgua;
  }

  /**
   * Gets the temperatura.
   *
   * @return the temperatura
   */
  public float getTemperatura() {
    return this.temperatura;
  }

  /**
   * Gets the nivel cloro.
   *
   * @return the nivel cloro
   */
  public float getNivelCloro() {
    return this.nivelCloro;
  }

  /**
   * Gets the nivel ph.
   *
   * @return the nivel ph
   */
  public float getNivelPh() {
    return this.nivelPh;
  }

  /**
   * Gets the personas.
   *
   * @return the personas
   */
  public int getPersonas() {
    return this.personas;
  }

  /**
   * Gets the estado.
   *
   * @return the estado
   */
  public EstadoPiscina getEstado() {
    return this.estado;
  }

  /**
   * Sets the estado.
   *
   * @param estado the new estado
   */
  public void setEstado(EstadoPiscina estado) {
    this.estado = estado;
  }

  /**
   * Gets the sensores.
   *
   * @return the sensores
   */
  List<Sensor> getSensores() {
    return this.sensores;
  }

}
