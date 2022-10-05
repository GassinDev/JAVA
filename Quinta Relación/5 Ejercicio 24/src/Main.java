import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x, y,altura;

        System.out.println("Dime la altura de la pirámide");
        altura = reader.nextInt();
        System.out.println(" ");

        for (x = 1; x <= altura; x++)
        {
            for (y = 1; y <= altura - x; y++) {
                System.out.print(" ");
            }
            for (y = 1; y <= x; y++) {
                System.out.print(y);
            }
            for (y = x - 1; y >= 1; y--) {
                System.out.print(y);
            }
            System.out.println("");
        }
    }
}