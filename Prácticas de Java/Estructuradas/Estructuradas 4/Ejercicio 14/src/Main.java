import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;

        System.out.println("Dime un número");
        n = reader.nextInt();

        if(n % 2 == 0){
            System.out.println("Si es par");
        }else{
            System.out.println("No es par");
        }

        if(n % 5 == 0){
            System.out.println("Es divible entre 5");
        }else{
            System.out.println("No es divible entre 5");
        }
    }
}