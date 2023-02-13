package daw.practica.Obras;

public class Pintura extends Obras {
    private String tecnica;
    private double descuento = 0.10;

    public Pintura(int id, String nombre, String autor, double precio, double altura, double peso, int piezas,
            String descripcion, String tecnica) {
        super(id, nombre, autor, precio, altura, peso, piezas, descripcion);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public double getDescuento() {
        return descuento;
    }

    public String toString() {
        return super.toString() + "|tecnica: " + tecnica ;
    }

    public String toStringSinID() {
        return super.toStringSinID() + "|tecnica: " + tecnica ;
    }
}