/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.mvc;

/**
 *
 * @author Valentina
 */
public class Main {
     public static void main(String[] args) {

        Modelo modelo= new Modelo();
        Vista vista = new Vista ();
        
        Controlador control = new Controlador(vista,modelo);
        control.iniciar();
        vista.setVisible(true);
    }
}
