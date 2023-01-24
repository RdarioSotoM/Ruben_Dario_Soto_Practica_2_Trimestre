package daw.practica;
import java.util.Scanner;

import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;


public class App {
    public static void main(String[] args){

        Pintura guernica = new Pintura(001, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
        Pintura laVie = new Pintura(002, "La Vie", "P.Picasso", 200, 1, 1, 1, "óleo", "Óleo");
        Pintura elSueño = new Pintura(003, "El Sueño", "P.Picasso", 300, 1.3, 1, 1, "óleo", "Óleo");
        Pintura retratoDeDoraMaar = new Pintura(004, "Retrato de Dora Maar", "P.Picasso", 400, 1, 0.8, 1, "óleo", "Óleo");
        Escultura elPielRoja = new Escultura(005, "El Piel Roja", "U. Checa", 350, 1, 0.8, 1, "escultura", "Escultura");

        int contadorPinturas = 4;
        int contadorEsculturas = 1;

        Pintura[] pinturasTotales = {guernica, laVie, elSueño, retratoDeDoraMaar};
        Escultura[] esculturasTotales = {elPielRoja};

        Scanner consola = new Scanner(System.in);
        System.out.println("¿Qué desea hacer?, por favor, escriba solo el numero de la opción a elegir.");

        int eleccion = 0;
        while(eleccion != 7){
            System.out.println(" ");
            System.out.println("1. Visualizar las obras de arte existentes.");
            System.out.println("2. Dar de alta una nueva obra");
            System.out.println("3. Modificar una obra de arte expuesta.");
            System.out.println("4. Visualizar los datos de una de las obras de arte expuestas.");
            System.out.println("5. Obtener el precio de venta de una de las obras expuestas.");
            System.out.println("6. Imprimir una etiqueta de una de las obras expuestas.");
            System.out.println("7. Salir");
            eleccion = consola.nextInt();
            consola.nextLine();

            switch(eleccion){
                case 1:
                for(int i = 0; i < pinturasTotales.length; i++){
                    System.out.print(pinturasTotales[i].getId() + " ");
                    System.out.print(pinturasTotales[i].getNombre() + " ");
                    System.out.print(pinturasTotales[i].getAutor() + " ");
                    System.out.print(pinturasTotales[i].getTecnica() + " ");
                    System.out.print(pinturasTotales[i].getPrecio() + " Euritos ");
                    System.out.print(pinturasTotales[i].getAltura() + "m ");
                    System.out.print(pinturasTotales[i].getPeso() + "t ");
                    System.out.print(pinturasTotales[i].getPiezas() + " ");
                    System.out.print(pinturasTotales[i].getDescripcion() + " ");
                    System.out.println("");
                }
                
                for(int i = 0; i < esculturasTotales.length; i++){
                    System.out.print(esculturasTotales[i].getId() + " ");
                    System.out.print(esculturasTotales[i].getNombre() + " ");
                    System.out.print(esculturasTotales[i].getAutor() + " ");
                    System.out.print(esculturasTotales[i].getMaterial() + " ");
                    System.out.print(esculturasTotales[i].getPrecio() + " Euritos ");
                    System.out.print(esculturasTotales[i].getAltura() + "m ");
                    System.out.print(esculturasTotales[i].getPeso() + "t ");
                    System.out.print(esculturasTotales[i].getPiezas() + " ");
                    System.out.print(esculturasTotales[i].getDescripcion() + " ");
                    System.out.println("");
                } 

                continue;
                case 2:
                    System.out.println("¿Desea registrar una pintura o una escultura? (por favor, escríbalo en minúsculas).");
                    String tipo = consola.nextLine();
                    if(tipo.equals("pintura")){
                        System.out.println("Asigne un nuevo ID a la obra.");
                        consola.nextInt();
                        int id = consola.nextInt();
                        System.out.println("Asigne un nombre a la obra.");
                        consola.nextLine();
                        String nombre = consola.nextLine();
                        System.out.println("Asigne un autor a la obra.");
                        consola.nextLine();
                        String autor = consola.nextLine();
                        System.out.println("Asigne un tipo de técnica a la obra.");
                        consola.nextLine();
                        String tecnica = consola.nextLine();
                        System.out.println("Asigne un precio a la obra.");
                        consola.nextDouble();
                        double precio = consola.nextDouble();
                        System.out.println("Asigne la altura de la obra.");
                        consola.nextDouble();
                        double altura = consola.nextDouble();
                        System.out.println("Asigne el peso de la obra.");
                        consola.nextDouble();
                        double peso = consola.nextDouble();
                        System.out.println("Asigne el número de piezas de la obra.");
                        consola.nextInt();
                        int piezas = consola.nextInt();
                        System.out.println("Asigne una descipción a la obra.");
                        consola.nextLine();
                        String descrp = consola.nextLine();
                    }else if(tipo.equals("escultura")){
                        
                    }else{
                        System.out.println("La opción introducida no es válida.");
                        continue;
                    }
                case 3:

                case 4:

                case 5:

                case 6:

                case 7:
                System.out.println("Hasta la próxima");
                    break;
            }
        }
    }
}
