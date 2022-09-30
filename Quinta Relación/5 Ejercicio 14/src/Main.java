import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int base,exponente,resultado;

        System.out.println("Dime la base");
        base = reader.nextInt();
        System.out.println("Dime el exponente que quieres");
        exponente = reader.nextInt();

        resultado = (int)(Math.pow(base,exponente));

        System.out.println("Su resultado es " + resultado);



    }
}