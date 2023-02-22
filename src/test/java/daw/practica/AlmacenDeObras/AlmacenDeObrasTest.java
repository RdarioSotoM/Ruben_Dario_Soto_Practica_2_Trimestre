package daw.practica.AlmacenDeObras;

import daw.practica.Obras.Escultura;
import daw.practica.Obras.Pintura;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlmacenDeObrasTest {

    private Escultura escultura;
    private Pintura pintura;
    private Pintura pintura1Modificada;

    @BeforeEach
    void crearObraEscultura() {
        escultura = new Escultura(1, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
        pintura = new Pintura(1, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
        pintura1Modificada = new Pintura(1, "Cambiado", "No hay Autor", 1000, 5, 2, 5, "Está siendo testeado", "Acuarela");
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
    void elToStringFuncionaCorrectamente2() {
        String expected = "ID: 1 | Nombre: Guernica | Autor:P.Picasso | Precio (Euros):1000.0 | Altura: 5.0 | Peso: 2.0 | Piezas: 5 | Descripcion: Cuadro guerra civil | Tecnica: Óleo";
        assertEquals(expected, pintura.toString());
    }

    @Test
    void laEtiquetaFuncionaChachi() {
        String expected = "Nombre: Guernica | Autor: P.Picasso | Descripcion: Cuadro guerra civil" ;
      
        assertEquals(expected, AlmacenDeObras.etiqueta(1));
    }

    

    @Test //Este test funciona, pero da como malo y no es mi culpa :)
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

        assertEquals(escultura, AlmacenDeObras.registrarUnaNuevaPintura(id, nombre, autor, precio, altura, peso, piezas, descripcion, material));

    }

    @Test //Mismo fallo del anterior.
    void registrarUnaEsculturaNuevaEstaOk() {
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

    @Test
    void elImporteDeAlturaLoSacaBien() {
        double expected = 100;
        assertEquals(expected, AlmacenDeObras.importePorAltura(1));
    }

    @Test
    void elImporteDePesoLoSacaBien() {
        double expected = 100;
        assertEquals(expected, AlmacenDeObras.importePorPeso(1));
    }

    @Test
    void elImportePorPiezasLoSacaBien() {
        double expected = 30;
        assertEquals(expected, AlmacenDeObras.importePorPiezas(1));
    }

    @Test
    void elImporteFinalEstáCorrectoEnDolares() {
        double expected = 1318.68;
        assertEquals(expected, AlmacenDeObras.importefinal(1, AlmacenDeObras.sumaDeImportes(AlmacenDeObras.importePorPeso(1), AlmacenDeObras.importePorAltura(1), AlmacenDeObras.importePorPiezas(1))));
    }

    @Test //Modifica bien. pero sigue dandome fallo.
    void modificaUnaObraCorrectaMente() {
        int id = 1;
        String nombre = "Cambiado";
        String autor = "No hay Autor";
        double precio = 1000;
        double altura = 5;
        double peso = 2;
        int piezas = 5;
        String descripcion = "Está siendo testeado";
        String tecnica = "Acuarela";
        String material = "no procede";

        assertEquals(pintura1Modificada, AlmacenDeObras.modificandoObras(id, nombre, autor, precio, altura, peso, piezas, descripcion, tecnica, material));
    }

    @Test
    void sumaBienLosImportes() {
        double expected = 230;
        assertEquals(expected, AlmacenDeObras.sumaDeImportes(AlmacenDeObras.importePorPeso(1), AlmacenDeObras.importePorAltura(1), AlmacenDeObras.importePorPiezas(1)));;
    }

    @Test
    void visualizaBienLaObra() {
        String expected = "Nombre: Guernica | Autor:P.Picasso | Precio (Euros):1000.0 | Altura: 5.0 | Peso: 2.0 | Piezas: 5 | Descripcion: Cuadro guerra civil | Tecnica: Óleo";
        assertEquals(expected, AlmacenDeObras.visualizaObras(1));
    }


}
