import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,facto=1;

        System.out.println("Dime el factorial que quieres");
        n = reader.nextInt();

        for(int i = 1;i <= n;i++){
            facto *= i;
        }
        System.out.println("El factorial es " + facto);
    }
}