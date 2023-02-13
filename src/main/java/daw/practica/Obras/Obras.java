package daw.practica.Obras;

public abstract class Obras {
    private int id;
    private String nombre;
    private String autor;
    private double precio;
    private double altura;
    private double peso;
    private int piezas;
    private String descripcion;

    public Obras(int id, String nombre, String autor, double precio, double altura, double peso, int piezas,
            String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.piezas = piezas;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return "ID: " + id + "| nombre: " + nombre + "| autor:" + autor + "| precio (Euros):" + precio + "| altura: "
                + altura + "| peso: " + peso + "| piezas: " + piezas + "| descripcion: " + descripcion ;
    }

    public String toStringSinID() {
        return "Nombre: " + nombre + "| autor:" + autor + "| precio (Euros):" + precio + "| altura: "
                + altura + "| peso: " + peso + "| piezas: " + piezas + "| descripcion: " + descripcion ;
    }
}
