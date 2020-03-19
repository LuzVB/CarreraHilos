/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.carrerahilos;

/**
 *
 * @author valentina Sarmiento
 */
public class ParametrosCarrera {

    /**
     * Variable que almacena la representacion del recorrido 0 a distancia.
     */
    private short distancia;
    /**
     * Variables que almacenan donde se van a ubicar los corredores
     */
    private short posicionCorredor1, posicionCorredor2, posicionCorredor3;

    /**
     * costructor el cual inicializa los valores 
     * de la distancia y ubicacion de los Corredores
     * @param distancia valor de la  distancia
     * @param posicionCorredor1 valor de la ubicación del corredor 1 
     * @param posicionCorredor2 valor de la ubicación del corredor 2
     * @param posicionCorredor3 valor de la ubicación del corredor 3
     */
    public ParametrosCarrera(short distancia ,short posicionCorredor1,short posicionCorredor2,short posicionCorredor3) {
        this.distancia = distancia;
        this.posicionCorredor1 = posicionCorredor1;
        this.posicionCorredor2 = posicionCorredor2;
        this.posicionCorredor3 = posicionCorredor3;
    }
    /**
     * Metodo para mostrar el valor de la distancia
     * @return distancia retorna el valor de la distancia
     */   
    public short getDistancia() {
        return distancia;
    }
    /**
     * Metodo para modificar el valor de la distancia
     * @param distancia valor a modificar de la distancia
     */
    public void setDistancia(short distancia) {
        this.distancia = distancia;
    }
    /**
     * Metodo para mostrar el valor de la posicion del corredor 1 
     * @return posicionCorredor1 retorna el valor de la posicion del corredor 1
     */
    public short getPosicionCorredor1() {
        return posicionCorredor1;
    }
    /**
     * Metodo para modificar el valor de la posicion del corredor 1
     * @param posicionCorredor1 valor a modificar de la posicion del corredor1
     */
    public void setPosicionCorredor1(short posicionCorredor1) {
        this.posicionCorredor1 = posicionCorredor1;
    }
    /**
     * Metodo para mostrar el valor de la posicion del corredor 2
     * @return posicionCorredor2 retorna el valor de la posicion del corredor 
     */
    public short getPosicionCorredor2() {
        return posicionCorredor2;
    }
    /**
      * Metodo para modificar el valor de la posicion del corredor 2
      * @param posicionCorredor2 valor a modificar de la posicion del corredor2
     */
    public void setPosicionCorredor2(short posicionCorredor2) {
        this.posicionCorredor2 = posicionCorredor2;
    }
    /**
     * Metodo para mostrar el valor de la posicion del corredor 3 
     * @return posicionCorredor1 retorna el valor de la posicion del corredor 3
     */
    public short getPosicionCorredor3() {
        return posicionCorredor3;
    }
   /**
    * * Metodo para modificar el valor de la posicion del corredor 3
      * @param posicionCorredor3 valor a modificar de la posicion del corredor 3
    */
    public void setPosicionCorredor3(short posicionCorredor3) {
        this.posicionCorredor3 = posicionCorredor3;
    }
    
    
}
