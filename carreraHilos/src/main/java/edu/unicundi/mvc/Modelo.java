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
public class Modelo {
    /**
     * Nombre de las persona 
     */
     private String nombre;
    /**
     * Metodo que muestra el nombre agregado 
     * @return nombre  retorna el nombre de la persona 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para modificar el nombre  de la persona 
     * @param nombre modificar el valor del nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
