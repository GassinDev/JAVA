import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Gato array[] = new Gato[4];

        array[0] = new Gato("pepe",3, Gato.Raza.Siames);
        array[1] = new Gato("manu",5, Gato.Raza.Angola);
        array[2] = new Gato("luis",1, Gato.Raza.Egipcio);
        array[3] = new Gato("kiko",2, Gato.Raza.Siames);

        for (int i = 0; i < array.length;i++){
            System.out.println("");
            System.out.println(array[i]);

        }

        //NUEVA MANERA DE PONER EL FOR
        /*for (Gato gato : array) {
            System.out.println("");
            System.out.println(gato);

        }*/

    }
}