package daw.practica.Metodos;


public class Metodos {
    
    public static final int VISUALIZAR_LAS_OBRAS = 1;
    public static final int DAR_DE_ALTA_UNA_NUEVA_OBRA = 2;
    public static final int MODIFICAR_LOS_DATOS = 3;
    public static final int VIZUALIZAR_OBRA_CONCRETA = 4;
    public static final int OBTENER_PRECIO_VENTA = 5;
    public static final int IMPRIMIR_UNA_ETIQUETA = 6;
    public static final int SALIR = 7;
    public static final int NUMERO_DE_ELECCIONES_TOTALES = 7;
    public static final int COMISION_DE_LA_GALERIA = 25;
    public static final int COMISION_PESO_MAX = 100;
    public static final int COMISION_PESO_MIN = 20;
    public static final int COMISION_ALTURA_MAX = 100;
    public static final int COMISION_ALTURA_MIN = 20;
    public static final int PIEZA_ADICIONAL = 10;

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
}
