/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.piscinas;

import vvs.registro.SucesoEstado;

/**
 * The Class Evacuacion.
 */
public class Evacuacion implements EstadoPiscina {

	/** The Constant instancia. */
	private static final Evacuacion instancia = new Evacuacion();

	/**
	 * Instantiates a new evacuacion.
	 */
	private Evacuacion() {
	}

	/**
	 * Gets the instancia.
	 *
	 * @return the instancia
	 */
	public static Evacuacion getInstancia() {
		return instancia;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Evacuación";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#activar(vvs.piscinas.Piscina)
	 */
	@Override
	public void activar(Piscina piscina) {
		System.out.println("La piscina está en evacuación");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#evacuar(vvs.piscinas.Piscina)
	 */
	@Override
	public void evacuar(Piscina piscina) {
		System.out.println("La piscina ya está en evacuación");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#cerrar(vvs.piscinas.Piscina)
	 */
	@Override
	public void cerrar(Piscina piscina) {
		System.out.println("La piscina debe acabar de ser evacuada");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#mantenimiento(vvs.piscinas.Piscina)
	 */
	@Override
	public void mantenimiento(Piscina piscina) {
		if (piscina.getPersonas() == 0) {
			piscina.getRegistro().addSuceso((new SucesoEstado("Evacuar", "Mantenimiento")));
			piscina.setEstado(Mantenimiento.getInstancia());
		} else {
			System.out.println("La piscina debe acabar de ser evacuada");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#registrarParametros(vvs.piscinas.Piscina)
	 */
	@Override
	public boolean registrarParametros(Piscina piscina) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#notificarPersonas(vvs.piscinas.Piscina)
	 */
	@Override
	public void notificarPersonas(Piscina piscina) {
		if (piscina.getPersonas() == 0) {
			piscina.getRegistro().addSuceso((new SucesoEstado("Evacuación", "Mantenimiento")));
			piscina.setEstado(Mantenimiento.getInstancia());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#saltarAlarmaNiveles(vvs.piscinas.Piscina)
	 */
	@Override
	public boolean saltarAlarmaNiveles(Piscina piscina) {
		return (false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * vvs.piscinas.EstadoPiscina#saltarAlarmaPersonas(vvs.piscinas.Piscina)
	 */
	@Override
	public boolean saltarAlarmaPersonas(Piscina piscina) {
		return (true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see vvs.piscinas.EstadoPiscina#lanzarAlarmas(vvs.piscinas.Piscina)
	 */
	@Override
	public boolean lanzarAlarmas(Piscina piscina) {
		return false;
	}
}
