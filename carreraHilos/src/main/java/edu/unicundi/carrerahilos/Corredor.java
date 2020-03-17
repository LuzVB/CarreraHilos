/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrerahilos;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luz
 */
public class Corredor extends Thread {

    private short identificador;
    private String nombre;
    private Equipo equipo;

    public Corredor(short identificador, String nombre, Equipo equipo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.equipo = equipo;
        ubicarCorredor();
    }

    @Override
    public void run() {
        empezarACorrer();
    }

    private void ubicarCorredor() {
        String[] pistaUbicacion;
        pistaUbicacion = equipo.getPista();
        if (identificador == 1) {
            pistaUbicacion[0] = nombre;
            equipo.setPista(pistaUbicacion);
        } else if (identificador == 2) {
            pistaUbicacion[33] = nombre;
            equipo.setPista(pistaUbicacion);
        } else if (identificador == 3) {
            pistaUbicacion[66] = nombre;
            equipo.setPista(pistaUbicacion);
        }
    }

    private void empezarACorrer() {
        String[] pistaUbicacion;
        int numero, posicionActual;
        if (identificador == 1) {
//            while (equipo.getPista()[33] != nombre) {
//                pistaUbicacion = equipo.getPista();
//                numero = (int) (Math.random() * 3) + 1;
//                posicionActual = Arrays.binarySearch(pistaUbicacion, nombre);
//                pistaUbicacion[posicionActual] = "-";
//                pistaUbicacion[posicionActual + numero] = nombre;
//                equipo.setPista(pistaUbicacion);
//            }
        } else if (identificador == 2) {

        } else if (identificador == 3) {

        }
    }

}
