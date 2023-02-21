package daw.practica.AlmacenDeObras;

import javax.sound.sampled.SourceDataLine;

import daw.practica.Administrador;
import daw.practica.Metodos.Metodos_Y_Finals;
import daw.practica.Obras.Escultura;
import daw.practica.Obras.Obras;
import daw.practica.Obras.Pintura;

public class AlmacenDeObras {
    final static double COMISION_DE_LA_GALERIA = 0.25;

    static Pintura guernica = new Pintura(1, "Guernica", "P.Picasso", 1000, 5, 2, 5, "Cuadro guerra civil", "Óleo");
    static Pintura laVie = new Pintura(2, "La Vie", "P.Picasso", 200, 1, 1, 1, "óleo", "Óleo");
    static Pintura elSueño = new Pintura(3, "El Sueño", "P.Picasso", 300, 1.3, 1, 1, "óleo", "Óleo");
    static Pintura retratoDeDoraMaar = new Pintura(4, "Retrato de Dora Maar", "P.Picasso", 400, 1, 0.8, 1, "óleo",
            "Óleo");
    static Escultura elPielRoja = new Escultura(5, "El Piel Roja", "U. Checa", 350, 1, 0.8, 1, "escultura",
            "Escultura");

    static int[] registroDeId = { 1, 2, 3, 4, 5 };
    static Obras[] obrasTotales = { guernica, laVie, elSueño, retratoDeDoraMaar, elPielRoja };

    public static Obras[] getObrasTotales() {
        return obrasTotales;
    }

    public static void setObrasTotales(Obras[] obrasTotales) {
        AlmacenDeObras.obrasTotales = obrasTotales;
    }

    public static int[] getRegistroDeId() {
        return registroDeId;
    }

    public static void setRegistroDeId(int[] registroDeId) {
        AlmacenDeObras.registroDeId = registroDeId;
    }

    public static void lectorDeObras() {
        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            System.out.print(AlmacenDeObras.getObrasTotales()[i].toString() + " ");
            System.out.println("");
        }
    }

    public static Escultura registrarUnaNuevaEscultura(int id, String nombre, String autor, double precio,
            double altura,
            double peso,
            int piezas, String descripcion, String material) {

        int[] registroDeIdTemp = new int[AlmacenDeObras.getRegistroDeId().length + 1];
        for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
            registroDeIdTemp[i] = AlmacenDeObras.getRegistroDeId()[i];
        }

        registroDeIdTemp[registroDeIdTemp.length - 1] = id;
        AlmacenDeObras.setRegistroDeId(registroDeIdTemp);

        Escultura nuevaEscultura = new Escultura(id, nombre, autor, precio, altura, peso, piezas, descripcion,
                material);
        Obras[] obrasTemp = new Obras[AlmacenDeObras.getObrasTotales().length + 1];

        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            obrasTemp[i] = AlmacenDeObras.getObrasTotales()[i];
        }

        obrasTemp[obrasTemp.length - 1] = nuevaEscultura;
        AlmacenDeObras.setObrasTotales(obrasTemp);
        System.out.println("La nueva obra ha sido registrada con exito.");

        return nuevaEscultura;
    }

    public static Pintura registrarUnaNuevaPintura(int id, String nombre, String autor, double precio, double altura,
            double peso,
            int piezas, String descripcion, String tecnica) {

        int[] registroDeIdTemp = new int[AlmacenDeObras.getRegistroDeId().length + 1];
        for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
            registroDeIdTemp[i] = AlmacenDeObras.getRegistroDeId()[i];
        }

        registroDeIdTemp[registroDeIdTemp.length - 1] = id;
        AlmacenDeObras.setRegistroDeId(registroDeIdTemp);

        Pintura nuevaPintura = new Pintura(id, nombre, autor, precio, altura, peso, piezas, descripcion, tecnica);
        Obras[] obrasTemp = new Obras[AlmacenDeObras.getObrasTotales().length + 1];

        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            obrasTemp[i] = AlmacenDeObras.getObrasTotales()[i];
        }

        obrasTemp[obrasTemp.length - 1] = nuevaPintura;
        AlmacenDeObras.setObrasTotales(obrasTemp);
        System.out.println("La nueva obra ha sido registrada con exito.");

        return nuevaPintura;
    }

    public static void registrandoDatos() {
        System.out.println("¿Desea registrar una pintura o una escultura? (por favor, escríbalo en minúsculas).");
        String tipo = Administrador.consola.nextLine();
        if (tipo.equals("pintura")) {
            int id;
            while (true) {
                System.out.println("Asigne un nuevo ID a la obra.");
                id = Administrador.consola.nextInt();
                boolean yaExiste = false;
                for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
                    if (AlmacenDeObras.getRegistroDeId()[i] == id) {
                        System.out.println("No puedes usar este ID, ya existe, prueba con uno nuevo.");
                        yaExiste = true;
                    }
                }
                if (yaExiste) {
                    continue;
                }
                break;
            }

            System.out.println("Asigne un nombre a la obra.");
            Administrador.consola.nextLine();
            String nombre = Administrador.consola.nextLine();
            System.out.println("Asigne un autor a la obra.");
            String autor = Administrador.consola.nextLine();
            System.out.println("Asigne un tipo de técnica a la obra.");
            String tecnica = Administrador.consola.nextLine();
            System.out.println("Asigne un precio a la obra.");
            double precio = Administrador.consola.nextDouble();
            System.out.println("Asigne la altura de la obra.");
            double altura = Administrador.consola.nextDouble();
            System.out.println("Asigne el peso de la obra.");
            double peso = Administrador.consola.nextDouble();
            System.out.println("Asigne el número de piezas de la obra.");
            int piezas = Administrador.consola.nextInt();
            System.out.println("Asigne una descipción a la obra.");
            Administrador.consola.nextLine();
            String descripcion = Administrador.consola.nextLine();

            System.out.println("Registrando la nueva obra, por favor espere...");

            registrarUnaNuevaPintura(id, nombre, autor, precio, altura, peso, piezas, descripcion, tecnica);

        } else if (tipo.equals("escultura")) {
            int id;
            while (true) {
                System.out.println("Asigne un nuevo ID a la obra.");
                id = Administrador.consola.nextInt();
                boolean yaExiste = false;
                for (int i = 0; i < AlmacenDeObras.getRegistroDeId().length; i++) {
                    if (AlmacenDeObras.getRegistroDeId()[i] == id) {
                        System.out.println("No puedes usar este ID, ya existe, prueba con uno nuevo.");
                        yaExiste = true;
                    }
                }
                if (yaExiste) {
                    continue;
                }
                break;
            }
            System.out.println("Asigne un nombre a la obra.");
            Administrador.consola.nextLine();
            String nombre = Administrador.consola.nextLine();
            System.out.println("Asigne un autor a la obra.");
            String autor = Administrador.consola.nextLine();
            System.out.println("Asigne un tipo de material a la obra.");
            String material = Administrador.consola.nextLine();
            System.out.println("Asigne un precio a la obra.");
            double precio = Administrador.consola.nextDouble();
            System.out.println("Asigne la altura de la obra.");
            double altura = Administrador.consola.nextDouble();
            System.out.println("Asigne el peso de la obra.");
            double peso = Administrador.consola.nextDouble();
            System.out.println("Asigne el número de piezas de la obra.");
            int piezas = Administrador.consola.nextInt();
            System.out.println("Asigne una descipción a la obra.");
            String descripcion = Administrador.consola.nextLine();

            System.out.println("Registrando la nueva obra, por favor espere...");
            registrarUnaNuevaEscultura(id, nombre, autor, precio, altura, peso, piezas, descripcion, material);

        } else {
            System.out.println("La opción introducida no es válida.");
        }

    }

    public static Obras modificandoObras(int id, String nombre, String autor, double precio, double altura,
            double peso,
            int piezas, String descripcion, String tecnica, String material) {
        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
                AlmacenDeObras.getObrasTotales()[i].setId(id);
                AlmacenDeObras.getObrasTotales()[i].setNombre(nombre);
                AlmacenDeObras.getObrasTotales()[i].setAutor(autor);
                AlmacenDeObras.getObrasTotales()[i].setPrecio(precio);
                AlmacenDeObras.getObrasTotales()[i].setAltura(altura);
                AlmacenDeObras.getObrasTotales()[i].setPeso(peso);
                AlmacenDeObras.getObrasTotales()[i].setPiezas(piezas);
                AlmacenDeObras.getObrasTotales()[i].setDescripcion(descripcion);
                if (AlmacenDeObras.getObrasTotales()[i] instanceof Pintura) {
                    Pintura pinturatemp = (Pintura) AlmacenDeObras.getObrasTotales()[i];
                    pinturatemp.setTecnica(tecnica);
                    AlmacenDeObras.getObrasTotales()[i] = pinturatemp;
                } else {
                    Escultura esculturatemp = (Escultura) AlmacenDeObras.getObrasTotales()[i];
                    esculturatemp.setMaterial(material);
                    AlmacenDeObras.getObrasTotales()[i] = esculturatemp;
                }
                return AlmacenDeObras.getObrasTotales()[i];
            }
        }
        return null;
    }

    public static void selectorDeNuevosDatos() {
        System.out.println("Escriba el ID de la obra que desea modificar.");
        int id = Administrador.consola.nextInt();
        Administrador.consola.nextLine();

        System.out.println("Asigne un nombre a la obra.");
        String nombre = Administrador.consola.nextLine();

        System.out.println("Asigne un autor a la obra.");
        String autor = Administrador.consola.nextLine();

        System.out.println("Asigne un precio a la obra.");
        double precio = Administrador.consola.nextDouble();

        System.out.println("Asigne la altura de la obra.");
        double altura = Administrador.consola.nextDouble();

        System.out.println("Asigne el peso de la obra.");
        double peso = Administrador.consola.nextDouble();

        System.out.println("Asigne el número de piezas de la obra.");
        int piezas = Administrador.consola.nextInt();
        Administrador.consola.nextLine();

        System.out.println("Asigne una descipción a la obra.");
        String descrp = Administrador.consola.nextLine();

        System.out.println("Asigne un tipo de técnica a la obra (si es necesario).");
        String tecnica = Administrador.consola.nextLine();

        System.out.println("Asigne un tipo de material a la obra (si es necesario).");
        String material = Administrador.consola.nextLine();

        modificandoObras(id, nombre, autor, precio, altura, peso, piezas, descrp, tecnica, material);
        System.out.println("La obra ha sido modificada con éxito.");
    }

    public static int selectorDeID() {
        System.out.println("Escriba el ID de la obra que desea visualizar.");
        int id = Administrador.consola.nextInt();
        return id;
    }

    public static String visualizaObras(int id) {
        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
                return AlmacenDeObras.getObrasTotales()[i].toStringSinID();
            }
        }
        return null;
    }
/* 
    public static void precioDeVenta(int id) {

        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
                System.out.println("Nombre: " +
                        AlmacenDeObras.getObrasTotales()[i].getNombre());
                System.out.println("Altura (m): " +
                        AlmacenDeObras.getObrasTotales()[i].getAltura());
                System.out.println("Peso (t) " +
                        AlmacenDeObras.getObrasTotales()[i].getPeso());
                System.out.println("Número de piezas: " +
                        AlmacenDeObras.getObrasTotales()[i].getPiezas());
                System.out.println("Precio (€) " +
                        AlmacenDeObras.getObrasTotales()[i].getPrecio());
                System.out.println("Comisión de la galería: " +
                        Metodos_Y_Finals.COMISION_DE_LA_GALERIA);

                importefinal(id, sumaDeImportes(importePorPeso(id), importePorAltura(id), importePorPiezas(id)));
            }
        }

    }
*/
    public static double importePorPeso(int id) {
        double importePeso = 0;
        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {

                if (AlmacenDeObras.getObrasTotales()[i].getPeso() > 1) {
                    importePeso += 100;
                    System.out.println("Importe por peso: " +
                            Metodos_Y_Finals.COMISION_PESO_MAX);
                } else {
                    importePeso += 20;
                    System.out.println("Importe por peso: " +
                            Metodos_Y_Finals.COMISION_PESO_MIN);
                }
                return importePeso;
            }
        }
        return importePeso;
    }

    public static double importePorAltura(int id) {
        double importeAltura = 0;
        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
                if (AlmacenDeObras.getObrasTotales()[i].getAltura() > 2) {
                    importeAltura += 100;
                    System.out.println("Importe por altura: " +
                            Metodos_Y_Finals.COMISION_ALTURA_MAX);
                } else {
                    importeAltura += 20;
                    System.out.println("Importe por altura: " +
                            Metodos_Y_Finals.COMISION_ALTURA_MIN);
                }
                return importeAltura;
            }
        }
        return importeAltura;
    }

    public static double importePorPiezas(int id) {
        double importePiezas = 0;
        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
                if (AlmacenDeObras.getObrasTotales()[i].getPiezas() > 2) {
                    importePiezas = importePiezas
                            + ((AlmacenDeObras.getObrasTotales()[i].getPiezas() - 2) * 10);
                    for (int j = 3; j <= AlmacenDeObras.getObrasTotales()[i].getPiezas(); j++) {
                        System.out.println(
                                "Importe adicional - Pieza " + j + " (euros): " +
                                        Metodos_Y_Finals.PIEZA_ADICIONAL);
                    }
                }
                return importePiezas;
            }
        }
        return importePiezas;
    }

    public static double sumaDeImportes(double importePeso, double importeAltura, double importePiezas) {
        double suma = importePeso + importeAltura + importePiezas;
        return suma;
    }

    public static double importefinal(int id, double suma) {
        double importeTotal = 0;
        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
                importeTotal = suma + AlmacenDeObras.getObrasTotales()[i].getPrecio()
                        + (AlmacenDeObras.getObrasTotales()[i].getPrecio() * COMISION_DE_LA_GALERIA);
                if (AlmacenDeObras.getObrasTotales()[i] instanceof Pintura) {
                    Pintura pinturatemp = (Pintura) AlmacenDeObras.getObrasTotales()[i];

                    System.out.println("Precio de venta (euros): " + importeTotal);
                    System.out.println("Descuento: (10% óleo (euros))"
                            + importeTotal *
                                    pinturatemp.getDescuento());
                    importeTotal = importeTotal - (importeTotal * pinturatemp.getDescuento());
                } else {
                    Escultura esculturatemp = (Escultura) AlmacenDeObras.getObrasTotales()[i];
                    System.out.println("Precio de venta (euros): " + importeTotal);
                    System.out.println("Coste de manipulacion: " + esculturatemp.getManipulacion());
                    importeTotal += esculturatemp.getManipulacion();
                    System.out.println("Descuento: (20% escultura (euros))"
                            + importeTotal *
                                    esculturatemp.getDescuento());
                    importeTotal = importeTotal - (importeTotal * esculturatemp.getDescuento());
                }
                importeTotal = importeTotal * 0.99;

                System.out.println("El precio final de esta obra es de " + importeTotal
                        + " dólares.");
                System.out.println(" ");
                return importeTotal;
            }
        }
        return importeTotal;
    }

    
      public static void precioDeVenta(int id) {
      final double COMISION_DE_LA_GALERIA = 0.25;
      
      for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
      if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
      double precioDeVentafinal = AlmacenDeObras.getObrasTotales()[i].getPrecio()
      + (AlmacenDeObras.getObrasTotales()[i].getPrecio() *
      COMISION_DE_LA_GALERIA);
      System.out.println("Nombre: " +
      AlmacenDeObras.getObrasTotales()[i].getNombre());
      System.out.println("Altura (m): " +
      AlmacenDeObras.getObrasTotales()[i].getAltura());
      System.out.println("Peso (t) " +
      AlmacenDeObras.getObrasTotales()[i].getPeso());
      System.out.println("Número de piezas: " +
      AlmacenDeObras.getObrasTotales()[i].getPiezas());
      System.out.println("Precio (€) " +
      AlmacenDeObras.getObrasTotales()[i].getPrecio());
      System.out.println("Comisión de la galería: " +
      Metodos_Y_Finals.COMISION_DE_LA_GALERIA);
      
      if (AlmacenDeObras.getObrasTotales()[i].getPeso() > 1) {
      precioDeVentafinal += 100;
      System.out.println("Importe por peso: " +
      Metodos_Y_Finals.COMISION_PESO_MAX);
      } else {
      precioDeVentafinal += 20;
      System.out.println("Importe por peso: " +
      Metodos_Y_Finals.COMISION_PESO_MIN);
      }
     if (AlmacenDeObras.getObrasTotales()[i].getAltura() > 2) {
      precioDeVentafinal += 100;
      System.out.println("Importe por altura: " +
      Metodos_Y_Finals.COMISION_ALTURA_MAX);
      } else {
      precioDeVentafinal += 20;
      System.out.println("Importe por altura: " +
      Metodos_Y_Finals.COMISION_ALTURA_MIN);
      }
      if (AlmacenDeObras.getObrasTotales()[i].getPiezas() > 2) {
      precioDeVentafinal = precioDeVentafinal
      + ((AlmacenDeObras.getObrasTotales()[i].getPiezas() - 2) * 10);
      for (int j = 3; j <= AlmacenDeObras.getObrasTotales()[i].getPiezas(); j++) {
      System.out.println(
      "Importe adicional - Pieza " + j + " (euros): " +
      Metodos_Y_Finals.PIEZA_ADICIONAL);
      }
      }
      
      if (AlmacenDeObras.getObrasTotales()[i] instanceof Pintura) {
      Pintura pinturatemp = (Pintura) AlmacenDeObras.getObrasTotales()[i];
      
      System.out.println("Precio de venta (euros): " + precioDeVentafinal);
      precioDeVentafinal = precioDeVentafinal
      - (precioDeVentafinal *
      pinturatemp.getDescuento());
      System.out.println("Descuento: (10% óleo (euros))"
      + precioDeVentafinal *
      pinturatemp.getDescuento());
      } else {
      Escultura esculturatemp = (Escultura) AlmacenDeObras.getObrasTotales()[i];
      System.out.println("Precio de venta (euros): " + precioDeVentafinal);
      precioDeVentafinal = precioDeVentafinal
      - (precioDeVentafinal *
      esculturatemp.getDescuento());
      System.out.println("Descuento: (20% escultura (euros))"
      + precioDeVentafinal *
      esculturatemp.getDescuento());
      precioDeVentafinal += esculturatemp.getManipulacion();
      }
      
      precioDeVentafinal = precioDeVentafinal * 0.99;
      
      System.out.println("El precio final de esta obra es de " + precioDeVentafinal
      + " dólares.");
      }
      System.out.println(" ");
      }
      
      }
     
    public static String etiqueta(int id) {

        for (int i = 0; i < AlmacenDeObras.getObrasTotales().length; i++) {
            if (AlmacenDeObras.getObrasTotales()[i].getId() == id) {
                return AlmacenDeObras.getObrasTotales()[i].toStringEtiqueta();
            }
        }
        return null;
    }

}
