package vvs.sensor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaRelax;

@RunWith(MockitoJUnitRunner.class)
public class SensorTest {

	@Test
	public void pr_UN_Sensor_001() {
		Piscina piscina = Mockito.mock(Piscina.class);
		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				assertEquals(10f, (Float) args[0], 0.00001);
				return null;
			}
		}).when(piscina).setNivelAgua(10);
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		float valor = 10f;
		sensorAgua.medirNivelAgua(valor);
	}

	@Test
	public void pr_UN_Sensor_002() {
		Piscina piscina = Mockito.mock(Piscina.class);
		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				assertEquals(10f, (Float) args[0], 0.00001);
				return null;
			}
		}).when(piscina).setNivelCloro(10);
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		float valor = 10f;
		sensorCloro.medirNivelCloro(valor);
	}

	@Test
	public void pr_UN_Sensor_003() {
		Piscina piscina = Mockito.mock(Piscina.class);
		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				assertEquals(10f, (Float) args[0], 0.00001);
				return null;
			}
		}).when(piscina).setNivelPh(10);
		SensorNivelPh sensorPh = new SensorNivelPh(piscina);
		float valor = 10f;
		sensorPh.medirNivelPh(valor);
	}

	@Test
	public void pr_UN_Sensor_004() {
		PiscinaRelax piscinaRelax = Mockito.mock(PiscinaRelax.class);
		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				assertEquals(10f, (Float) args[0], 0.00001);
				return null;
			}
		}).when(piscinaRelax).setNivelSales(10);
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		float valor = 10f;
		sensorSales.medirNivelSales(valor);
	}

	@Test
	public void pr_UN_Sensor_005() {
		Piscina piscina = Mockito.mock(Piscina.class);
		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				assertEquals(10, (Integer) args[0], 0.00001);
				return null;
			}
		}).when(piscina).setPersonas(10);
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		int valor = 10;
		sensorPersonas.medirPersonas(valor);
	}

	@Test
	public void pr_UN_Sensor_006() {
		Piscina piscina = Mockito.mock(Piscina.class);
		Mockito.doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
				Object[] args = invocation.getArguments();
				assertEquals(10f, (Float) args[0], 0.00001);
				return null;
			}
		}).when(piscina).setTemperatura(10);
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		float valor = 10f;
		sensorTemperatura.medirTemperatura(valor);
	}

	@Test
	public void pr_UN_Sensor_007() {
		Piscina piscina = Mockito.mock(Piscina.class);
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		assertEquals(piscina, sensorAgua.getPiscina());
	}

	@Test
	public void pr_UN_Sensor_008() {
		Piscina piscina = Mockito.mock(Piscina.class);
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		assertEquals(piscina, sensorCloro.getPiscina());
	}

	@Test
	public void pr_UN_Sensor_009() {
		Piscina piscina = Mockito.mock(Piscina.class);
		SensorNivelPh sensorPh = new SensorNivelPh(piscina);
		assertEquals(piscina, sensorPh.getPiscina());
	}

	@Test
	public void pr_UN_Sensor_010() {
		PiscinaRelax piscinaRelax = Mockito.mock(PiscinaRelax.class);
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		assertEquals(piscinaRelax, sensorSales.getPiscina());
	}

	@Test
	public void pr_UN_Sensor_011() {
		Piscina piscina = Mockito.mock(Piscina.class);
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		assertEquals(piscina, sensorPersonas.getPiscina());
	}

	@Test
	public void pr_UN_Sensor_012() {
		Piscina piscina = Mockito.mock(Piscina.class);
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		assertEquals(piscina, sensorTemperatura.getPiscina());
	}
}
