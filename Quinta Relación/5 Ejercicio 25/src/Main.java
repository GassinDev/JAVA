import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n,vol= 0;
        System.out.println("Dime un número");
        n = reader.nextInt();

        n = n * 10;

        while (n > 0) {
            vol = (vol * 10) + (n % 10);
            n /= 10;
        }
        System.out.print("Nos quedaría el " + vol);
    }
}