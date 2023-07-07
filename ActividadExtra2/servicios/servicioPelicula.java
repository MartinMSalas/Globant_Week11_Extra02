/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadExtra2.servicios;

import ActividadExtra2.entidades.Pelicula;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Valer
 */
public class servicioPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pelicula[] pelis={} ;



    public void cargar() {
        System.out.println("Ingrese el titulo de la pelicula ");
        String titulo = leer.next();
        System.out.println("Ingrese la duracion de la peli");
        int duracion = leer.nextInt();
        System.out.println("Ingrese el genero de la peli");
        String genero = leer.next();
        System.out.println("Ingrese el año de creacion ");
        int anio = leer.nextInt();

        int n = pelis.length;
        Pelicula[] auxiliar = new Pelicula[n+1];
        for (int i = 0; i < n; i++) {
            auxiliar[i]= pelis[i];
        }
        Pelicula peli = new Pelicula(titulo, duracion, genero, anio);
        auxiliar[n]= peli;
        pelis = auxiliar;


    }
    public void listar(){
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }


    }

    public Pelicula[] getPelis() {
        return pelis;
    }

    public void setPelis(Pelicula[] pelis) {
        this.pelis = pelis;
    }

    public void buscarTitulo() {
        System.out.println("Ingrese el titulo de la pelicula que desea buscar");
        String titulo = leer.next();
        for (Pelicula peli : pelis) {
            if (peli.getTitulo().equals(titulo)) {
                System.out.println("Se encontro la pelicula");
                System.out.println(peli);
                break;
            }
        }
    }

    public void buscarGenero() {
        System.out.println("Ingrese el genero de la pelicula que desea buscar");
        String genero = leer.next();
        for (Pelicula peli : pelis) {
            if (peli.getGenero().equals(genero)) {
                System.out.println("Se encontro la pelicula");
                System.out.println(peli);
            }
        }
    }

//    public void buscarFecha() {
//        System.out.println("Ingrese el año de la pelicula que desea buscar");
//        int anio = leer.nextInt();
//        for (Pelicula peli : pelis) {
//            if (peli.getAnio() == anio) {
//                System.out.println("Se encontro la pelicula");
//                System.out.println(peli);
//            }
//        }
//    }
}
