/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;


/**
 *
 * @author Luz
 */
public class Controlador implements ActionListener {

    /**
     * Variables de tipo objeto que estancia la  clase Vista 
     */
    private Vista vista;
    /**
     * Variables de tipo objeto que estancia la  clase Modelo
     */
    private Modelo modelo;
    /**
     * Crear modelo para asignarselo a la lista 
     */
    DefaultListModel modelolista = new DefaultListModel<>();
   
    /**
     * costructor que  inicializa las clases Modelo,Vista 
     * y traer la accion del boton.
     * @param vista clase Vista
     * @param modelo Clase Modelo 
     */
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnAgregar.addActionListener(this);
    }
    /**
     * Metodo que inicializa la ventana de la interfaz 
     */
    public void iniciar() {
        vista.setTitle("EJEMPLO MVC");
        vista.setLocationRelativeTo(null);
    }

    /**
     * Metodo que cumple las funciones que  se van a realizar con  el boton 
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNombre(vista.txtNombre.getText());
        vista.listNombres.setModel(modelolista);
        modelolista.addElement(modelo.getNombre());
        vista.txtNombre.setText("");
 
    }

}