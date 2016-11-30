package vvs.plantilla;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

/**
 * The Class PlantillaTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class PlantillaTest {

  /** The equipos. */
  @Mock
  private List<Equipo> equipos;

  /** The empleados. */
  @Mock
  private List<Empleado> empleados;

  /** The equipo. */
  @Mock
  private Equipo equipo;

  /** The empleado. */
  @Mock
  private Empleado empleado;

  /**
   * Pr U N plantilla 001.
   */
  @Test
  public void pr_UN_Plantilla_001() {
    Plantilla plantilla = new Plantilla();
    plantilla.addEmpleado(empleado);
    boolean pepito = plantilla.getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N plantilla 002.
   */
  @Test
  public void pr_UN_Plantilla_002() {
    Plantilla plantilla = new Plantilla();
    plantilla.addEquipo(equipo);
    boolean pepito = plantilla.getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N plantilla 003.
   */
  @Test
  public void pr_UN_Plantilla_003() {
    Plantilla plantilla = new Plantilla();
    plantilla.setEmpleados(empleados);
    assertEquals(plantilla.getEmpleados(), empleados);
  }

  /**
   * Pr U N plantilla 004.
   */
  @Test
  public void pr_UN_Plantilla_004() {
    Plantilla plantilla = new Plantilla();
    plantilla.setEquipos(equipos);
    assertEquals(plantilla.getEquipos(), equipos);
  }

}
