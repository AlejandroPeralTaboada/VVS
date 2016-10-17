package vvs.sensor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaImp;
import vvs.piscinas.PiscinaRelax;

@RunWith(MockitoJUnitRunner.class)
public class SensorTest {

	@Mock
	private Piscina piscina2;
	@Mock
	private PiscinaRelax piscina3;

	@Test
	public void PR_UN_Sensor_001() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		float valor = new Float(10);
		sensorAgua.medirNivelAgua(valor);
		boolean pepito = piscina.getNivelAgua() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_002() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		float valor = new Float(0);
		sensorAgua.medirNivelAgua(valor);
		boolean pepito = piscina.getNivelAgua() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_003() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		float valor = new Float(-10);
		try {
			sensorAgua.medirNivelAgua(valor);
		} catch (IllegalArgumentException e) {
		}
		boolean pepito = piscina.getNivelAgua() == 0;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_004() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		float valor = new Float(10);
		sensorCloro.medirNivelCloro(valor);
		boolean pepito = piscina.getNivelCloro() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_005() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		float valor = new Float(0);
		sensorCloro.medirNivelCloro(valor);
		boolean pepito = piscina.getNivelCloro() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_006() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		float valor = new Float(-10);
		try {
			sensorCloro.medirNivelCloro(valor);
		} catch (IllegalArgumentException e) {
		}
		boolean pepito = piscina.getNivelCloro() == 0;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_007() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelPH sensorPH = new SensorNivelPH(piscina);
		float valor = new Float(10);
		sensorPH.medirNivelPH(valor);
		boolean pepito = piscina.getNivelPH() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_008() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelPH sensorPH = new SensorNivelPH(piscina);
		float valor = new Float(0);
		sensorPH.medirNivelPH(valor);
		boolean pepito = piscina.getNivelPH() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_009() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelPH sensorPH = new SensorNivelPH(piscina);
		float valor = new Float(-10);
		try {
			sensorPH.medirNivelPH(valor);
		} catch (IllegalArgumentException e) {
		}
		boolean pepito = piscina.getNivelPH() == 0;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_010() {
		PiscinaRelax piscinaRelax = new PiscinaRelax("UDC", "Elviña");
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		float valor = new Float(10);
		sensorSales.medirNivelSales(valor);
		boolean pepito = piscinaRelax.getNivelSales() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_011() {
		PiscinaRelax piscinaRelax = new PiscinaRelax("UDC", "Elviña");
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		float valor = new Float(0);
		sensorSales.medirNivelSales(valor);
		boolean pepito = piscinaRelax.getNivelSales() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_012() {
		PiscinaRelax piscinaRelax = new PiscinaRelax("UDC", "Elviña");
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		float valor = new Float(-10);
		try {
			sensorSales.medirNivelSales(valor);
		} catch (IllegalArgumentException e) {
		}
		boolean pepito = piscinaRelax.getNivelSales() == 0;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_013() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		int valor = new Integer(10);
		sensorPersonas.medirPersonas(valor);
		boolean pepito = piscina.getPersonas() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_014() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		int valor = new Integer(0);
		sensorPersonas.medirPersonas(valor);
		boolean pepito = piscina.getPersonas() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_015() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		int valor = new Integer(-10);
		try {
			sensorPersonas.medirPersonas(valor);
		} catch (IllegalArgumentException e) {
		}
		boolean pepito = piscina.getPersonas() == 0;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_016() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		float valor = new Float(10);
		sensorTemperatura.medirTemperatura(valor);
		boolean pepito = piscina.getTemperatura() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_017() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		float valor = new Float(0);
		sensorTemperatura.medirTemperatura(valor);
		boolean pepito = piscina.getTemperatura() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_018() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		float valor = new Float(-10);
		try {
			sensorTemperatura.medirTemperatura(valor);
		} catch (IllegalArgumentException e) {
		}
		boolean pepito = piscina.getTemperatura() == 0;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}

	@Test
	public void PR_UN_Sensor_019() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		assertEquals(piscina, sensorAgua.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_020() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		assertEquals(piscina, sensorCloro.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_021() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorNivelPH sensorPH = new SensorNivelPH(piscina);
		assertEquals(piscina, sensorPH.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_022() {
		PiscinaRelax piscinaRelax = new PiscinaRelax("UDC", "Elviña");
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		assertEquals(piscinaRelax, sensorSales.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_023() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		assertEquals(piscina, sensorPersonas.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_024() {
		Piscina piscina = new PiscinaImp("UDC", "Elviña");
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		assertEquals(piscina, sensorTemperatura.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_025() {
		Sensor sensor = new SensorNivelAgua(piscina2);
		assertEquals(piscina2, sensor.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_026() {
		Sensor sensor = new SensorNivelCloro(piscina2);
		assertEquals(piscina2, sensor.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_027() {
		Sensor sensor = new SensorNivelPH(piscina2);
		assertEquals(piscina2, sensor.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_028() {
		Sensor sensor = new SensorNivelSales(piscina3);
		assertEquals(piscina3, sensor.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_029() {
		Sensor sensor = new SensorPersonas(piscina2);
		assertEquals(piscina2, sensor.getPiscina());
	}

	@Test
	public void PR_UN_Sensor_030() {
		Sensor sensor = new SensorTemperatura(piscina2);
		assertEquals(piscina2, sensor.getPiscina());
	}
}
