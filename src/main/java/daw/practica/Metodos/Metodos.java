package daw.practica.Metodos;
import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;
import daw.practica.AlmacenDeObras.AlmacenDeObras;

public class Metodos {
    public static void saludoInicial(){
    System.out.println("¿Qué desea hacer?, por favor, escriba solo el numero de la opción a elegir.");
    }

    public static void listaDeOpcionesAElegir(){
        System.out.println(" ");
        System.out.println("1. Visualizar las obras de arte existentes.");
        System.out.println("2. Dar de alta una nueva obra");
        System.out.println("3. Modificar una obra de arte expuesta.");
        System.out.println("4. Visualizar los datos de una de las obras de arte expuestas.");
        System.out.println("5. Obtener el precio de venta de una de las obras expuestas.");
        System.out.println("6. Imprimir una etiqueta de una de las obras expuestas.");
        System.out.println("7. Salir");
    }

    public static void despedidaFinal(){
        System.out.println("Hasta la próxima");
    }

    public static void lectorDepinturas(){
        for (int i = 0; i < AlmacenDeObras.getPinturasTotales().length; i++) {
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
        }
    }

    public static void lectoDeEsculturas(){
        for (int i = 0; i < AlmacenDeObras.getPinturasTotales().length; i++) {
            System.out.print(AlmacenDeObras.getPinturasTotales()[i].getId() + " ");
            System.out.print(AlmacenDeObras.getPinturasTotales()[i].getMaterial() + " ");
            System.out.print(AlmacenDeObras.getPinturasTotales()[i].getPrecio() + " Euritos ");
            System.out.print(AlmacenDeObras.getPinturasTotales()[i].getAltura() + "m ");
            System.out.print(AlmacenDeObras.getPinturasTotales()[i].getPeso() + "t ");
            System.out.print(AlmacenDeObras.getPinturasTotales()[i].getPiezas() + " ");
            System.out.print(AlmacenDeObras.getPinturasTotales()[i].getDescripcion() + " ");
            System.out.println("");
        }
    }

}
