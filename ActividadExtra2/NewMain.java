package ActividadExtra2;

import ActividadExtra2.servicios.ServicioAlquiler;
import ActividadExtra2.servicios.servicioPelicula;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int eleccion;
        servicioPelicula sp = new servicioPelicula();
        ServicioAlquiler sa = new ServicioAlquiler();
        do {
        do {
        System.out.println("1. cargar una pelicula");
        System.out.println("2. hacer una lista de todas las peliculas");
        System.out.println("3. crear un alquiler,");
        System.out.println("4. realizar una lista de todos los alquileres");
        System.out.println("5. buscar peliculas por titulo");
        System.out.println("6. buscar peliculas por genero");
        System.out.println("7. buscar alquiler por fecha");
        System.out.println("8. Calcular ingreso total del servicio de alquiler");
        System.out.println("9. salir");
        eleccion = leer.nextInt();
        } while (eleccion>9 || eleccion <1);
        switch(eleccion){
            case 1:
                sp.cargar();
                break;
            case 2:
                sp.listar();
                break;
            case 3:
                sa.cargarAlquileres(sp.getPelis()[0],10 );
                break;
            case 4:
                sa.listar();
                break;
            case 5:
                sp.buscarTitulo();
                break;
            case 6:
                sp.buscarGenero();
                break;
            case 7:
                sa.buscarFechaAlquiler();
            case 8:
                sa.calcularIngresoTotal();
        }
        } while (eleccion!=9);
    }
    
}
