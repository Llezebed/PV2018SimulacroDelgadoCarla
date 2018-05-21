/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.aplicacion.modelo.datos;

import Punto3.aplicacion.modelo.dominio.Imagen;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Florencia
 */
public class ListadoImagenes {
    private byte[] Imagen;
    private int numImg;
   private ArrayList<Imagen> listaImagenes;
   private Date fecha;

    public ListadoImagenes() {
        listaImagenes=new ArrayList();
    }
    public void llenarListado(byte[] imgGuardar ){
        if (getListaImagenes().isEmpty()){
            setNumImg(0);
        }
        else{
            setNumImg(getListaImagenes().size());
        }
        getListaImagenes().add(new Imagen(getNumImg(),imgGuardar));
    }

    /**
     * @return the arr
     */
    public ArrayList<Imagen> getListaImagenes() {
        return listaImagenes;
    }

  
    public void setListamagenes(ArrayList<Imagen> listaImagenes) {
        this.setListaImagenes(listaImagenes);
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return Imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.Imagen = imagen;
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

    /**
     * @param listaImagenes the listaImagenes to set
     */
    public void setListaImagenes(ArrayList<Imagen> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
   
   
   
    
}
