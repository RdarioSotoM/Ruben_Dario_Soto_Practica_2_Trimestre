package daw.practica;

import java.util.InputMismatchException;
import java.util.Scanner;
import daw.practica.AlmacenDeObras.AlmacenDeObras;
import daw.practica.Metodos.Metodos_Y_Finals;

public class Administrador {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {

        Metodos_Y_Finals.saludoInicial();
        int eleccion = 0; // Debe ser 0 para iniciar el while.
        int id;

        while (eleccion != Metodos_Y_Finals.NUMERO_DE_ELECCIONES_TOTALES) {
            try {
                Metodos_Y_Finals.listaDeOpcionesAElegir();
                eleccion = consola.nextInt();
                consola.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar un número entero.");
                consola.nextLine();
                continue;
            }

            switch (eleccion) {
                case Metodos_Y_Finals.VISUALIZAR_LAS_OBRAS:
                    AlmacenDeObras.lectorDeObras();
                    continue;

                case Metodos_Y_Finals.DAR_DE_ALTA_UNA_NUEVA_OBRA:
                    AlmacenDeObras.registrandoDatos();
                    continue;

                case Metodos_Y_Finals.MODIFICAR_LOS_DATOS:
                    AlmacenDeObras.selectorDeNuevosDatos();
                    continue;

                case Metodos_Y_Finals.VIZUALIZAR_OBRA_CONCRETA:
                    id = AlmacenDeObras.selectorDeID();
                    System.out.println(AlmacenDeObras.visualizaObras(id));
                    continue;

                case Metodos_Y_Finals.OBTENER_PRECIO_VENTA:
                    id = AlmacenDeObras.selectorDeID();
                    AlmacenDeObras.precioDeVenta(id);
                    continue;

                case Metodos_Y_Finals.IMPRIMIR_UNA_ETIQUETA:
                    id = AlmacenDeObras.selectorDeID();
                    System.out.println(AlmacenDeObras.etiqueta(id));
                    continue;

                case Metodos_Y_Finals.SALIR:
                    Metodos_Y_Finals.despedidaFinal();
                    break;
                    
                default:
                    System.out.println("La opción elegida no corresponde con ninguna de las indicadas.");
                    break;
            }
        }
        consola.close();
    }
}
