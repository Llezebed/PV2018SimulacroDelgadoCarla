/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.aplicacion.modelo.dominio;

/**
 *
 * @author Florencia
 */
public class Palabra {
    private String palabra;

    public Palabra() {
    }

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

   
    
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
