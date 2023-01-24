package daw.practica.Obras;

public class Escultura extends Obras {
    private String material;

    public Escultura(int id, String nombre, String autor, double precio, double altura, double peso, int piezas,
            String descripcion, String material) {
        super(id, nombre, autor, precio, altura, peso, piezas, descripcion);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
