/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrerahilos;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luz
 */
public class ResultadosCarrera extends Thread {

    private Equipo equipo1, equipo2, equipo3;

    public ResultadosCarrera(Equipo equipo1, Equipo equipo2, Equipo equipo3) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.equipo3 = equipo3;

    }

    @Override
    public void run() {
        boolean resultado = false;
        System.out.println("                             CARRERA DE RELEVOS");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(equipo1.getColorEquipo() + equipo1.getNombreEquipo()
                + "\u001B[0m" + "      " + equipo2.getColorEquipo() + equipo2.getNombreEquipo() + "\u001B[0m"
                + "      " + equipo3.getColorEquipo() + equipo3.getNombreEquipo() + "\u001B[0m");
        System.out.println(" ");
        do {
            imprimirResultados(equipo1);
            imprimirResultados(equipo2);
            imprimirResultados(equipo3);
            System.out.println("\n");
            resultado = ganador();
            try {
                Thread.sleep(2000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ResultadosCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (resultado == false);
    }

    private void imprimirResultados(Equipo equipo) {
        for (Object elementos : equipo.getPista()) {
            System.out.print(equipo.getColorEquipo() + elementos + "\u001B[0m");
        }
        System.out.println();
    }

    private boolean ganador() {
        boolean ganador = false;
        String valor1 = equipo1.getPista().get(101);
        String valor2 = equipo2.getPista().get(101);
        String valor3 = equipo3.getPista().get(101);
        
        if (valor1 != "||" && valor2 != "||" && valor3 != "||") {
            System.out.println("Empate entre los equipos: " + equipo1.getColorEquipo() + equipo1.getNombreEquipo()
                    + "\u001B[0m" + " y " + equipo2.getColorEquipo() + equipo2.getNombreEquipo() + "\u001B[0m"
                    + " y " + equipo3.getColorEquipo() + equipo3.getNombreEquipo() + "\u001B[0m");
            ganador = true;
        } else if (valor1 != "||" && valor2 != "||") {
            System.out.println("Empate entre los equipos: " + equipo1.getColorEquipo() + equipo1.getNombreEquipo()
                    + "\u001B[0m" + " y " + equipo2.getColorEquipo() + equipo2.getNombreEquipo() + "\u001B[0m");
            ganador = true;
        } else if (valor1 != "||" && valor3 != "||") {
            System.out.println("Empate entre los equipos: " + equipo1.getColorEquipo() + equipo1.getNombreEquipo()
                    + "\u001B[0m" + " y " + equipo3.getColorEquipo() + equipo3.getNombreEquipo() + "\u001B[0m");
            ganador = true;
        } else if (valor2 != "||" && valor3 != "||") {
            System.out.println("Empate entre los equipos: " + equipo2.getColorEquipo() + equipo2.getNombreEquipo()
                    + "\u001B[0m" + " y " + equipo3.getColorEquipo() + equipo3.getNombreEquipo() + "\u001B[0m");
            ganador = true;
        } else if (valor1 != "||") {
            System.out.println("Gano el Equipo " + equipo1.getColorEquipo() + equipo1.getNombreEquipo());
            ganador = true;
        } else if (valor2 != "||") {
            System.out.println("Gano el Equipo " + equipo2.getColorEquipo() + equipo2.getNombreEquipo());
            ganador = true;
        } else if (valor3 != "||") {
            System.out.println("Gano el Equipo " + equipo3.getColorEquipo() + equipo3.getNombreEquipo());
            ganador = true;
        }

        return ganador;
    }
}
