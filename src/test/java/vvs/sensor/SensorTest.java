package vvs.sensor;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaRelax;

@RunWith(MockitoJUnitRunner.class)
public class SensorTest {
	
	/*@Mock
	private Piscina piscina; */
	
	@Test 
	public void PR_UN_Sensor_001(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		float valor = new Float(10);
		sensorAgua.medirNivelAgua(valor);
		boolean pepito = piscina.getNivelAgua() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_002(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		float valor = new Float(0);
		sensorAgua.medirNivelAgua(valor);
		boolean pepito = piscina.getNivelAgua() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_003(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelAgua sensorAgua = new SensorNivelAgua(piscina);
		float valor = new Float(-10);
		boolean catched = false;
		try {
			sensorAgua.medirNivelAgua(valor);
		} catch (IllegalArgumentException e){
			catched = true;
		}
		assertTrue(catched);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_004(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		float valor = new Float(10);
		sensorCloro.medirNivelCloro(valor);
		boolean pepito = piscina.getNivelCloro() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_005(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		float valor = new Float(0);
		sensorCloro.medirNivelCloro(valor);
		boolean pepito = piscina.getNivelCloro() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_006(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelCloro sensorCloro = new SensorNivelCloro(piscina);
		float valor = new Float(-10);
		boolean catched = false;
		try {
			sensorCloro.medirNivelCloro(valor);
		} catch (IllegalArgumentException e){
			catched = true;
		}
		assertTrue(catched);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_007(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelPH sensorPH = new SensorNivelPH(piscina);
		float valor = new Float(10);
		sensorPH.medirNivelPH(valor);
		boolean pepito = piscina.getNivelPH() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_008(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelPH sensorPH = new SensorNivelPH(piscina);
		float valor = new Float(0);
		sensorPH.medirNivelPH(valor);
		boolean pepito = piscina.getNivelPH() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_009(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorNivelPH sensorPH = new SensorNivelPH(piscina);
		float valor = new Float(-10);
		boolean catched = false;
		try {
			sensorPH.medirNivelPH(valor);
		} catch (IllegalArgumentException e){
			catched = true;
		}
		assertTrue(catched);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_010(){
		PiscinaRelax piscinaRelax = new PiscinaRelax("UDC","Elviña");
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		float valor = new Float(10);
		sensorSales.medirNivelSales(valor);
		boolean pepito = piscinaRelax.getNivelSales() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_011(){
		PiscinaRelax piscinaRelax = new PiscinaRelax("UDC","Elviña");
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		float valor = new Float(0);
		sensorSales.medirNivelSales(valor);
		boolean pepito = piscinaRelax.getNivelSales() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_012(){
		PiscinaRelax piscinaRelax = new PiscinaRelax("UDC","Elviña");
		SensorNivelSales sensorSales = new SensorNivelSales(piscinaRelax);
		float valor = new Float(-10);
		boolean catched = false;
		try {
			sensorSales.medirNivelSales(valor);
		} catch (IllegalArgumentException e){
			catched = true;
		}
		assertTrue(catched);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_013(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		int valor = new Integer(10);
		sensorPersonas.medirPersonas(valor);
		boolean pepito = piscina.getPersonas() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_014(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		int valor = new Integer(0);
		sensorPersonas.medirPersonas(valor);
		boolean pepito = piscina.getPersonas() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_015(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorPersonas sensorPersonas = new SensorPersonas(piscina);
		int valor = new Integer(-10);
		boolean catched = false;
		try {
			sensorPersonas.medirPersonas(valor);
		} catch (IllegalArgumentException e){
			catched = true;
		}
		assertTrue(catched);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_016(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		float valor = new Float(10);
		sensorTemperatura.medirTemperatura(valor);
		boolean pepito = piscina.getTemperatura() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_017(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		float valor = new Float(0);
		sensorTemperatura.medirTemperatura(valor);
		boolean pepito = piscina.getTemperatura() == valor;
		assertTrue(pepito);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
	
	@Test 
	public void PR_UN_Sensor_018(){
		Piscina piscina = new Piscina("UDC","Elviña");
		SensorTemperatura sensorTemperatura = new SensorTemperatura(piscina);
		float valor = new Float(-10);
		boolean catched = false;
		try {
			sensorTemperatura.medirTemperatura(valor);
		} catch (IllegalArgumentException e){
			catched = true;
		}
		assertTrue(catched);
		// Se debería de obtener que es verdadero, pero con mockito
		// no actualiza el valor de la piscina.
	}
}
