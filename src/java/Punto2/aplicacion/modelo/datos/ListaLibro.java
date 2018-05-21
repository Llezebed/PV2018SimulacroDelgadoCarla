/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.aplicacion.modelo.datos;

import Punto2.aplicacion.dominio.Libro;
import java.util.ArrayList;

/**
 *
 * @author Florencia
 */
public class ListaLibro {
    private ArrayList<Libro> lista;
    private Libro unLibro;

    public ListaLibro() {
        lista=new ArrayList();
    }
 public void agregarLista(Libro libro){
     lista.add(libro );
 }
    
   public void eliminarLibros(Libro unLibro){
        for(Libro a:lista){
           if (a.getNombreLibro().equals(unLibro.getNombreLibro())){
                getLista().remove(lista.indexOf(a));
                break;
               
            }
        }
   }
   public void modificarLibros(Libro unLibro){
        for(Libro a:lista){
            if (a.getNombreLibro().equals(unLibro.getNombreLibro())){
                getLista().set(lista.indexOf(a), unLibro);
                break;
               
            }
        }
    }
    public ArrayList<Libro> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

    /**
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    
    
}
