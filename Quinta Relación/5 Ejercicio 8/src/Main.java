import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int i,n,r = 1;

        System.out.println("Dime un número para hacerte la tabala de multiplicar");
        n = reader.nextInt();

        System.out.println("La tabla del " + n);

        for(i = 1; i <= 10;i++){

            System.out.println(" 2 x " + i + " = " + n*i);
        }
    }
}