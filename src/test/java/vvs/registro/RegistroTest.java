package vvs.registro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RegistroTest {

	@Mock
	private Suceso suceso;

	@Test
	public void PR_UN_Registro_001() {
		Registro registro = new Registro(0);
		registro.addSuceso(suceso);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	// @Test
	public void PR_UN_Registro_002() {
		Registro registro = new Registro(-1);
		registro.addSuceso(suceso);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_003() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		boolean result = (registro.getRegistro().size() == 1 && registro.getNumeroRegistros() == 1);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_004() {
		Registro registro = new Registro(10);
		for (int i = 0; i < 10; i++) {
			registro.addSuceso(suceso);
		}
		boolean result = (registro.getRegistro().size() == 10 && registro.getNumeroRegistros() == 10);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_005() {
		Registro registro = new Registro(0);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(0);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_006() {
		Registro registro = new Registro(-1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(0);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_007() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(0);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	// @Test
	public void PR_UN_Registro_008() {
		Registro registro = new Registro(0);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(-1);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	// @Test
	public void PR_UN_Registro_009() {
		Registro registro = new Registro(-1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(-1);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	// @Test
	public void PR_UN_Registro_010() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(-1);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_011() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(0);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	// @Test
	public void PR_UN_Registro_012() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(-1);
		boolean result = (registro.getRegistro().size() == 0 && registro.getNumeroRegistros() == 0);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_013() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(1);
		boolean result = (registro.getRegistro().size() == 1 && registro.getNumeroRegistros() == 1);
		assertTrue(result);
	}

	@Test
	public void PR_UN_Registro_014() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		registro.setNumeroRegistros(2);
		boolean result = (registro.getRegistro().size() == 1 && registro.getNumeroRegistros() == 2);
		assertTrue(result);
	}

}
