package daw.practica.Obras;

public class Pintura extends Obras {
    private String tecnica;

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

}