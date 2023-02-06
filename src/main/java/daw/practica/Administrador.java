package daw.practica;
import java.util.Scanner;

import daw.practica.AlmacenDeObras.AlmacenDeObras;
import daw.practica.Metodos.Metodos;
import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;

public class Administrador {
    static final int VISUALIZAR_LAS_OBRAS = 1;
    static final int DAR_DE_ALTA_UNA_NUEVA_OBRA = 2;
    static final int MODIFICAR_LOS_DATOS = 3;
    static final int VIZUALIZAR_OBRA_CONCRETA = 4;
    static final int OBTENER_PRECIO_VENTA = 5;
    static final int IMPRIMIR_UNA_ETIQUETA = 6;
    static final int SALIR = 7;

    static final int NUMERO_DE_ELECCIONES_TOTALES = 7;

    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        Metodos.saludoInicial();
        int eleccion = 0; // Debe ser 0 para iniciar el while.
        
        while (eleccion != NUMERO_DE_ELECCIONES_TOTALES) {
            Metodos.listaDeOpcionesAElegir();
            eleccion = consola.nextInt();
            consola.nextLine();

            switch (eleccion) {
                case VISUALIZAR_LAS_OBRAS:
                    AlmacenDeObras.lectorDepinturas();
                    AlmacenDeObras.lectoDeEsculturas();
                    continue;
                case DAR_DE_ALTA_UNA_NUEVA_OBRA :
                    AlmacenDeObras.registrarUnaNuevaObra();
                    continue;
                case MODIFICAR_LOS_DATOS:
                    AlmacenDeObras.modificandoObras();
                    continue;
                case VIZUALIZAR_OBRA_CONCRETA:
                    AlmacenDeObras.visualizaObras();
                    continue;
                case OBTENER_PRECIO_VENTA:

                case IMPRIMIR_UNA_ETIQUETA:

                case SALIR:
                    Metodos.despedidaFinal();
                    break;
            }
        }
        consola.close();
    }
}
