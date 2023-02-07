package daw.practica.Obras;

public class Escultura extends Obras {
    private String material;
    private double manipulacion = 50;
    private double descuento = 0.20;

    

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

    public double descuentoEscultura(){
        double precioConDescuento = getPrecio() - (getPrecio() * 0.20);
        return precioConDescuento;
    }

    public double gastosDeManipulacion(){
        final double MANIPULACION= 50;
        return MANIPULACION;
    }

    public double getManipulacion() {
        return manipulacion;
    }

    public double getDescuento() {
        return descuento;
    }
}
