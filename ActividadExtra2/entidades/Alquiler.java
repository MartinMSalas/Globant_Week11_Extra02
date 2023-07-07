/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadExtra2.entidades;



import java.time.LocalDate;
public class Alquiler {

        private Pelicula alquilada;
    private LocalDate inicioAlquiler;
    private LocalDate finAlquiler;
    private double precio;

    public Pelicula getAlquilada() {
        return alquilada;
    }

    public void setAlquilada(Pelicula alquilada) {
        this.alquilada = alquilada;
    }

    public LocalDate getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDate inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDate getFinAlquiler() {
        return finAlquiler;
    }

    public void setFinAlquiler(LocalDate finAlquiler) {
        this.finAlquiler = finAlquiler;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public Alquiler(Pelicula alquilada, LocalDate inicioAlquiler, LocalDate finAlquiler, double precio) {
        this.alquilada = alquilada;
        this.inicioAlquiler = inicioAlquiler;
        this.finAlquiler = finAlquiler;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "alquilada=" + alquilada +
                ", inicioAlquiler=" + inicioAlquiler +
                ", finAlquiler=" + finAlquiler +
                ", precio=" + precio +
                '}';
    }
}
