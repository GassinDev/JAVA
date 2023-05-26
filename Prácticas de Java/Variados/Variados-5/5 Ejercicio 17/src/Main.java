import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n, suma = 0;

        System.out.println("Dime un número entero y positivo");
        n = reader.nextInt();
        while(n < 0){
            System.out.println("ERROR - Porfavor, que sea un positivo");
            n = reader.nextInt();
        }

        for(int i = n; i < n + 100; i++) {
            suma = suma +  i;
        }

        System.out.println("El resultado es " + suma);
    }
}