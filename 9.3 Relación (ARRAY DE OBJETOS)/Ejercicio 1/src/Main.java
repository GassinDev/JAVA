import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Gato array[] = new Gato[4];
        String nombre;
        int edad,raza;

        for (int i = 0; i < array.length;i++){

            System.out.println("");
            System.out.println((i + 1) + ".Gato");
            System.out.print("Nombre: ");
            nombre = reader.next();
            System.out.print("Edad: ");
            edad = reader.nextInt();
            System.out.print("Raza(1-Siames,2-Angola,3-Egipcio): ");
            raza = reader.nextInt();

            switch (raza) {

                case 1: {
                    array[i] = new Gato(nombre,edad, Gato.Raza.Siames);
                }break;

                case 2: {
                    array[i] = new Gato(nombre,edad, Gato.Raza.Angola);
                }break;

                case 3: {
                    array[i] = new Gato(nombre,edad, Gato.Raza.Egipcio);
                }break;
            }

        }

        for (int i = 0; i < array.length;i++){
            System.out.println("");
            System.out.println(array[i]);
        }
    }
}