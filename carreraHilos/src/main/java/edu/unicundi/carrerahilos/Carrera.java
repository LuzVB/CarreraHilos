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

    public void empezar() {
        Equipo equipoNumero1 = new Equipo("Los Aguilas", (short) 1);
        Equipo equipoNumero2 = new Equipo("Los Aguilas2", (short) 2);
        Equipo equipoNumero3 = new Equipo("Los Aguilas2", (short) 3);

        Corredor corredor1 = new Corredor((short) 1, "X", equipoNumero1);
        Corredor corredor2 = new Corredor((short) 2, "W", equipoNumero1);
        Corredor corredor3 = new Corredor((short) 3, "Q", equipoNumero1);

        ResultadosCarrera resultado = new ResultadosCarrera(equipoNumero1, equipoNumero2, equipoNumero3);
        resultado.start();
        corredor1.start();
//        corredor2.start();
    }
}
