/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadExtra2.entidades;

import java.time.LocalDate;
public class Pelicula {
    private String titulo;
    private int duracion;
    private String genero;
    private int anio;

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + ", anio=" + anio + '}';
    }

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, String genero, int anio) {

        this.titulo = titulo;

        this.duracion = duracion;

        this.genero = genero;
        
        this.anio = anio;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
