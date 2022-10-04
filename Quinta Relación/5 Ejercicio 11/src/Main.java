import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n,i;

        System.out.println("Dime 5 números a partir del uno");
        n = reader.nextInt();

        for(i = 0;i <= 5;i++){
            System.out.println("Dime 5 números a partir del uno");
            n = reader.nextInt();

            System.out.println(n + " " +Math.pow(2,n) + " " + Math.pow(3,n));
        }
    }
}