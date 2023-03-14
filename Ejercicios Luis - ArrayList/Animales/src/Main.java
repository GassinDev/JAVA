import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    static ClinicaVeterinaria c = new ClinicaVeterinaria();

    public static void main(String[] args) throws Exception {int opcion = -1;

        while (opcion != 0)
        {
            System.out.println("Menu de SrGassin");
            System.out.println("");
            System.out.println("1. Añadir Animal");
            System.out.println("2. Cambiar comentario de Animal");
            System.out.println("");

            opcion = reader.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    System.out.println();
                    System.out.println("Elije el animal que quieres introducir:");
                    System.out.println();
                    System.out.println("1. Perro");
                    System.out.println("2. Pajaro");
                    System.out.println("3. Gato");
                    System.out.println("4. Reptil");

                    int opcion2;
                    opcion2 = reader.nextInt();
                    switch (opcion2)
                    {
                        case 1: CreadorPerros(); break;
                        case 2: CreadorPajaro(); break;
                        case 3: CreadorGato(); break;
                        case 4: CreadorReptil(); break;
                    }


                }
                break;

                case 2:
                {
                    System.out.println("Dime el nombre del animal:");
                    String nombre;
                    nombre = reader.next();

                    System.out.println("Dime el nuevo comentario: ");
                    String comentario;
                    comentario = reader.next();

                    c.modificaComentarioAnimal(nombre, comentario);
                    System.out.println();
                }

                break;
            }
        }




    }


    public static void CreadorPerros() throws ParseException {
        String nombre, fechaNacimiento, microchip, comentarios;
        double peso;

        System.out.print("Nombre: ");
        nombre = reader.next();

        System.out.print("Fecha de Nacimiento: ");
        fechaNacimiento = reader.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaNacimiento);

        System.out.print("Peso: ");
        peso = reader.nextDouble();

        System.out.print("Comentario: ");
        reader.nextLine();
        comentarios = reader.nextLine();

        RazaPerro raza;
        int opcionperro;
        System.out.print("Raza (0-5): \n1-SanBernardo 2-Dalmata 3-Husky 4-FoxTerrier 5-PastorAleman");
        opcionperro = reader.nextInt();
        switch (opcionperro)
        {
            case 1: raza = RazaPerro.SanBernardo; break;
            case 2: raza = RazaPerro.Dalmata; break;
            case 3: raza = RazaPerro.Husky; break;
            case 4: raza = RazaPerro.FoxTerrier; break;
            case 5: raza = RazaPerro.PastorAleman; break;
            default: raza = RazaPerro.PastorAleman; break;
        }

        System.out.print("Microchip: ");
        microchip = reader.next();

        Perro p = new Perro(nombre,fecha, peso, raza, microchip, comentarios);

        c.insertarAnimal(p);
        System.out.println(p);
        System.out.println("Pulsa 0 para volver al menú");
        System.out.println("");
    }

    public static void CreadorPajaro() throws ParseException {
        String nombre, fechaNacimiento,comentarios;
        double peso;
        boolean cantor;

        System.out.print("Nombre: ");
        nombre = reader.next();

        System.out.print("Fecha de Nacimiento: ");
        fechaNacimiento = reader.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaNacimiento);

        System.out.print("Peso: ");
        peso = reader.nextDouble();

        System.out.print("Comentario: ");
        reader.nextLine();
        comentarios = reader.nextLine();

        EspeciePajaro especie;
        int opcionespecie;
        System.out.print("Especie (0-3): \n1-Agapornis 2-Canario 3-Periquito");
        opcionespecie = reader.nextInt();
        switch (opcionespecie)
        {
            case 1: especie = EspeciePajaro.Agapornis; break;
            case 2: especie = EspeciePajaro.Canario; break;
            case 3: especie = EspeciePajaro.Periquito; break;
            default: especie = EspeciePajaro.Canario; break;
        }

        System.out.print("Cantor: ");
        cantor = reader.nextBoolean();

        Pajaro pa = new Pajaro(nombre,fecha, peso, comentarios, especie, cantor);

        c.insertarAnimal(pa);
        System.out.println(pa);
        System.out.println("Pulsa 0 para volver al menú");
        System.out.print("");
    }

    private static void CreadorGato() throws ParseException {
        String nombre, fechaNacimiento,microchip, comentarios;
        double peso;

        System.out.print("Nombre: ");
        nombre = reader.next();

        System.out.print("Fecha de Nacimiento: ");
        fechaNacimiento = reader.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaNacimiento);

        System.out.print("Peso: ");
        peso = reader.nextDouble();

        System.out.print("Comentario: ");
        reader.nextLine();
        comentarios = reader.nextLine();

        RazaGato raza;
        int opciongato;
        System.out.print("Raza (0-5): \n1-Angora 2-Siames 3-Comun 4-Persa 5-ScottishFold");
        opciongato = reader.nextInt();
        switch (opciongato)
        {
            case 1: raza = RazaGato.Angora; break;
            case 2: raza = RazaGato.Siames; break;
            case 3: raza = RazaGato.Comun; break;
            case 4: raza = RazaGato.Persa; break;
            case 5: raza = RazaGato.ScottishFold; break;
            default: raza = RazaGato.Persa; break;
        }

        System.out.print("Microchip: ");
        microchip = reader.next();

        Gato g = new Gato(nombre, fecha, comentarios, raza, microchip, peso);

        c.insertarAnimal(g);
        System.out.println(g);
        System.out.println("Pulsa 0 para volver al menú");
        System.out.print("");
    }

    private static void CreadorReptil() throws ParseException {
        String nombre, fechaNacimiento, comentarios;
        double peso;
        boolean venenoso;

        System.out.println("Nombre: ");
        nombre = reader.next();

        System.out.println("Fecha de Nacimiento: ");
        fechaNacimiento = reader.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaNacimiento);

        System.out.println("Peso: ");
        peso = reader.nextDouble();

        System.out.print("Comentario: ");
        reader.nextLine();
        comentarios = reader.nextLine();

        EspecieReptil especie;
        int opcionreptil;
        System.out.print("Especie (0-3): \n1-Iguana 2-Tortuga 3-DragonComodo");
        opcionreptil = reader.nextInt();
        switch (opcionreptil)
        {
            case 1: especie = EspecieReptil.Iguana; break;
            case 2: especie = EspecieReptil.Tortuga; break;
            case 3: especie = EspecieReptil.DragonDeComodo; break;
            default: especie = EspecieReptil.DragonDeComodo; break;
        }

        System.out.print("Venenoso: ");
        venenoso = reader.nextBoolean();

        Reptil r = new Reptil(nombre, fecha, peso, comentarios, especie, venenoso);

        c.insertarAnimal(r);
        System.out.println(r);
        System.out.println("Pulsa 0 para volver al menú");
        System.out.print("");

    }

}