/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.aplicacion.controlador;

import Punto3.aplicacion.modelo.datos.ListadoImagenes;
import Punto3.aplicacion.modelo.dominio.Imagen;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Florencia
 */
@ManagedBean
@SessionScoped
public class ImagenFormBean implements Serializable {
  private transient UploadedFile file=null;
  private byte[] imagen;
  private byte[] NuevaImagen;
    private ListadoImagenes listadoImagenes;
    public ImagenFormBean() {
        listadoImagenes=new ListadoImagenes();
    } 
    public void reiniciarImagen() {
        listadoImagenes=new ListadoImagenes();
    } 
    public ArrayList<Imagen> obtenerListaImagenes(){
       return listadoImagenes.getListaImagenes();
   }
  
public void agregarImagen() throws ParseException{
    setImagen(file.getContents());
    getListadoImagenes().llenarListado(imagen);
    FacesMessage message=new FacesMessage("Succesful",file.getFileName()+"is uploaded");
    FacesContext.getCurrentInstance().addMessage(null, message);
}
public StreamedContent getImagenSubida()throws IOException{
    FacesContext context= FacesContext.getCurrentInstance();
    if(context.getCurrentPhaseId()==PhaseId.RENDER_RESPONSE){
        return new DefaultStreamedContent();
        
    }
    else
        
    { String nuevaImg= context.getExternalContext().getRequestParameterMap().get("numImg");
    //No puedo convertir true desde tipo class java.lang.String a int, ese es el error que me dice el index, pero si deberia poder,no pude arreglarlo
      int indice= Integer.parseInt(nuevaImg);
      setNuevaImagen(getListadoImagenes().getListaImagenes().get(indice).getImagen());
    if(getImagen()==null){
            return null;}
        else{
            return new DefaultStreamedContent(new ByteArrayInputStream(getNuevaImagen()));
        }
    }
        }



    
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the auximg
     */
    public byte[] getNuevaImagen() {
        return NuevaImagen;
    }

    /**
     * @param auximg the auximg to set
     */
    public void setNuevaImagen(byte[] auximg) {
        this.NuevaImagen = auximg;
    }

    /**
     * @return the listadoImagenes
     */
    public ListadoImagenes getListadoImagenes() {
        return listadoImagenes;
    }

    /**
     * @param listadoImagenes the listadoImagenes to set
     */
    public void setListadoImagenes(ListadoImagenes listadoImagenes) {
        this.listadoImagenes = listadoImagenes;
    }
    
    
}
