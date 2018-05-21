/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.aplicacion.modelo.dominio;

import java.io.Serializable;


/**
 *
 * @author Florencia
 */
public class Imagen implements Serializable {
    private int numImg;
    
    private byte[] imagen;

    public Imagen() {
    }

    public Imagen(int numImg, byte[] imagen) {
        this.numImg = numImg;
        
        this.imagen = imagen;
    }

    /**
     * @return the numImg
     */
    public int getNumImg() {
        return numImg;
    }

    /**
     * @param numImg the numImg to set
     */
    public void setNumImg(int numImg) {
        this.numImg = numImg;
    }

  
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
    
    
}
