package daw.practica.AlmacenDeObras;

import daw.practica.Obras.Escultura;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlmacenDeObrasTest {

    private Escultura escultura;

    @BeforeEach
    void crearObraEscultura() {
        escultura = new Escultura(1, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
    }

    @AfterEach
    void borrarEscultura() {
        escultura = null;
    }

    @Test
    void elToStringFuncionaCorrectamente() {
        String expected = "ID: 1 | Nombre: Guernica | Autor:P.Picasso | Precio (Euros):1000.0 | Altura: 5.0 | Peso: 2.0 | Piezas: 5 | Descripcion: Cuadro guerra civil | Material: Óleo";
        assertEquals(expected, escultura.toString());
    }

    @Test
    void laEtiquetaFuncionaChachi() {
        String expected = "Nombre: Guernica | Autor: P.Picasso | Descripcion: Cuadro guerra civil" ;
      
        assertEquals(expected, AlmacenDeObras.etiqueta(1));
    }

    @Test
    void registrarUnaPinturaNuevaEstaOk() {
        int id = 1;
        String nombre = "Guernica";
        String autor = "P.Picasso";
        double precio = 1000;
        double altura = 5;
        double peso = 2;
        int piezas = 5;
        String descripcion = "Cuadro guerra civil";
        String material = "Óleo";

        assertEquals(escultura, AlmacenDeObras.registrarUnaNuevaEscultura(id, nombre, autor, precio, altura, peso, piezas, descripcion, material));

    }


}
