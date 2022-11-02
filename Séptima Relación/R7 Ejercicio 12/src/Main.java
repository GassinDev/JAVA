import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        int start, end;

        System.out.println("Escribe los valores del array:");

        for (int i = 0; i < a.length; ++i) {
            System.out.println("Escribe el valor en la posicion: " + i);
            int valor = reader.nextInt();
            a[i] = valor;
        }

        for (int i = 0; i <= b.length - 1; ++i) {
            System.out.print(" " + i + " ");
        }

        System.out.println();
        System.out.print("[");

        for (int i = 0; i < a.length - 1; ++i) {
            System.out.print(a[i] + ", ");
        }

        System.out.print(a[a.length - 1]);
        System.out.println("]");

        System.out.println();

        System.out.println("Dime la posición inicial:");
        start = reader.nextInt();
        System.out.println("Dime la posición final;");
        end = reader.nextInt();

        if (start < end && start >= 0 && start < 10 && end >= 0 && end < 10) {
            for (int i = 0; i < 10; i++) {
                c[i] = a[i];
            }

            c[end] = a[start];

            for (int i = end + 1; i < 10; i++) {
                c[i] = a[i - 1];
            }

            c[0] = a[9];

            for (int i = 0; i < start; i++) {
                c[i + 1] = a[i];
            }
        } else {
            System.out.println("El número del inicio tiene que ser menor que el del final. Y ambos deben estar entre el 0 y el 9.");
        }


        for (int i = 0; i <= b.length - 1; ++i) {
            System.out.print(" " + i + " ");
        }

        System.out.println();
        System.out.print("[");

        for (int i = 0; i < a.length - 1; ++i) {
            System.out.print(c[i] + ", ");
        }

        System.out.print(c[c.length - 1]);
        System.out.println("]");
    }
}