package daw.practica.ModificadorDeObras;
import java.util.Scanner;
import daw.practica.AlmacenDeObras.AlmacenDeObras;

public class ModificadorDeObras {
    public static void ModificandoObras(){
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
}
