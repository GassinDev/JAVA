import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean primo = true;
        int n;

        System.out.println("Dime un número");
        n = reader.nextInt();

        for(int i = 2; i < n; i++) {

            if (n % i == 0) {
                primo = false;
                break;
            }

        }
        if (primo) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
        
}
