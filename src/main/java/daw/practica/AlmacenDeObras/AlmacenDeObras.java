package daw.practica.AlmacenDeObras;
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

    public static void setEsculturasTotales(Escultura[] esculturasTotales) {
        AlmacenDeObras.esculturasTotales = esculturasTotales;
    }

    public static Pintura[] getPinturasTotales() {
        return pinturasTotales;
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
}
