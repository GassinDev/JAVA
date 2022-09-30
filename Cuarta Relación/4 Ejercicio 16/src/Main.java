import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;
        int ultimaCifra;
        System.out.println("Dime el número");
        n = reader.nextInt();

        ultimaCifra = n%10;
        System.out.println("La última cifra es " + ultimaCifra);



    }
}