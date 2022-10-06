import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,vol= 0,suma = 0,par;
        System.out.println("Dime un número");
        n = reader.nextInt();

        n = n * 10 +1;

        while (n > 0) {
            vol = (vol * 10) + (n % 10);
            n /= 10;
        }

        while(vol != 1){
            if ((vol % 10) % 2 == 0){
                System.out.print(vol % 10 + ", ");;
                par = vol % 10;
                suma += par;
            }
            vol = vol / 10;
        }

        System.out.println("");
        System.out.println("La suma es " + suma);

    }
}