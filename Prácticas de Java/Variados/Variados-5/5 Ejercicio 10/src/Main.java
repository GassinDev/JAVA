import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numNotas = 0;
        double n,nSumadas = 0;

        System.out.println("Dime tus notas cuando quieras , para parar parar mete un número en negativo");
        n = reader.nextDouble();

        nSumadas = nSumadas + n;

        while(n >= 0){
            System.out.println("Dime tus notas cuando quieras , para parar mete un número en negativo");
            n = reader.nextDouble();

            numNotas++;

            if(n > 0){
                nSumadas = nSumadas + n;
            }else{

            }
        }

        System.out.println("Tu nota final es " + (double)(nSumadas/numNotas));
    }
}