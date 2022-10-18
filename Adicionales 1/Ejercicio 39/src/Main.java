import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,n2,a,b,mcd,mcm;

        System.out.println("Dime un número");
        n = reader.nextInt();
        System.out.println("Dime otro número");
        n2 = reader.nextInt();

        a = Math.max(n,n2);
        b = Math.min(n,n2);

        do{
            mcd = b;
            b = a % b;
            a = mcd;
        }while(b != 0);

        a = Math.max(n,n2);
        b = Math.min(n,n2);

        mcm = (a / mcd) * b;

        System.out.println("El mínimo común múltiplo de " + n + " y " + n2 + " es " + mcm);
    }
}