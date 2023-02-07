package daw.practica;
import java.util.Scanner;
import daw.practica.AlmacenDeObras.AlmacenDeObras;
import daw.practica.Metodos.Metodos;

public class Administrador {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        Metodos.saludoInicial();
        int eleccion = 0; // Debe ser 0 para iniciar el while.
        
        while (eleccion != Metodos.NUMERO_DE_ELECCIONES_TOTALES) {
            Metodos.listaDeOpcionesAElegir();
            eleccion = consola.nextInt();
            consola.nextLine();

            switch (eleccion) {
                case Metodos.VISUALIZAR_LAS_OBRAS:
                    AlmacenDeObras.lectorDepinturas();
                    AlmacenDeObras.lectoDeEsculturas();
                    continue;
                case Metodos.DAR_DE_ALTA_UNA_NUEVA_OBRA :
                    AlmacenDeObras.registrarUnaNuevaObra();
                    continue;
                case Metodos.MODIFICAR_LOS_DATOS:
                    AlmacenDeObras.modificandoObras();
                    continue;
                case Metodos.VIZUALIZAR_OBRA_CONCRETA:
                    AlmacenDeObras.visualizaObras();
                    continue;
                case Metodos.OBTENER_PRECIO_VENTA:
                    AlmacenDeObras.precioDeVenta();
                    continue;
                case Metodos.IMPRIMIR_UNA_ETIQUETA:

                case Metodos.SALIR:
                    Metodos.despedidaFinal();
                    break;
            }
        }
        consola.close();
    }
}
