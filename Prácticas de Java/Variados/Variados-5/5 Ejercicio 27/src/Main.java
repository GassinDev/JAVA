import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,suma = 0,nMultiplos = 0;

        System.out.println("Dime un número");
        n = reader.nextInt();

        for (int i = 1; i <= n;i++){
            if(i % 3 == 0) {
                nMultiplos++;
                suma += i;
            }
        }

        System.out.println("Hay " + nMultiplos + " multiplos");
        System.out.println("Su suma es " + suma);
    }
}