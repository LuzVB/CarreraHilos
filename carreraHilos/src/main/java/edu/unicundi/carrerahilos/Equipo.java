/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrerahilos;

import java.util.ArrayList;

/**
 *
 * @author Luz
 */
public class Equipo {
    /**
     * Variable que guarda las pósiciones de los corredores 
     * simulando en que parte de la pista van.
     */
    private String[] pista = new String[101];
    ArrayList<String> lista = new ArrayList<>();

    
    /**
     * Variable que almacena el nombre del equipo
     * para mostrar al final si es el ganador 
     */
    private String nombreEquipo;
    /**
     * variable que almacena el color para pintar en consola
     */
    private String colorEquipo;

    /**
     * variable que almacena un id para identificar a que equipo 
     * le coresponde un color 
     */
    private short identificador;
    
    /**
     * 
     * @param nombreEquipo
     * @param identificador 
     * 
     * costructor el cual llama a los metodos de la clase 
     * los cuales llenan el carril y seleccionan el color del equipo
     */
    public Equipo(String nombreEquipo, short identificador){
        this.nombreEquipo = nombreEquipo;
        this.identificador = identificador;
        llenarCarril();
        colorCorrespondiente();
    } 
    
    /**
     * Metodo que llena un vector de 101 posiciones la cual 
     * es la representacion del carril de los corredores
     */
    private void llenarCarril(){
        for (int i = 0; i < pista.length; i++) {
           pista[i]="-";
        }
        pista[pista.length-1] = "||";
        
        for (int i = 0; i < 101; i++) {
           lista.add(i, "-");
        }
        lista.add(lista.size()-1, "||");
    }
    
    /**
     * Segun el numero del equipo selecciona el color
     * del equipo 
     */
    private void colorCorrespondiente(){
        switch (this.identificador){
            case 1:
                this.colorEquipo = "\u001B[34m";
                break;
            case 2:
                this.colorEquipo = "\u001B[35m";
                break;
            case 3:
                this.colorEquipo = "\u001B[32m";
                break;
            default:
                break;
        }
    }

    public String[] getPista() {
        return pista;
    }

    public void setPista(String[] pista) {
        this.pista = pista;
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getColorEquipo() {
        return colorEquipo;
    }

    public void setColorEquipo(String colorEquipo) {
        this.colorEquipo = colorEquipo;
    }

    public short getIdentificador() {
        return identificador;
    }

    public void setIdentificador(short identificador) {
        this.identificador = identificador;
    }
    
    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    } 
}
