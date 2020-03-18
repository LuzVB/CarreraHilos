/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrerahilos;

import java.util.ArrayList;
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
        ArrayList<String> pistaUbicacion = new ArrayList<>();
        pistaUbicacion = equipo.getPista();
        if (identificador == 1) {
            pistaUbicacion.set(0, nombre);
            equipo.setPista(pistaUbicacion);
        } else if (identificador == 2) {
            pistaUbicacion.set(33, nombre);
            equipo.setPista(pistaUbicacion);
        } else if (identificador == 3) {
            pistaUbicacion.set(66, nombre);
            equipo.setPista(pistaUbicacion);
        }
    }

    private void empezarACorrer() {
        ArrayList<String> pistaUbicacion = new ArrayList<>();
        int random, posicionActual, restaPosicion, posicionFinal ;
        if (identificador == 1) {
            while (equipo.getPista().get(32) != nombre) {

                pistaUbicacion = equipo.getPista();
                random = (int) (Math.random() * 3) + 1;
                posicionActual = pistaUbicacion.indexOf(nombre);
                restaPosicion = 32 - posicionActual;
                if (restaPosicion > 3) {
                    random = random;
                } else if (restaPosicion == 1) {
                    if (random > 1) {
                        random = 1;
                    }
                } else if (restaPosicion == 2) {
                    if (random > 2) {
                        random = 1;
                    }
                }

                pistaUbicacion.set(posicionActual, "-");
                pistaUbicacion.set(posicionActual + random, nombre);
                equipo.setPista(pistaUbicacion);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            synchronized (equipo.getPista().get(66)) {
                equipo.getPista().get(66).notifyAll();
            }

        } else if (identificador == 2) {
            synchronized (equipo.getPista().get(66)) {
                try {
                    equipo.getPista().get(66).wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       
            while (equipo.getPista().get(65) != nombre) {

                pistaUbicacion = equipo.getPista();
                random = (int) (Math.random() * 3) + 1;
                posicionActual = pistaUbicacion.indexOf(nombre);
                restaPosicion = 65 - posicionActual;
                if (restaPosicion > 3) {
                    random = random;
                } else if (restaPosicion == 1) {
                    if (random > 1) {
                        random = 1;
                    }
                } else if (restaPosicion == 2) {
                    if (random > 2) {
                        random = 1;
                    }
                }
                
                posicionFinal = posicionActual + random;
                
                pistaUbicacion.set(posicionActual, "-");
                pistaUbicacion.set(posicionFinal, nombre);
                equipo.setPista(pistaUbicacion);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            synchronized (equipo.getPista().get(101)) {
                equipo.getPista().get(101).notify();
            }


        } else if (identificador == 3) {
            synchronized (equipo.getPista().get(101)) {
                try {
                    equipo.getPista().get(101).wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
           
            while (equipo.getPista().get(101) != nombre) {
//                System.out.println(equipo.getPista().size() + equipo.getNombreEquipo());
                pistaUbicacion = equipo.getPista();
                random = (int) (Math.random() * 3) + 1;
                posicionActual = pistaUbicacion.indexOf(nombre);
                restaPosicion = 101 - posicionActual;
                if (restaPosicion > 3) {
                    random = random;
                } else if (restaPosicion == 1) {
                    if (random > 1) {
                        random = 1;
                    }
                } else if (restaPosicion == 2) {
                    if (random > 2) {
                        random = 1;
                    }
                }
                
                posicionFinal = posicionActual + random;
                
                if(posicionFinal >= 102){
                    posicionFinal = 101;
                }else if(posicionFinal == 100){
                    posicionFinal = 101;
                }
                else{
                    posicionFinal = posicionFinal;
                }
                
                pistaUbicacion.set(posicionActual, "-");
                pistaUbicacion.set(posicionFinal, nombre);
                equipo.setPista(pistaUbicacion);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

}
