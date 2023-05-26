import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int base, exponente,baseant = 1;

        System.out.println("Dime la base");
        base = reader.nextInt();
        System.out.println("Dime el exponente");
        exponente = reader.nextInt();

        for(int i = 0; i < exponente;i++){

            System.out.print(" " + baseant * base + " ");
            baseant = baseant *  base;
        }
    }
}