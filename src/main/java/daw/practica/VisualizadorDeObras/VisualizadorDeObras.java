package daw.practica.VizualizadorDeObras;

import java.util.Scanner;
import daw.practica.AlmacenDeObras.AlmacenDeObras;

public class VizualizadorDeObras {
    public static void VisualizaObras() {
        Scanner consola = new Scanner(System.in);

        System.out.println("Escriba el ID de la obra que desea visualizar.");
        int id = consola.nextInt();

        for (int i = 0; i < AlmacenDeObras.getPinturasTotales().length; i++) {
            if (AlmacenDeObras.getPinturasTotales()[i].getId() == id) {
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getId() + " ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getNombre() + " ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getAutor() + " ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getTecnica() + " ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getPrecio() + " Euritos ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getAltura() + "m ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getPeso() + "t ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getPiezas() + " ");
                System.out.print(AlmacenDeObras.getPinturasTotales()[i].getDescripcion() + " ");
                System.out.println("");

                System.out.println(" ");
            }
        }

        for (int i = 0; i < AlmacenDeObras.getEsculturasTotales().length; i++) {
            if (AlmacenDeObras.getEsculturasTotales()[i].getId() == id) {
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getId() + " ");
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getNombre() + " ");
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getMaterial() + " ");
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getPrecio() + " Euritos ");
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getAltura() + "m ");
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getPeso() + "t ");
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getPiezas() + " ");
                System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getDescripcion() + " ");
                System.out.println("");

                System.out.println(" ");
            }
        }
    }
}
