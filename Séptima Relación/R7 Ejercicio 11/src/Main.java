import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n,contador = 0,contador2 = 1,prim = 0,prueba = 0;
        int array[] = new int[10];
        int arraymodi[] = new int[10];

        for(int i = 0; i < array.length; i++){
            System.out.println("Dime números");
            n = reader.nextInt();

            array[i] = n;
        }

        System.out.println();
        System.out.println("Array original");
        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.println("[" + i + "]" + "\t" + array[i]);
        }

        for (int i = 0; i < 10; i++) {
            do {
                prim++;
                prueba = array[i] % prim;

                if (prueba == 0) {
                    contador++;
                }

            } while (prim != array[i]);

            if (contador == 2) {
                arraymodi[i] = array[i];
            } else {
                arraymodi[arraymodi.length - contador2] = array[i];
                contador2++;
            }

            contador = 0;
            prim = 0;
        }

        System.out.println();
        System.out.println("Array modificado");
        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.println("[" + i + "]" + "\t" + arraymodi[i]);
        }
    }
}