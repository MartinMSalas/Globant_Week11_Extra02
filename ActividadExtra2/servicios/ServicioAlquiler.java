/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadExtra2.servicios;

import ActividadExtra2.entidades.Alquiler;
import ActividadExtra2.entidades.Pelicula;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Valer
 */
public class ServicioAlquiler {
//    private Pelicula alquilada;
//    private LocalDate inicioAlquiler;
//    private LocalDate finAlquiler;
//    private double precio;
    Alquiler[] alquileres = {};

    public void cargarAlquileres(Pelicula peli, double precio) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese La fecha de inicio del Alquiler");
        // "2020-10-15"
        String fechaInicio = leer.next();
        LocalDate inicioAlquiler =  LocalDate.parse(fechaInicio);
        System.out.println("Ingrese La fecha de fin del Alquiler");
        String fechaFinAlquiler = leer.next();
        LocalDate finAlquiler = LocalDate.parse(fechaFinAlquiler);

        Alquiler alqui = new Alquiler(peli,  inicioAlquiler,  finAlquiler,  precio);
        int n = alquileres.length;
        Alquiler[] auxiliar = new Alquiler[n + 1];
        for (int i = 0; i < n; i++) {
            auxiliar[i] = alquileres[i];
        }
        auxiliar[n] = alqui;
        alquileres = auxiliar;

    }
    public void listar(){
        for (Alquiler alqui : alquileres) {
            System.out.println(alqui);
        }
    }

    public void buscarFechaAlquiler() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la fecha de inicio del alquiler que desea buscar");
        String fechaInicio = leer.next();
        LocalDate inicioAlquiler =  LocalDate.parse(fechaInicio);
        System.out.println("Ingrese La fecha de fin del Alquiler");
        String fechaFinAlquiler = leer.next();
        LocalDate finAlquiler = LocalDate.parse(fechaFinAlquiler);
        for (Alquiler alqui : alquileres) {
            if (alqui.getInicioAlquiler().equals(inicioAlquiler) || alqui.getFinAlquiler().equals(finAlquiler)) {
                System.out.println("El alquiler que busca fue encontrado: ");
                System.out.println(alqui);
                break;
            }
        }
    }


    public void calcularIngresoTotal() {
        double total = 0;
        for (Alquiler alqui : alquileres) {
            total += alqui.getPrecio();
        }
        System.out.println("El ingreso total es de: " + total);
        for (Alquiler alqui : alquileres) {
            total += alqui.getPrecio();
        }
        System.out.println("El ingreso total es de: " + total);
    }
}
