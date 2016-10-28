package vvs.alarma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaImp;
import vvs.plantilla.Empleado;
import vvs.plantilla.Empleado.Genero;
import vvs.plantilla.Encargado;
import vvs.plantilla.Equipo;
import vvs.plantilla.Gestor;
import vvs.plantilla.Mantenimiento;
import vvs.plantilla.Marketing;
import vvs.plantilla.Socorrista;

public class IntegracionPiscinasAlarmaPlantillaTest {

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_001() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Socorrista("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(10);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),1);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_002() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Socorrista("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(5);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),0);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_003() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Encargado("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(10);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),1);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_004() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Encargado("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(5);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),0);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_005() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar(); 
    piscina.addObserver(alarma);
    Empleado empleado = new Mantenimiento("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(10);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),1);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_006() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Mantenimiento("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(5);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),0);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_007() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Marketing("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(10);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),1);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_008() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Marketing("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(5);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),0);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_009() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Gestor("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(10);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),1);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_010() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Empleado empleado = new Gestor("Manolo",Genero.H);
    alarma.addResponsable(empleado);
    piscina.setNivelAgua(5);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),0);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_011() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Equipo equipo = new Equipo("Equipo A");
    alarma.addResponsable(equipo);
    piscina.setNivelAgua(10);
    //alarma.getRegistro().stream().forEach(System.out::println);  
    assertEquals(alarma.getRegistro().size(),1);
  }

  @Test
  public void pr_IN_PiscinasAlarmaPlantilla_012() {
    Piscina piscina = new PiscinaImp("", "");
    Alarma alarma = new AlarmaNivelAgua(7, 4);
    piscina.activar();
    piscina.addObserver(alarma);
    Equipo equipo = new Equipo("Equipo A");
    alarma.addResponsable(equipo);
    piscina.setNivelAgua(5);
    //alarma.getRegistro().stream().forEach(System.out::println); 
    assertEquals(alarma.getRegistro().size(),0);
  }
}
