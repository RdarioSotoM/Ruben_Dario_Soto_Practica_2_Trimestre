package daw.practica.AlmacenDeObras;
import daw.practica.Metodos.Metodos;
import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;

public class AlmacenDeObras {
    static Pintura guernica = new Pintura(001, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
    static Pintura laVie = new Pintura(002, "La Vie", "P.Picasso", 200, 1, 1, 1, "óleo", "Óleo");
    static Pintura elSueño = new Pintura(003, "El Sueño", "P.Picasso", 300, 1.3, 1, 1, "óleo", "Óleo");
    static Pintura retratoDeDoraMaar = new Pintura(004, "Retrato de Dora Maar", "P.Picasso", 400, 1, 0.8, 1, "óleo","Óleo");

    static Escultura elPielRoja = new Escultura(005, "El Piel Roja", "U. Checa", 350, 1, 0.8, 1, "escultura", "Escultura");

    static Escultura[] esculturasTotales = { elPielRoja }; 
    static Pintura[] pinturasTotales = { guernica, laVie, elSueño, retratoDeDoraMaar };

    private int contadorPinturas = 4;
    private int contadorEsculturas = 1;

    public int getContadorPinturas() {
        return contadorPinturas;
    }
    public void setContadorPinturas(int contadorPinturas) {
        this.contadorPinturas = contadorPinturas;
    }
    public int getContadorEsculturas() {
        return contadorEsculturas;
    }
    public void setContadorEsculturas(int contadorEsculturas) {
        this.contadorEsculturas = contadorEsculturas;
    }

    public static void lectorDepinturas(){
        for (int i = 0; i < pinturasTotales.length; i++) {
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
    }

    public static void lectoDeEsculturas(){
        for (int i = 0; i < esculturasTotales.length; i++) {
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
    }
}
