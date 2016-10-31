/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vvs.pruebafinal;

import vvs.alarma.Alarma;
import vvs.alarma.AlarmaNivelAgua;
import vvs.alarma.AlarmaNivelCloro;
import vvs.alarma.AlarmaNivelCloroEvacuacion;
import vvs.alarma.AlarmaNivelSales;
import vvs.alarma.AlarmaPersonas;
import vvs.piscinas.Piscina;
import vvs.piscinas.PiscinaImp;
import vvs.piscinas.PiscinaRelax;
import vvs.plantilla.Empleado;
import vvs.plantilla.Empleado.Genero;
import vvs.plantilla.Encargado;
import vvs.plantilla.Equipo;
import vvs.plantilla.Gestor;
import vvs.plantilla.Mantenimiento;
import vvs.plantilla.Socorrista;
import vvs.sensor.SensorNivelAgua;
import vvs.sensor.SensorNivelCloro;
import vvs.sensor.SensorNivelPh;
import vvs.sensor.SensorNivelSales;
import vvs.sensor.SensorPersonas;
import vvs.sensor.SensorTemperatura;

// TODO: Auto-generated Javadoc
/**
 * The Class Prueba.
 */
public class Prueba {

  /**
   * Prueba Final.
   * 
   * @param args args
   */

  public static void main(String[] args) {
    Encargado encargado = new Encargado("Paleto de turno", Genero.H);
    Piscina piscina = new PiscinaImp("Olímpica", "Zona 1");
    encargado.activa(piscina);
    Alarma alarma1 = new AlarmaPersonas(30);
    piscina.addObserver(alarma1);
    Alarma alarma2 = new AlarmaNivelAgua((float) 5, (float) 2);
    piscina.addObserver(alarma2);
    Empleado empleado1 = new Socorrista("Pedro", Genero.H);
    alarma1.addResponsable(empleado1);
    Equipo equipo1 = new Equipo("Mantenimiento");
    equipo1.setEmpleado(empleado1);
    alarma1.addResponsable(equipo1);

    
    Empleado empleado2 = new Mantenimiento("Juan", Genero.H);
    alarma2.addResponsable(empleado2);
    
   

    SensorPersonas sensor1 = new SensorPersonas(piscina);
    SensorNivelAgua sensor2 = new SensorNivelAgua(piscina);
    SensorNivelPh sensor3 = new SensorNivelPh(piscina);
    SensorNivelCloro sensor4 = new SensorNivelCloro(piscina);
    piscina.addSensor(sensor1);
    piscina.addSensor(sensor2);
    piscina.addSensor(sensor3);
    piscina.addSensor(sensor4);

    
    sensor1.medirPersonas(10);
    sensor1.medirPersonas(11);

    encargado.evacuar(piscina);
    sensor1.medirPersonas(5);
    sensor1.medirPersonas(0);
    sensor2.medirNivelAgua((float) 1.9);
    sensor2.medirNivelAgua((float) 5.6);
    encargado.evacuar(piscina);
    sensor3.medirNivelPh((float) 7.001);
    sensor4.medirNivelCloro((float) 13.4);

    Gestor gestor = new Gestor("Bárcenas", Genero.H);
    System.out.println(gestor.generarInforme(piscina));
    System.out.println(alarma1.informe());
    System.out.println(alarma2.informe());

    Piscina piscinaPeq = new PiscinaImp("Piscina Pequeña", "Zona 3");
    Alarma alarma6 = new AlarmaNivelAgua((float) 1.9, (float) 0.5020);
    piscinaPeq.addObserver(alarma6);
    SensorNivelAgua sensor11 = new SensorNivelAgua(piscinaPeq);
    encargado.activa(piscinaPeq);
    sensor11.medirNivelAgua((float) 1.05);
    sensor11.medirNivelAgua((float) 1.95);
    sensor11.medirNivelAgua((float) 0.45);
    try {
      sensor11.medirNivelAgua((float) -2);
    } catch (IllegalArgumentException exc) {
      sensor11.medirNivelAgua((float) 1);
    }
    encargado.evacuar(piscinaPeq);
    sensor11.medirNivelAgua((float) 0);
    sensor11.medirNivelAgua((float) 2);
    System.out.println(gestor.generarInforme(piscinaPeq));
    System.out.println(alarma6.informe());

    PiscinaRelax piscinarelax = new PiscinaRelax("Piscina Relax", "Zona 2");
    piscinarelax.addObserver(alarma2);
    piscinarelax.addObserver(alarma1);
    Equipo equipo2 = new Equipo("Socorristas");
    equipo2.setEquipo(equipo1);
    equipo2.setEmpleado(new Socorrista("Alma", Genero.M));
    equipo2.setEmpleado(new Socorrista("Rosa", Genero.M));
    

    SensorPersonas sensor5 = new SensorPersonas(piscinarelax);
    SensorNivelAgua sensor6 = new SensorNivelAgua(piscinarelax);
    SensorNivelPh sensor7 = new SensorNivelPh(piscinarelax);
    SensorNivelCloro sensor8 = new SensorNivelCloro(piscinarelax);
    SensorTemperatura sensor9 = new SensorTemperatura(piscinarelax);
    SensorNivelSales sensor10 = new SensorNivelSales(piscinarelax);

    piscinarelax.addSensor(sensor5);
    piscinarelax.addSensor(sensor6);
    piscinarelax.addSensor(sensor7);
    piscinarelax.addSensor(sensor8);
    piscinarelax.addSensor(sensor9);
    piscinarelax.addSensor(sensor10);

    alarma1 = new AlarmaPersonas(30);
    alarma2 = new AlarmaNivelAgua((float) 5, (float) 2);
    Alarma alarma3 = new AlarmaNivelSales(50, 20);
    alarma3.addResponsable(empleado2);
    Alarma alarma4 = new AlarmaNivelCloro(35, 10);
    alarma4.addResponsable(equipo2);
    Alarma alarma5 = new AlarmaNivelCloroEvacuacion(60, 5);
    alarma5.addResponsable(equipo2);
    alarma5.addResponsable(empleado2);
    alarma1.addResponsable(empleado1);
    alarma2.addResponsable(equipo1);
    

    piscinarelax.addObserver(alarma1);
    piscinarelax.addObserver(alarma2);
    piscinarelax.addObserver(alarma3);
    piscinarelax.addObserver(alarma4);

    encargado.activa(piscinarelax);
    sensor5.medirPersonas(13);
    sensor10.medirNivelSales(60);
    sensor10.medirNivelSales(40);
    sensor9.medirTemperatura(40);
    sensor8.medirNivelCloro(32);
    piscinarelax.addObserver(alarma5);
    sensor8.medirNivelCloro(61);
    sensor8.medirNivelCloro(15);
    sensor7.medirNivelPh(0);
    sensor6.medirNivelAgua(4);
    sensor5.medirPersonas(10);
    sensor5.medirPersonas(0);

    System.out.println(gestor.generarInforme(piscinarelax));
    // System.out.println(alarma1.informe());
    System.out.println(alarma2.informe());
    System.out.println(alarma3.informe());
    System.out.println(alarma4.informe());
    System.out.println(alarma5.informe());

  }
}
