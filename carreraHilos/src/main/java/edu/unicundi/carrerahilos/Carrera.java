/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrerahilos;

/**
 *
 * @author Luz
 */
public class Carrera {

    public Carrera() {

    }
    /**
     * Metodo donde se inicializan cada uno de los hilos
     */
    public void empezar() {
   
        Equipo equipoNumero1 = new Equipo("Los Aguilas", (short) 1);
        Equipo equipoNumero2 = new Equipo("Los Aguilas2", (short) 2);
        Equipo equipoNumero3 = new Equipo("Los Aguilas2", (short) 3);

        Corredor corredor1 = new Corredor((short) 1, "X", equipoNumero1);
        Corredor corredor2 = new Corredor((short) 1, "W", equipoNumero2);
        Corredor corredor3 = new Corredor((short) 1, "Q", equipoNumero3);
        
        Corredor corredor4 = new Corredor((short) 2, "J", equipoNumero1);
        Corredor corredor5 = new Corredor((short) 2, "K", equipoNumero2);
        Corredor corredor6 = new Corredor((short) 2, "L", equipoNumero3);
//        
        Corredor corredor7 = new Corredor((short) 3, "P", equipoNumero1);
        Corredor corredor8 = new Corredor((short) 3, "A", equipoNumero2);
        Corredor corredor9 = new Corredor((short) 3, "B", equipoNumero3);

        ResultadosCarrera resultado = new ResultadosCarrera(equipoNumero1, equipoNumero2, equipoNumero3);
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        corredor6.start();
        corredor7.start();
        corredor8.start();
        corredor9.start();
        resultado.start();
//        
    }
}
