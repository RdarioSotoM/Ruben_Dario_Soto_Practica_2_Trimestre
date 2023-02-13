package daw.practica;
import java.util.Scanner;
import daw.practica.AlmacenDeObras.AlmacenDeObras;
import daw.practica.Metodos.Metodos_Y_Finals;

public class Administrador {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        Metodos_Y_Finals.saludoInicial();
        int eleccion = 0; // Debe ser 0 para iniciar el while.
        
        while (eleccion != Metodos_Y_Finals.NUMERO_DE_ELECCIONES_TOTALES) {
            Metodos_Y_Finals.listaDeOpcionesAElegir();
            eleccion = consola.nextInt();
            consola.nextLine();

            switch (eleccion) {
                case Metodos_Y_Finals.VISUALIZAR_LAS_OBRAS:
                    AlmacenDeObras.lectorDepinturas();
                    AlmacenDeObras.lectoDeEsculturas();
                    continue;
                case Metodos_Y_Finals.DAR_DE_ALTA_UNA_NUEVA_OBRA :
                    AlmacenDeObras.registrarUnaNuevaObra();
                    continue;
                case Metodos_Y_Finals.MODIFICAR_LOS_DATOS:
                    AlmacenDeObras.modificandoObras();
                    continue;
                case Metodos_Y_Finals.VIZUALIZAR_OBRA_CONCRETA:
                    AlmacenDeObras.visualizaObras();
                    continue;
                case Metodos_Y_Finals.OBTENER_PRECIO_VENTA:
                    AlmacenDeObras.precioDeVenta();
                    continue;
                case Metodos_Y_Finals.IMPRIMIR_UNA_ETIQUETA:

                case Metodos_Y_Finals.SALIR:
                    Metodos_Y_Finals.despedidaFinal();
                    break;
            }
        }
        consola.close();
    }
}
