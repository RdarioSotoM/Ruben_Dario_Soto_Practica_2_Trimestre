package daw.practica;
import java.util.Scanner;

import daw.practica.AlmacenDeObras.AlmacenDeObras;
import daw.practica.Metodos.Metodos;
import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;
import daw.practica.RegistradorDeObras.RegistradorDeObras;;

public class App {
    public static void main(String[] args) {
        final int VISUALIZAR_LAS_OBRAS = 1;
        Scanner consola = new Scanner(System.in);
        Metodos.saludoInicial();
        int eleccion = 0; // Debe ser 0 para iniciar el while.
        final int NUMERO_DE_ELECCIONES_TOTALES = 7;
        while (eleccion != NUMERO_DE_ELECCIONES_TOTALES) {
            Metodos.listaDeOpcionesAElegir();
            eleccion = consola.nextInt();
            consola.nextLine();

            switch (eleccion) {
                case VISUALIZAR_LAS_OBRAS:
                    Metodos.lectorDepinturas();
                    Metodos.lectoDeEsculturas();
                    continue;
                case 2:
                    RegistradorDeObras.RegistrarUnaNuevaObra();
                    continue;
                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                    Metodos.despedidaFinal();
                    break;
            }
        }
    }
}
