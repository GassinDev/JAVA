import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double n,n2,n3,nf;
        System.out.println("Dime la primera nota");
        n = reader.nextDouble();
        System.out.println("Dime la segunda nota");
        n2 = reader.nextDouble();
        System.out.println("Dime la tercera nota");
        n3 = reader.nextDouble();

        nf = (n+n2+n3)/3;

        System.out.println("Tus notas son " + n + " - " + n2 + " - " + n3 + " , por lo tanto tu nota final es " + String.format("%.2f",nf));
    }
}