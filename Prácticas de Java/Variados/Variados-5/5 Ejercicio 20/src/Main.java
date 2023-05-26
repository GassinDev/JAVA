import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int altura,x, y, z;

        String caracter;

        System.out.println("Dime la altura de la pirámide hueca");
        altura = reader.nextInt();
        System.out.println("Dime el caracter que quieres que pinte la pirámide hueca");
        caracter = reader.next();

        //  para crear cada fila
        for (x = 1; x <= altura; x++) {
            // Coloca espacios
            for (y = x; y < altura; y++) {
                System.out.print(" ");
            }


            for (z = 1; z < 2 * x; z++) {
                // Esta parte es para ir colocando el limite con el caracter indicado
                if (x == altura || (z == 1 || z == 2 * x - 1)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}