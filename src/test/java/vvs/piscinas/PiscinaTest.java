package vvs.piscinas;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PiscinaTest {
	private static float delta = 0.00001f;
	private static String nombre = "Nombre";
	private static String ubicacion = "Ubicacion";
	private static Random random = new Random();
	private static int randomInt = 100000;

	@Test
	public void PR_UN_Piscina_001() {
		PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
		piscina.setNivelAgua(0);
		assertEquals(0f, piscina.getNivelAgua(), delta);
	}

	@Test(expected = IllegalArgumentException.class)
	public void PR_UN_Piscina_002() {
		PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
		piscina.setNivelAgua(-1);
	}

	@Test
	public void PR_UN_Piscina_003() {
		PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
		piscina.setNivelAgua(10);
		assertEquals(10f, piscina.getNivelAgua(), delta);
	}

	@Test
	public void PR_UN_Piscina_004() {
		PiscinaImp piscina = new PiscinaImp(nombre, ubicacion);
		float value = random.nextFloat() * random.nextInt(randomInt);
		piscina.setNivelAgua(value);
		assertEquals(value, piscina.getNivelAgua(), delta);
	}

	/*
	 * TODO public abstract void regsitrarNuevoSuceso(Suceso suceso);
	 * 
	 * public abstract String informe();
	 * 
	 * public abstract void activar();
	 * 
	 * public abstract void cerrar();
	 * 
	 * public abstract void evacuar();
	 * 
	 * public abstract void mantenimiento();
	 * 
	 * public abstract boolean lanzarAlarmas();
	 * 
	 * public abstract void addSensor(Sensor sensor);
	 * 
	 * public abstract void setNivelAgua(float nivel);
	 * 
	 * public abstract void setTemperatura(float temperatura);
	 * 
	 * public abstract void setNivelCloro(float nivel);
	 * 
	 * public abstract void setNivelPH(float nivel);
	 * 
	 * public abstract void setPersonas(int personas);
	 */

}
