package daw.practica;
import java.util.Scanner;

import daw.practica.AlmacenDeObras.AlmacenDeObras;
import daw.practica.Metodos.Metodos;
import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;
import daw.practica.RegistradorDeObras.RegistradorDeObras;
import daw.practica.VisualizadorDeObras.VisualizadorDeObras;
import daw.practica.ModificadorDeObras.ModificadorDeObras;

public class Administrador {
    public static void main(String[] args) {
        final int VISUALIZAR_LAS_OBRAS = 1;
        final int DAR_DE_ALTA_UNA_NUEVA_OBRA = 2;
        final int MODIFICAR_LOS_DATOS = 3;
        final int VIZUALIZAR_OBRA_CONCRETA = 4;
        final int OBTENER_PREVIO_VENTA = 5;
        final int IMPRIMIR_UNA_ETIQUETA = 6;
        final int SALIR = 7;

        final int NUMERO_DE_ELECCIONES_TOTALES = 7;

        Scanner consola = new Scanner(System.in);
        Metodos.saludoInicial();
        int eleccion = 0; // Debe ser 0 para iniciar el while.
        
        while (eleccion != NUMERO_DE_ELECCIONES_TOTALES) {
            Metodos.listaDeOpcionesAElegir();
            eleccion = consola.nextInt();
            consola.nextLine();

            switch (eleccion) {
                case VISUALIZAR_LAS_OBRAS:
                    Metodos.lectorDepinturas();
                    Metodos.lectoDeEsculturas();
                    continue;
                case DAR_DE_ALTA_UNA_NUEVA_OBRA :
                    RegistradorDeObras.RegistrarUnaNuevaObra();
                    continue;
                case MODIFICAR_LOS_DATOS:
                    ModificadorDeObras.ModificandoObras();
                    continue;
                case VIZUALIZAR_OBRA_CONCRETA:
                    VisualizadorDeObras.VisualizaObras();
                    continue;
                case OBTENER_PREVIO_VENTA:

                case IMPRIMIR_UNA_ETIQUETA:

                case SALIR:
                    Metodos.despedidaFinal();
                    break;
            }
        }
        consola.close();
    }
}
