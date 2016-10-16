package vvs.alarma;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import vvs.plantilla.Empleado;
import vvs.plantilla.Equipo;

@RunWith(MockitoJUnitRunner.class)
public class AlarmaTest {

	@Mock
	private Equipo equipo;

	@Mock
	private Empleado empleado;

	@Test
	public void PR_UN_Alarma_001() {
		Alarma alarma = new AlarmaNivelAgua(4, 2);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_002() {
		boolean catched = false;
		try {
			new AlarmaNivelAgua(2, 4);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_003() {
		Alarma alarma = new AlarmaNivelAgua(0, 0);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_004() {
		boolean catched = false;
		try {
			new AlarmaNivelAgua(5, -3);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_005() {
		boolean catched = false;
		try {
			new AlarmaNivelAgua(-3, 2);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_006() {
		boolean catched = false;
		try {
			new AlarmaNivelAgua(-1, -5);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_007() {
		Alarma alarma = new AlarmaNivelAgua(6, 2);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_008() {
		Alarma alarma = new AlarmaNivelCloro(4, 2);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_009() {
		boolean catched = false;
		try {
			new AlarmaNivelCloro(2, 4);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_010() {
		Alarma alarma = new AlarmaNivelCloro(0, 0);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_011() {
		boolean catched = false;
		try {
			new AlarmaNivelCloro(5, -3);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_012() {
		boolean catched = false;
		try {
			new AlarmaNivelCloro(-3, 2);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_013() {
		boolean catched = false;
		try {
			new AlarmaNivelCloro(-1, -5);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_014() {
		Alarma alarma = new AlarmaNivelCloro(6, 2);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_015() {
		Alarma alarma = new AlarmaNivelCloroEvacuacion(4, 2);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_016() {
		boolean catched = false;
		try {
			new AlarmaNivelCloroEvacuacion(2, 4);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_017() {
		Alarma alarma = new AlarmaNivelCloroEvacuacion(0, 0);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_018() {
		boolean catched = false;
		try {
			new AlarmaNivelCloroEvacuacion(5, -3);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_019() {
		boolean catched = false;
		try {
			new AlarmaNivelCloroEvacuacion(-3, 2);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_020() {
		boolean catched = false;
		try {
			new AlarmaNivelCloroEvacuacion(-1, -5);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_021() {
		Alarma alarma = new AlarmaNivelCloroEvacuacion(6, 2);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_022() {
		Alarma alarma = new AlarmaNivelPH(4, 2);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_023() {
		boolean catched = false;
		try {
			new AlarmaNivelPH(2, 4);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_024() {
		Alarma alarma = new AlarmaNivelPH(0, 0);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_025() {
		boolean catched = false;
		try {
			new AlarmaNivelPH(5, -3);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_026() {
		boolean catched = false;
		try {
			new AlarmaNivelPH(-3, 2);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_027() {
		boolean catched = false;
		try {
			new AlarmaNivelPH(-1, -5);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_028() {
		Alarma alarma = new AlarmaNivelPH(6, 2);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_029() {
		Alarma alarma = new AlarmaNivelSales(4, 2);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_030() {
		boolean catched = false;
		try {
			new AlarmaNivelSales(2, 4);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_031() {
		Alarma alarma = new AlarmaNivelSales(0, 0);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_032() {
		boolean catched = false;
		try {
			new AlarmaNivelSales(5, -3);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_033() {
		boolean catched = false;
		try {
			new AlarmaNivelSales(-3, 2);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_034() {
		boolean catched = false;
		try {
			new AlarmaNivelSales(-1, -5);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_035() {
		Alarma alarma = new AlarmaNivelSales(6, 2);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_036() {
		Alarma alarma = new AlarmaPersonas(4);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_037() {
		Alarma alarma = new AlarmaPersonas(0);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_038() {
		Alarma alarma = new AlarmaPersonas(-4);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_039() {
		Alarma alarma = new AlarmaPersonas(4);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_040() {
		Alarma alarma = new AlarmaPersonas(0);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_041() {
		Alarma alarma = new AlarmaPersonas(4);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_042() {
		Alarma alarma = new AlarmaTemperatura(4, 2);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_043() {
		boolean catched = false;
		try {
			new AlarmaTemperatura(2, 4);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_044() {
		Alarma alarma = new AlarmaTemperatura(0, 0);
		alarma.addResponsable(equipo);
		boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
		assertTrue(pepito);
	}

	@Test
	public void PR_UN_Alarma_045() {
		boolean catched = false;
		try {
			new AlarmaTemperatura(5, -3);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_046() {
		boolean catched = false;
		try {
			new AlarmaTemperatura(-3, 2);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_047() {
		boolean catched = false;
		try {
			new AlarmaTemperatura(-1, -5);
		} catch (IllegalArgumentException e) {
			catched = true;
		}
		assertTrue(catched);
	}

	@Test
	public void PR_UN_Alarma_048() {
		Alarma alarma = new AlarmaTemperatura(6, 2);
		alarma.addResponsable(empleado);
		boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
		assertTrue(pepito);
	}

}
