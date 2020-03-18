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
//        try {
//            //        imprimirResultados(equipo1);
////        imprimirResultados(equipo2);
////        imprimirResultados(equipo3);
////        Random rand = new Random();
////        while (true) {
////            imprimirResultados(equipo1);
////            imprimirResultados(equipo2);
////            imprimirResultados(equipo3);
////            System.out.println("\n");
////            try {
////                Thread.sleep(2000);
////                int random = rand.nextInt(10);
////                System.out.println(random);
////                if (random == 7) { // Quitar random y colocar hasta que alguien llegue al final 
////                    System.out.println("TERMINE");
////                    break;
////                }
////            } catch (InterruptedException ex) {
////                break;
////                //Logger.getLogger(HiloMatematico.class.getName()).log(Level.SEVERE, null, ex);
////            }
////        }
//            
//           Thread.sleep(5000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ResultadosCarrera.class.getName()).log(Level.SEVERE, null, ex);
//        }

//        for (int i = 0; i < 33; i++) {
//            imprimirResultados(equipo1);
//            System.out.println("\n");
//        }
        do {
            imprimirResultados(equipo1);
            imprimirResultados(equipo2);
            imprimirResultados(equipo3);
            System.out.println("\n");
            String valor1 =equipo1.getPista().get(101);
            String valor2 =equipo2.getPista().get(101);
            String valor3 =equipo3.getPista().get(101);
            
//            System.out.println(valor);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ResultadosCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(valor1 !=  "||"){
                System.out.println("Gano el Equipo "+equipo1.getNombreEquipo());
                break;
            }else if(valor2 !=  "||"){
                 System.out.println("Gano el Equipo "+equipo2.getNombreEquipo());
                break;
            }
            else if(valor3 !=  "||"){
                 System.out.println("Gano el Equipo "+equipo3.getNombreEquipo());
                break;
            }
        } while (true);
        
       
        
        
//        
    }
    

    private void imprimirResultados(Equipo equipo) {
        for (Object elementos : equipo.getPista()) {
            System.out.print(equipo.getColorEquipo() + elementos + "\u001B[0m");
        }
        System.out.println();
    }
}
