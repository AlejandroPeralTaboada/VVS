package vvs.piscinas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EstadosTest {

	// LAS PISCINAS COMIENZAN SIEMPRE EN MODO EVACUAR
	// ESTADO INICIAL ACTIVA
	@Test
	public void PR_UN_Estados_001() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.activar();
		assertEquals(Activa.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_002() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.mantenimiento();
		assertEquals(Activa.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_003() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.cerrar();
		assertEquals(Activa.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_004() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.evacuar();
		assertEquals(Evacuacion.class, piscina.getEstado().getClass());
	}

	// ESTADO INICIAL CERRADA
	@Test
	public void PR_UN_Estados_005() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.cerrar();
		piscina.activar();
		assertEquals(Cerrada.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_006() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.cerrar();
		piscina.mantenimiento();
		assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_007() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.cerrar();
		piscina.cerrar();
		assertEquals(Cerrada.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_008() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.cerrar();
		piscina.evacuar();
		assertEquals(Cerrada.class, piscina.getEstado().getClass());
	}

	// ESTADO INICIAL MANTENIMIENTO
	@Test
	public void PR_UN_Estados_009() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		assertEquals(Activa.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_010() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.mantenimiento();
		assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_011() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.cerrar();
		assertEquals(Cerrada.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_012() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.evacuar();
		assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
	}

	// ESTADO INICIAL EVACUACION
	@Test
	public void PR_UN_Estados_013() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.evacuar();
		piscina.activar();
		assertEquals(Evacuacion.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_014() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.setPersonas(10);
		piscina.evacuar();
		assertEquals(Evacuacion.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_015() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.evacuar();
		assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_016() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.setPersonas(10);
		piscina.evacuar();
		piscina.setPersonas(0);
		assertEquals(Mantenimiento.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_017() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.evacuar();
		piscina.cerrar();
		assertEquals(Evacuacion.class, piscina.getEstado().getClass());
	}

	@Test
	public void PR_UN_Estados_018() {
		Piscina piscina = new PiscinaImp("", "");
		piscina.activar();
		piscina.evacuar();
		piscina.mantenimiento();
		assertEquals(Evacuacion.class, piscina.getEstado().getClass());
	}
}
