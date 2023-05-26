import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int nTerminos,f1 = 0,f2 = 1,f = 1;


        System.out.println("Dime hasta que término quieres que te diga de Fibonacci");
        nTerminos = reader.nextInt();

        for (int i = 0; i < nTerminos; i++) {

            System.out.print(" " + f + " ");
            f = f1 + f2;
            f1 = f2;
            f2 = f;

        }
    }
}