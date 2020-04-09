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
 * @author Valentina
 */
public class Controlador implements ActionListener {

    private Vista vista;
    private Modelo modelo;
    DefaultListModel modelolista = new DefaultListModel<>();
   
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnAgregar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("EJEMPLO MVC");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNombre(vista.txtNombre.getText());
        vista.listNombres.setModel(modelolista);
        modelolista.addElement(modelo.getNombre());
        vista.txtNombre.setText("");
 
    }

}
