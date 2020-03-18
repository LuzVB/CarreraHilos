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
//    private String[] lista = new String[101];
    ArrayList<String> pista = new ArrayList<>();

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
//        for (int i = 0; i < pista.length; i++) {
//           pista[i]="-";
//        }
//        pista[pista.length-1] = "||";
        
        for (int i = 0; i < 101; i++) {
           pista.add(i, "-");
        }
        pista.add(pista.size(), "||");
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

    /**
     * Metodo para mostrar cual a sido el nombre del equipo
     * @return nombreEquipo retorna el valor del equipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    /**
     * Metodo para modificar el nombre  del equipo
     * @param nombreEquipo modificar el nombre  del equipo
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    /**
     * Metodo para mostrar cual a sido el color del equipo
     * @return  colorEquipo retorna el color de equipo
     */
    public String getColorEquipo() {
        return colorEquipo;
    }
    /**
     * Metodo para modificar el color  del equipo
     * @param colorEquipo  modificar el  color del equipo
     */
    public void setColorEquipo(String colorEquipo) {
        this.colorEquipo = colorEquipo;
    }
    /**
     * Metodo para mostrar cual a sido el identificadro del corredor
     * @return identificador retorna el identificador del corredor 
     */
    public short getIdentificador() {
        return identificador;
    }
    /**
     * Metodo para modificar el identificador del equipo
     * @param identificador modificar el valor del identificador
     */
    public void setIdentificador(short identificador) {
        this.identificador = identificador;
    }
    /**
     * Metodo para mostrar la pista  
     * @return pista retorna array
     */
    
    public ArrayList<String> getPista() {
        return pista;
    }
    /**
     * Metodo para modificar la pista de los corredores 
     * @param pista modificar la pista
     */
    public void setPista(ArrayList<String> pista) {
        this.pista = pista;
    }
  
}
