package vvs.registro;

import static org.junit.Assert.assertEquals;

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
		assertEquals(registro.getRegistro().size(), 0);
	}

	@Test
	public void PR_UN_Registro_002() {
		Registro registro = new Registro(-1);
		registro.addSuceso(suceso);
		assertEquals(registro.getRegistro().size(), 0);
	}

	@Test
	public void PR_UN_Registro_003() {
		Registro registro = new Registro(1);
		registro.addSuceso(suceso);
		assertEquals(registro.getRegistro().size(), 1);
	}

	@Test
	public void PR_UN_Registro_004() {
		Registro registro = new Registro(10);
		for (int i = 0; i < 10; i++) {
			registro.addSuceso(suceso);
		}
		assertEquals(registro.getRegistro().size(), 10);
	}

}
