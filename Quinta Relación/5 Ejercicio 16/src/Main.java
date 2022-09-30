import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n;

        System.out.println("Dime un número y te dire si es primo o no");
        n = reader.nextInt();

        for(int i = 2; i < n;i++) {
            if (n % i == 0) {
                System.out.println("No es Primo");
                break;
            }else{
                System.out.println("Es Primo");
                break;
            }
        }

    }
}