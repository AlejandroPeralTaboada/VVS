package vvs.piscinas;

import java.util.List;
import java.util.Observable;

import vvs.registro.Registro;
import vvs.sensor.Sensor;

public abstract class Piscina extends Observable {

  String nombre;
  String ubicacion;
  float nivelAgua;
  float temperatura;
  float nivelCloro;
  float nivelPH;
  int personas;
  EstadoPiscina estado;
  Registro registro;
  List<Sensor> sensores;

  // public abstract void regsitrarNuevoSuceso(Suceso suceso);

  public abstract String informe();

  public abstract void activar();

  public abstract void cerrar();

  public abstract void evacuar();

  public abstract void mantenimiento();

  public abstract boolean lanzarAlarmas();

  public abstract void addSensor(Sensor sensor);

  public abstract void setNivelAgua(float nivel);

  public abstract void setTemperatura(float temperatura);

  public abstract void setNivelCloro(float nivel);

  public abstract void setNivelPH(float nivel);

  public abstract void setPersonas(int personas);

  public Registro getRegistro() {
    return registro;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getUbicacion() {
    return this.ubicacion;
  }

  public float getNivelAgua() {
    return this.nivelAgua;
  }

  public float getTemperatura() {
    return this.temperatura;
  }

  public float getNivelCloro() {
    return this.nivelCloro;
  }

  public float getNivelPH() {
    return this.nivelPH;
  }

  public int getPersonas() {
    return this.personas;
  }

  public EstadoPiscina getEstado() {
    return this.estado;
  }

  public void setEstado(EstadoPiscina estado) {
    this.estado = estado;
  }

  List<Sensor> getSensores() {
    return this.sensores;
  }

}
