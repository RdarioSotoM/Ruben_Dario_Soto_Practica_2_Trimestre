package daw.practica.RegistradorDeObras;

import java.util.Scanner;
import daw.practica.Obras.Pintura;
import daw.practica.AlmacenDeObras.AlmacenDeObras;
import daw.practica.Obras.Escultura;

public class RegistradorDeObras {
    public static void RegistrarUnaNuevaObra() {
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
            consola.nextLine();
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

            Escultura nuevaPintura = new Escultura(id, nombre, nombre, precio, altura, peso, piezas, descrp, material);
            Escultura[] esculturaTemp = new Escultura[AlmacenDeObras.getEsculturasTotales().length + 1];

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
}
