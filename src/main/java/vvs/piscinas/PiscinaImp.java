/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vvs.piscinas;

import java.util.ArrayList;
import java.util.Date;

import vvs.registro.Registro;
import vvs.registro.Suceso;
import vvs.registro.SucesoNivelAgua;
import vvs.registro.SucesoNivelCloro;
import vvs.registro.SucesoPersonas;
import vvs.registro.SucesoTemperatura;
import vvs.sensor.Sensor;

/**
 *
 * @author alejandro.peral
 */
public class PiscinaImp extends Piscina {

	// --------------------------CONSTRUCTOR-------------------------------
	public PiscinaImp(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.registro = new Registro(10);
		this.estado = Mantenimiento.getInstancia();
		this.sensores = new ArrayList<Sensor>();
	}
	// --------------------------SETTERS------------------------------------

	private boolean checkWrongParameter(float newParam, float existent) {
		if (newParam < 0) {
			throw new IllegalArgumentException();
		}
		return (newParam == existent);
	}

	private void changeAndRegister(Suceso suceso) {
		this.setChanged();
		this.notifyObservers();
		if (estado.registrarParametros(this)) {
			registro.addSuceso(suceso);
		}
	}

	public void setNivelAgua(float nivel) {
		if (checkWrongParameter(nivel, this.nivelAgua)) {
			return;
		}
		Suceso suceso = new SucesoNivelAgua(this.nivelAgua, nivel);
		this.nivelAgua = nivel;
		changeAndRegister(suceso);
	}

	public void setTemperatura(float temperatura) {
		if (checkWrongParameter(temperatura, this.temperatura)) {
			return;
		}
		Suceso suceso = new SucesoTemperatura(this.temperatura, temperatura);
		this.temperatura = temperatura;
		changeAndRegister(suceso);
	}

	public void setNivelCloro(float nivel) {
		if (checkWrongParameter(nivel, this.nivelAgua)) {
			return;
		}
		Suceso suceso = new SucesoNivelCloro(this.nivelCloro, nivel);
		this.nivelCloro = nivel;
		changeAndRegister(suceso);
	}

	public void setNivelPH(float nivel) {
		if (checkWrongParameter(nivel, this.nivelAgua)) {
			return;
		}
		Suceso suceso = new SucesoNivelCloro(this.nivelPH, nivel);
		this.nivelPH = nivel;
		changeAndRegister(suceso);
	}

	public void setPersonas(int personas) {
		if (personas < 0) {
			throw new IllegalArgumentException();
		}
		Suceso suceso = new SucesoPersonas(this.personas, personas);
		this.personas = personas;
		changeAndRegister(suceso);
		estado.notificarPersonas(this);
	}

	public void setEstado(EstadoPiscina estado) {
		this.estado = estado;
	}

	// --------------------------INHERITED METHODS--------------------------

	@Override
	public void regsitrarNuevoSuceso(Suceso suceso) {
		this.registro.addSuceso(suceso);
	}

	@Override
	public String informe() {
		StringBuilder sb = new StringBuilder();
		sb.append("# Informe de piscina \"" + this.getNombre() + "\", ubicada en \"" + this.getUbicacion() + "\".\n");
		Date llamada = new Date();
		sb.append("# Generado el " + llamada.toString() + "\n");
		sb.append(this.registro.informe());
		sb.append("# Fase actual: " + this.getEstado().toString() + "\n");
		return new String(sb);
	}

	public void activar() {
		this.estado.activar(this);
	}

	public void cerrar() {
		this.estado.cerrar(this);
	}

	public void evacuar() {
		this.estado.evacuar(this);
	}

	public void mantenimiento() {
		this.estado.mantenimiento(this);
	}

	public boolean lanzarAlarmas() {
		return this.estado.lanzarAlarmas(this);
	}

	public void addSensor(Sensor sensor) {
		if ((sensor != null) && (!this.sensores.contains(sensor)) && (sensor.getPiscina() == this)) {
			this.sensores.add(sensor);
		} else {
			throw new IllegalArgumentException();
		}

	}
}
