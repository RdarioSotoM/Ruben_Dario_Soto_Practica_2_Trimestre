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
        Escultura escultura = new Escultura(1, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
    }

    @AfterEach
    void borrarEscultura() {
        Escultura escultura = null;
    }

    @Test
    void elToStringFuncionaCorrectamente() {
        String expected = "ID: 1 | Nombre: Guernica | Autor: P.Picasso | Precio (Euros): 1000 | Altura: 5 | Peso: 2 | Piezas: 5 | Descripcion: Cuadro guerra civil | Material: Óleo";
        assertEquals(expected, escultura.toString());
    }
}
