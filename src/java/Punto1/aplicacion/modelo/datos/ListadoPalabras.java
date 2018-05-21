/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.aplicacion.modelo.datos;

import java.util.ArrayList;



/**
 *
 * @author Florencia
 */
public class ListadoPalabras {
    private ArrayList <String> listaPalabra;
    private String unaPalabra;

    public ListadoPalabras() {
        listaPalabra=new ArrayList();
    }
public void cargarPalabra(){
    if(unaPalabra.equals("") || unaPalabra.equals(" ")){
    getListaPalabras().add(unaPalabra);
    }
    else{
        System.out.println("Debe escribir una palabra");
    }
}


    /**
     * @param unaPalabra the unaPalabra to set
     */
    public void setUnaPalabra(String unaPalabra) {
        this.unaPalabra = unaPalabra;
    }

    /**
     * @return the listaPalabras
     */
    public ArrayList <String> getListaPalabras() {
        return listaPalabra;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(ArrayList <String> listaPalabras) {
        this.listaPalabra = listaPalabras;
    }
    
    
}
