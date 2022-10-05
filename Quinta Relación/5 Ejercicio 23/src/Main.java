import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);

        int n,suma = 0,nNumeros = 0;
        double media;
        System.out.println("Dime números");
        n = reader.nextInt();
        nNumeros++;
        suma += n;
        System.out.println("Llevas " + suma);
        while (suma < 10000){
            System.out.println("Dime números");
            n = reader.nextInt();
            suma += n;
            nNumeros++;
            System.out.println("Llevas " + suma);
        }

        media = (double)suma / (double)nNumeros;

        System.out.println("La suma de todos esos números es " + suma);
        System.out.println("Has introducido " + nNumeros + " números");
        System.out.println("La media es " + media);


    }
}