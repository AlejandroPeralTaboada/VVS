package vvs.plantilla;


import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;



@RunWith(MockitoJUnitRunner.class)
public class PlantillaTest {

  @Mock
  private List<Equipo> equipos;

  @Mock
  private List<Empleado> empleados;

  @Mock
  private Equipo equipo;

  @Mock
  private Empleado empleado;

  @Test
  public void pr_UN_Plantilla_001() {
    Plantilla plantilla = new Plantilla();
    plantilla.addEmpleado(empleado);
    boolean pepito = plantilla.getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  @Test
  public void pr_UN_Plantilla_002() {
    Plantilla plantilla = new Plantilla();
    plantilla.addEquipo(equipo);
    boolean pepito = plantilla.getEquipos().size() == 1;
    assertTrue(pepito);
  }

  @Test
  public void pr_UN_Plantilla_003() {
    Plantilla plantilla = new Plantilla();
    plantilla.setEmpleados(empleados);
    assertEquals(plantilla.getEmpleados(), empleados);
  }

  @Test
  public void pr_UN_Plantilla_004() {
    Plantilla plantilla = new Plantilla();
    plantilla.setEquipos(equipos);
    assertEquals(plantilla.getEquipos(), equipos);
  }

}
