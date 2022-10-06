import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,nNumeros = 0,sumImpa = 0,nNumerosImpa = 0,mayorDelosPares = 0;
        double mediaImpa;
        System.out.println("Dime números");
        n = reader.nextInt();

        if((n % 2) == 1){
            sumImpa = sumImpa + n;
            nNumerosImpa++;
        }else{
            if(mayorDelosPares < n){
                mayorDelosPares = n;
            }
        }

        while(n >= 0){
            System.out.println("Dime números");
            n = reader.nextInt();

            nNumeros++;

            if((n % 2) == 1){
                sumImpa = sumImpa + n;
                nNumerosImpa++;
            }else{
                if(mayorDelosPares < n){
                    mayorDelosPares = n;
                }
            }

        }

        if(sumImpa != 0){
            mediaImpa = (double)sumImpa / (double)nNumerosImpa;

            System.out.println("Has introducido " + nNumeros + " números");
            System.out.println("El resultado de la media de los impares es " + mediaImpa);
            System.out.println("El número mayor de los pares es " + mayorDelosPares);
        }else{
            System.out.println("Has introducido " + nNumeros + " números");
            System.out.println("El resultado de la media de los impares es 0");
            System.out.println("El número mayor de los pares es " + mayorDelosPares);
        }





    }
}