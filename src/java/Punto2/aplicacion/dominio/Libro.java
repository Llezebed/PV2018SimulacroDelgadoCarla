/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.aplicacion.dominio;

/**
 *
 * @author Florencia
 */
public class Libro {
    private String nombreLibro;
    private String autor;
    private String codigo;

    public Libro() {
    }

    public Libro(String nombreLibro, String autor, String codigo) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.codigo = codigo;
    }

    /**
     * @return the nombreLibro
     */
    public String getNombreLibro() {
        return nombreLibro;
    }

    /**
     * @param nombreLibro the nombreLibro to set
     */
    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
}
