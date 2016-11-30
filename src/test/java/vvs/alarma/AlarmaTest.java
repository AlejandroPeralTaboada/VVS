package vvs.alarma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import vvs.plantilla.Empleado;
import vvs.plantilla.Equipo;
import vvs.plantilla.Plantilla;

import java.util.List;

/**
 * The Class AlarmaTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class AlarmaTest {

  /** The equipo. */
  @Mock
  private Equipo equipo;

  /** The empleado. */
  @Mock
  private Empleado empleado;

  /** The plantilla. */
  @Mock
  private Plantilla plantilla;

  /** The registro. */
  @Mock
  private List<String> registro;

  /**
   * Pr U N alarma 001.
   */
  @Test
  public void pr_UN_Alarma_001() {
    Alarma alarma = new AlarmaNivelAgua(4, 2);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 002.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_002() {
    Alarma alarma = new AlarmaNivelAgua(2, 4);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 003.
   */
  @Test
  public void pr_UN_Alarma_003() {
    Alarma alarma = new AlarmaNivelAgua(0, 0);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 004.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_004() {
    Alarma alarma = new AlarmaNivelAgua(5, -3);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 005.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_005() {
    Alarma alarma = new AlarmaNivelAgua(-3, 2);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 006.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_006() {
    Alarma alarma = new AlarmaNivelAgua(-1, 5);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 007.
   */
  @Test
  public void pr_UN_Alarma_007() {
    Alarma alarma = new AlarmaNivelAgua(6, 2);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 008.
   */
  @Test
  public void pr_UN_Alarma_008() {
    Alarma alarma = new AlarmaNivelCloro(4, 2);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 009.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_009() {
    Alarma alarma = new AlarmaNivelCloro(2,4);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 010.
   */
  @Test
  public void pr_UN_Alarma_010() {
    Alarma alarma = new AlarmaNivelCloro(0, 0);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 011.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_011() {
    Alarma alarma = new AlarmaNivelCloro(5,-3);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 012.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_012() {
    Alarma alarma = new AlarmaNivelCloro(-3,2);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 013.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_013() {
    Alarma alarma = new AlarmaNivelCloro(-1,-5);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 014.
   */
  @Test
  public void pr_UN_Alarma_014() {
    Alarma alarma = new AlarmaNivelCloro(6, 2);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 015.
   */
  @Test
  public void pr_UN_Alarma_015() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(4, 2);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 016.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_016() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(2,4);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 017.
   */
  @Test
  public void pr_UN_Alarma_017() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(0, 0);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 018.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_018() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(5,-3);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 019.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_019() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(-3,2);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 020.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_020() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(-1,-5);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 021.
   */
  @Test
  public void pr_UN_Alarma_021() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(6, 2);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 022.
   */
  @Test
  public void pr_UN_Alarma_022() {
    Alarma alarma = new AlarmaNivelPh(4, 2);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 023.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_023() {
    Alarma alarma = new AlarmaNivelPh(2,4);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 024.
   */
  @Test
  public void pr_UN_Alarma_024() {
    Alarma alarma = new AlarmaNivelPh(0, 0);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 025.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_025() {
    Alarma alarma = new AlarmaNivelPh(5,-3);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 026.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_026() {
    Alarma alarma = new AlarmaNivelPh(-3,2);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 027.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_027() {
    Alarma alarma = new AlarmaNivelPh(-1,-5);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 028.
   */
  @Test
  public void pr_UN_Alarma_028() {
    Alarma alarma = new AlarmaNivelPh(6, 2);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 029.
   */
  @Test
  public void pr_UN_Alarma_029() {
    Alarma alarma = new AlarmaNivelSales(4, 2);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 030.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_030() {
    Alarma alarma = new AlarmaNivelSales(2,4);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 031.
   */
  @Test
  public void pr_UN_Alarma_031() {
    Alarma alarma = new AlarmaNivelSales(0, 0);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 032.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_032() {
    Alarma alarma = new AlarmaNivelSales(5,-3);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 033.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_033() {
    Alarma alarma = new AlarmaNivelSales(-3,2);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 034.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_034() {
    Alarma alarma = new AlarmaNivelSales(-1,-5);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 035.
   */
  @Test
  public void pr_UN_Alarma_035() {
    Alarma alarma = new AlarmaNivelSales(6, 2);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 036.
   */
  @Test
  public void pr_UN_Alarma_036() {
    Alarma alarma = new AlarmaPersonas(4);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 037.
   */
  @Test
  public void pr_UN_Alarma_037() {
    Alarma alarma = new AlarmaPersonas(0);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 038.
   */
  @Test
  public void pr_UN_Alarma_038() {
    Alarma alarma = new AlarmaPersonas(-4);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 039.
   */
  @Test
  public void pr_UN_Alarma_039() {
    Alarma alarma = new AlarmaPersonas(4);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 040.
   */
  @Test
  public void pr_UN_Alarma_040() {
    Alarma alarma = new AlarmaPersonas(0);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 041.
   */
  @Test
  public void pr_UN_Alarma_041() {
    Alarma alarma = new AlarmaPersonas(4);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 042.
   */
  @Test
  public void pr_UN_Alarma_042() {
    Alarma alarma = new AlarmaTemperatura(4, 2);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 043.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_043() {
    Alarma alarma = new AlarmaTemperatura(2,4);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 044.
   */
  @Test
  public void pr_UN_Alarma_044() {
    Alarma alarma = new AlarmaTemperatura(0, 0);
    alarma.addResponsable(equipo);
    boolean pepito = alarma.getPlantilla().getEquipos().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 045.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_045() {
    Alarma alarma = new AlarmaTemperatura(5,-3);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 046.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_046() {
    Alarma alarma = new AlarmaTemperatura(-3,2);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 047.
   */
  @Test(expected = IllegalArgumentException.class)
  public void pr_UN_Alarma_047() {
    Alarma alarma = new AlarmaTemperatura(-1,-5);
    alarma.addResponsable(equipo);
  }

  /**
   * Pr U N alarma 048.
   */
  @Test
  public void pr_UN_Alarma_048() {
    Alarma alarma = new AlarmaTemperatura(6, 2);
    alarma.addResponsable(empleado);
    boolean pepito = alarma.getPlantilla().getEmpleados().size() == 1;
    assertTrue(pepito);
  }

  /**
   * Pr U N alarma 049.
   */
  @Test
  public void pr_UN_Alarma_049() {
    Alarma alarma = new AlarmaNivelAgua(2, 0);
    alarma.setPlantilla(plantilla);
    assertEquals(plantilla, alarma.getPlantilla());
  }

  /**
   * Pr U N alarma 050.
   */
  @Test
  public void pr_UN_Alarma_050() {
    Alarma alarma = new AlarmaNivelAgua(2, 0);
    alarma.setRegistro(registro);
    assertEquals(registro, alarma.getRegistro());
  }

  /**
   * Pr U N alarma 051.
   */
  @Test
  public void pr_UN_Alarma_051() {
    Alarma alarma = new AlarmaNivelAgua(2, 0);
    assertEquals(alarma.informe(), "");
  }

  /**
   * Pr U N alarma 052.
   */
  @Test
  public void pr_UN_Alarma_052() {
    Alarma alarma = new AlarmaNivelCloro(2, 0);
    alarma.setPlantilla(plantilla);
    assertEquals(plantilla, alarma.getPlantilla());
  }

  /**
   * Pr U N alarma 053.
   */
  @Test
  public void pr_UN_Alarma_053() {
    Alarma alarma = new AlarmaNivelCloro(2, 0);
    alarma.setRegistro(registro);
    assertEquals(registro, alarma.getRegistro());
  }

  /**
   * Pr U N alarma 054.
   */
  @Test
  public void pr_UN_Alarma_054() {
    Alarma alarma = new AlarmaNivelCloro(2, 0);
    assertEquals(alarma.informe(), "");
  }

  /**
   * Pr U N alarma 055.
   */
  @Test
  public void pr_UN_Alarma_055() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(2, 0);
    alarma.setPlantilla(plantilla);
    assertEquals(plantilla, alarma.getPlantilla());
  }

  /**
   * Pr U N alarma 056.
   */
  @Test
  public void pr_UN_Alarma_056() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(2, 0);
    alarma.setRegistro(registro);
    assertEquals(registro, alarma.getRegistro());
  }

  /**
   * Pr U N alarma 057.
   */
  @Test
  public void pr_UN_Alarma_057() {
    Alarma alarma = new AlarmaNivelCloroEvacuacion(2, 0);
    assertEquals(alarma.informe(), "");
  }

  /**
   * Pr U N alarma 058.
   */
  @Test
  public void pr_UN_Alarma_058() {
    Alarma alarma = new AlarmaNivelPh(2, 0);
    alarma.setPlantilla(plantilla);
    assertEquals(plantilla, alarma.getPlantilla());
  }

  /**
   * Pr U N alarma 059.
   */
  @Test
  public void pr_UN_Alarma_059() {
    Alarma alarma = new AlarmaNivelPh(2, 0);
    alarma.setRegistro(registro);
    assertEquals(registro, alarma.getRegistro());
  }

  /**
   * Pr U N alarma 060.
   */
  @Test
  public void pr_UN_Alarma_060() {
    Alarma alarma = new AlarmaNivelPh(2, 0);
    assertEquals(alarma.informe(), "");
  }

  /**
   * Pr U N alarma 061.
   */
  @Test
  public void pr_UN_Alarma_061() {
    Alarma alarma = new AlarmaNivelSales(2, 0);
    alarma.setPlantilla(plantilla);
    assertEquals(plantilla, alarma.getPlantilla());
  }

  /**
   * Pr U N alarma 062.
   */
  @Test
  public void pr_UN_Alarma_062() {
    Alarma alarma = new AlarmaNivelSales(2, 0);
    alarma.setRegistro(registro);
    assertEquals(registro, alarma.getRegistro());
  }

  /**
   * Pr U N alarma 063.
   */
  @Test
  public void pr_UN_Alarma_063() {
    Alarma alarma = new AlarmaNivelSales(2, 0);
    assertEquals(alarma.informe(), "");
  }

  /**
   * Pr U N alarma 064.
   */
  @Test
  public void pr_UN_Alarma_064() {
    Alarma alarma = new AlarmaPersonas(2);
    alarma.setPlantilla(plantilla);
    assertEquals(plantilla, alarma.getPlantilla());
  }

  /**
   * Pr U N alarma 065.
   */
  @Test
  public void pr_UN_Alarma_065() {
    Alarma alarma = new AlarmaPersonas(2);
    alarma.setRegistro(registro);
    assertEquals(registro, alarma.getRegistro());
  }

  /**
   * Pr U N alarma 066.
   */
  @Test
  public void pr_UN_Alarma_066() {
    Alarma alarma = new AlarmaPersonas(2);
    assertEquals(alarma.informe(), "");
  }

  /**
   * Pr U N alarma 067.
   */
  @Test
  public void pr_UN_Alarma_067() {
    Alarma alarma = new AlarmaTemperatura(2, 0);
    alarma.setPlantilla(plantilla);
    assertEquals(plantilla, alarma.getPlantilla());
  }

  /**
   * Pr U N alarma 068.
   */
  @Test
  public void pr_UN_Alarma_068() {
    Alarma alarma = new AlarmaTemperatura(2, 0);
    alarma.setRegistro(registro);
    assertEquals(registro, alarma.getRegistro());
  }

  /**
   * Pr U N alarma 069.
   */
  @Test
  public void pr_UN_Alarma_069() {
    Alarma alarma = new AlarmaTemperatura(2, 0);
    assertEquals(alarma.informe(), "");
  }

}
