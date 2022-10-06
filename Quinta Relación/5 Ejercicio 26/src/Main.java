import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n, d, posi = 1, voltear = 0;

        System.out.println("Dime un número");
        n = reader.nextInt();
        System.out.println("Dime el dígito que quieres que te busque");
        d = reader.nextInt();

        n = n * 10;

        // Para darle la vuelta
        while (n > 0) {
            voltear = (voltear * 10) + (n % 10);
            n = n / 10;
        }
        System.out.print("El digito " + d + " se encuentra en la posicion ---> ");

        //Para saber las posiciones
        while (voltear != 1) {
            if ((voltear % 10) == d) {
                System.out.print(posi + " - ");
            }
            voltear /= 10;
            posi++;
        }

    }
}