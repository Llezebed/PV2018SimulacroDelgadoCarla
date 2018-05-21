/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.apicacion.controlador;

import Punto1.aplicacion.modelo.datos.ListadoPalabras;
import java.io.IOException;
import java.text.Collator;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

/**
 *
 * @author Florencia
 */
@ManagedBean
@ViewScoped
public class PalabrasFormBean {
private ListadoPalabras listaPalabras;
private String unaPalabra;

        public PalabrasFormBean() {
            listaPalabras=new ListadoPalabras();
           
    }
      
        public void agregarPalabraLista(){
            if ( (unaPalabra != null) && (!unaPalabra.equals(" "))){
                listaPalabras.getListaPalabras().add(unaPalabra);
                FacesMessage message=new FacesMessage("Hecho",unaPalabra+" Fue Agregada a a lista");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
            else{
                FacesMessage message=new FacesMessage("Error",unaPalabra+"No a ingresado ningun valor,debe poner una palabra o almenos un caracter");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }
        }
public void reiniciarLista(){
    listaPalabras=new ListadoPalabras();
    FacesMessage message=new FacesMessage("Lista Reiniciada");
                FacesContext.getCurrentInstance().addMessage(null, message);
}
public void ordenarAlfabeticamente(){
    
   
    if (listaPalabras.getListaPalabras().size()>1){
                     
   Collections.sort(listaPalabras.getListaPalabras());
       FacesMessage message=new FacesMessage("Se ha ordenado alfabeticamente la lista");
                FacesContext.getCurrentInstance().addMessage(null, message);}
    else{
        FacesMessage message=new FacesMessage("No se puede ordenar,solo hay una palabra en la lista");
                FacesContext.getCurrentInstance().addMessage(null, message);

           
    }
}
   
    public String getUnaPalabra() {
        return unaPalabra;
    }
    /**
     * @return the listaPalabras
     */
    public ListadoPalabras getListaPalabras() {
        return listaPalabras;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(ListadoPalabras listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

 
    /**
     * @param unaPalalabra the unaPalabra to set
     */
    public void setUnaPalabra(String unaPalalabra) {
        this.unaPalabra = unaPalalabra;
    }
    
}
