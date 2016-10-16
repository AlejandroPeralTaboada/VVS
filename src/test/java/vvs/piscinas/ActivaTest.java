package vvs.piscinas;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ActivaTest {

	@Test
	public void PR_UN_Activa_01() {
		Activa estadoPiscina = Activa.getInstancia();
		Piscina piscina = null;
		estadoPiscina.activar(piscina);

	}
}
