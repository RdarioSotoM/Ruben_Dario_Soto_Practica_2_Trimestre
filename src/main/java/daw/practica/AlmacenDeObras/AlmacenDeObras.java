package daw.practica.AlmacenDeObras;
import java.util.Scanner;

import daw.practica.Metodos.Metodos;
import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;

public class AlmacenDeObras {
    static Pintura guernica = new Pintura(1, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
    static Pintura laVie = new Pintura(2, "La Vie", "P.Picasso", 200, 1, 1, 1, "óleo", "Óleo");
    static Pintura elSueño = new Pintura(3, "El Sueño", "P.Picasso", 300, 1.3, 1, 1, "óleo", "Óleo");
    static Pintura retratoDeDoraMaar = new Pintura(4, "Retrato de Dora Maar", "P.Picasso", 400, 1, 0.8, 1, "óleo","Óleo");
    static Escultura elPielRoja = new Escultura(5, "El Piel Roja", "U. Checa", 350, 1, 0.8, 1, "escultura", "Escultura");

    static int[] registroDeId = { 1, 2, 3, 4, 5 };
    static Escultura[] esculturasTotales = { elPielRoja }; 
    static Pintura[] pinturasTotales = { guernica, laVie, elSueño, retratoDeDoraMaar };

    public static Escultura[] getEsculturasTotales() {
        return esculturasTotales;
    }

    public static Pintura[] getPinturasTotales() {
        return pinturasTotales;
    }

    public static void setEsculturasTotales(Escultura[] esculturasTotales) {
        AlmacenDeObras.esculturasTotales = esculturasTotales;
    }

    public static void setPinturasTotales(Pintura[] pinturasTotales) {
        AlmacenDeObras.pinturasTotales = pinturasTotales;
    }

    public static int[] getRegistroDeId() {
        return registroDeId;
    }

    public static void setRegistroDeId(int[] registroDeId) {
        AlmacenDeObras.registroDeId = registroDeId;
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
        for (int i = 0; i < AlmacenDeObras.getEsculturasTotales().length; i++) {
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getId() + " ");
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getNombre() + " ");
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getMaterial() + " ");
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getPrecio() + " Euritos ");
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getAltura() + "m ");
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getPeso() + "t ");
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getPiezas() + " ");
            System.out.print(AlmacenDeObras.getEsculturasTotales()[i].getDescripcion() + " ");
            System.out.println("");
        }
    }

    public static void registrarUnaNuevaObra() {
        Scanner consola = new Scanner(System.in);
        System.out.println("¿Desea registrar una pintura o una escultura? (por favor, escríbalo en minúsculas).");
        String tipo = consola.nextLine();
        if (tipo.equals("pintura")) {
            int id;
            while (true) {
                System.out.println("Asigne un nuevo ID a la obra.");
                id = consola.nextInt();
                boolean yaExiste = false;
                for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
                    if (AlmacenDeObras.getRegistroDeId()[i] == id) {
                        System.out.println("No puedes usar este ID, ya existe, prueba con uno nuevo.");
                        yaExiste = true;
                    }
                }
                if (yaExiste) {
                    continue;
                }
                break;
            }

            System.out.println("Asigne un nombre a la obra.");
            consola.nextLine();
            String nombre = consola.nextLine();
            System.out.println("Asigne un autor a la obra.");
            String autor = consola.nextLine();
            System.out.println("Asigne un tipo de técnica a la obra.");          
            String tecnica = consola.nextLine();
            System.out.println("Asigne un precio a la obra.");        
            double precio = consola.nextDouble();
            System.out.println("Asigne la altura de la obra.");          
            double altura = consola.nextDouble();
            System.out.println("Asigne el peso de la obra.");         
            double peso = consola.nextDouble();
            System.out.println("Asigne el número de piezas de la obra.");        
            int piezas = consola.nextInt();
            System.out.println("Asigne una descipción a la obra.");
            consola.nextLine();            
            String descrp = consola.nextLine();

            System.out.println("Registrando la nueva obra, por favor espere...");

            int[] registroDeIdTemp = new int[AlmacenDeObras.getRegistroDeId().length + 1];
            for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
                registroDeIdTemp[i] = AlmacenDeObras.getRegistroDeId()[i];
            }

            registroDeIdTemp[registroDeIdTemp.length - 1] = id;
            AlmacenDeObras.setRegistroDeId(registroDeIdTemp);

            Pintura nuevaPintura = new Pintura(id, nombre, autor, precio, altura, peso, piezas, descrp, tecnica);
            Pintura[] pinturaTemp = new Pintura[AlmacenDeObras.getPinturasTotales().length + 1];

            for (int i = 0; i < AlmacenDeObras.getPinturasTotales().length; i++) {
                pinturaTemp[i] = AlmacenDeObras.getPinturasTotales()[i];
            }

            pinturaTemp[pinturaTemp.length - 1] = nuevaPintura;
            AlmacenDeObras.setPinturasTotales(pinturaTemp);
            System.out.println("La nueva obra ha sido registrada con exito.");

        } else if (tipo.equals("escultura")) {
            int id;
            while (true) {
                System.out.println("Asigne un nuevo ID a la obra.");
                id = consola.nextInt();
                boolean yaExiste = false;
                for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
                    if (AlmacenDeObras.getRegistroDeId()[i] == id) {
                        System.out.println("No puedes usar este ID, ya existe, prueba con uno nuevo.");
                        yaExiste = true;
                    }
                }
                if (yaExiste) {
                    continue;
                }
                break;
            }
            System.out.println("Asigne un nombre a la obra.");
            consola.nextLine();
            String nombre = consola.nextLine();
            System.out.println("Asigne un autor a la obra.");
            String autor = consola.nextLine();
            System.out.println("Asigne un tipo de material a la obra.");
            String material = consola.nextLine();
            System.out.println("Asigne un precio a la obra.");
            double precio = consola.nextDouble();
            System.out.println("Asigne la altura de la obra.");
            double altura = consola.nextDouble();
            System.out.println("Asigne el peso de la obra.");
            double peso = consola.nextDouble();
            System.out.println("Asigne el número de piezas de la obra.");
            int piezas = consola.nextInt();
            System.out.println("Asigne una descipción a la obra.");
            String descrp = consola.nextLine();

            System.out.println("Registrando la nueva obra, por favor espere...");

            int[] registroDeIdTemp = new int[AlmacenDeObras.getRegistroDeId().length + 1];
            for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
                registroDeIdTemp[i] = AlmacenDeObras.getRegistroDeId()[i];
            }

            registroDeIdTemp[registroDeIdTemp.length - 1] = id;
            AlmacenDeObras.setRegistroDeId(registroDeIdTemp);

            Escultura nuevaPintura = new Escultura(id, nombre, autor, precio, altura, peso, piezas, descrp, material);
            Escultura[] esculturaTemp = new Escultura[AlmacenDeObras.getPinturasTotales().length + 1];

            for (int i = 0; i < AlmacenDeObras.getEsculturasTotales().length; i++) {
                esculturaTemp[i] = AlmacenDeObras.getEsculturasTotales()[i];
            }

            esculturaTemp[esculturaTemp.length - 1] = nuevaPintura;
            AlmacenDeObras.setEsculturasTotales(esculturaTemp);
            System.out.println("La nueva obra ha sido registrada con exito.");

        } else {
            System.out.println("La opción introducida no es válida.");
        }
    }

    public static void modificandoObras(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Desea modificar una escultura o una pintura. (Por favor, escríbalo en minúsculas.");
        String tipo = consola.nextLine();

        if (tipo.equals("pintura")) {
            System.out.println("Escriba el ID de la pintura que desea modificar.");
            int id = consola.nextInt();
            for(int i = 0; i < AlmacenDeObras.getPinturasTotales().length; i++){
                if (AlmacenDeObras.getPinturasTotales()[i].getId() == id) {
                    System.out.println("Asigne un nuevo ID a la obra.");
                    id = consola.nextInt();
                    AlmacenDeObras.getPinturasTotales()[i].setId(id);
                    System.out.println("Asigne un nombre a la obra.");
                    consola.nextLine();
                    String nombre = consola.nextLine();
                    AlmacenDeObras.getPinturasTotales()[i].setNombre(nombre);
                    System.out.println("Asigne un autor a la obra.");
                    String autor = consola.nextLine();
                    AlmacenDeObras.getPinturasTotales()[i].setAutor(autor);
                    System.out.println("Asigne un tipo de técnica a la obra.");          
                    String tecnica = consola.nextLine();
                    AlmacenDeObras.getPinturasTotales()[i].setTecnica(tecnica);;
                    System.out.println("Asigne un precio a la obra.");
                    double precio = consola.nextDouble();
                    AlmacenDeObras.getPinturasTotales()[i].setPrecio(precio);
                    System.out.println("Asigne la altura de la obra.");
                    double altura = consola.nextDouble();
                    AlmacenDeObras.getPinturasTotales()[i].setAltura(altura);
                    System.out.println("Asigne el peso de la obra.");
                    double peso = consola.nextDouble();
                    AlmacenDeObras.getPinturasTotales()[i].setPeso(peso);
                    System.out.println("Asigne el número de piezas de la obra.");
                    int piezas = consola.nextInt();
                    AlmacenDeObras.getPinturasTotales()[i].setPiezas(piezas);
                    System.out.println("Asigne una descipción a la obra.");
                    String descrp = consola.nextLine();
                    AlmacenDeObras.getPinturasTotales()[i].setDescripcion(descrp);

                    System.out.println("Se han actualizado los nuevos valores.");
                }  
            }
        }else if (tipo.equals("escultura")) {
            System.out.println("Escriba el ID de la escultura que desea modificar.");
            int id = consola.nextInt();
            for(int i = 0; i < AlmacenDeObras.getEsculturasTotales().length; i++){
                if (AlmacenDeObras.getEsculturasTotales()[i].getId() == id) {
                    System.out.println("Asigne un nuevo ID a la obra.");
                    id = consola.nextInt();
                    AlmacenDeObras.getEsculturasTotales()[i].setId(id);
                    System.out.println("Asigne un nombre a la obra.");
                    consola.nextLine();
                    String nombre = consola.nextLine();
                    AlmacenDeObras.getEsculturasTotales()[i].setNombre(nombre);
                    System.out.println("Asigne un autor a la obra.");
                    String autor = consola.nextLine();
                    AlmacenDeObras.getEsculturasTotales()[i].setAutor(autor);
                    System.out.println("Asigne un tipo de material a la obra.");          
                    String material = consola.nextLine();
                    AlmacenDeObras.getEsculturasTotales()[i].setMaterial(material);;
                    System.out.println("Asigne un precio a la obra.");
                    double precio = consola.nextDouble();
                    AlmacenDeObras.getEsculturasTotales()[i].setPrecio(precio);
                    System.out.println("Asigne la altura de la obra.");
                    double altura = consola.nextDouble();
                    AlmacenDeObras.getEsculturasTotales()[i].setAltura(altura);
                    System.out.println("Asigne el peso de la obra.");
                    double peso = consola.nextDouble();
                    AlmacenDeObras.getEsculturasTotales()[i].setPeso(peso);
                    System.out.println("Asigne el número de piezas de la obra.");
                    int piezas = consola.nextInt();
                    AlmacenDeObras.getEsculturasTotales()[i].setPiezas(piezas);
                    System.out.println("Asigne una descipción a la obra.");
                    String descrp = consola.nextLine();
                    AlmacenDeObras.getEsculturasTotales()[i].setDescripcion(descrp);

                    System.out.println("Se han actualizado los nuevos valores.");
                }  
            }
        }else{
            System.out.println("La opción introducida no es válida");
        }       
    }

    public static void visualizaObras() {
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
