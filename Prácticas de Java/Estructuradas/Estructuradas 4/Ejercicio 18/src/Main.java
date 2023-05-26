import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n;

        System.out.println("Dime el número para decirte la primera cifra, máximo de 5 cifras");
        n = reader.nextInt();

        if(n < 10){
            System.out.println("La primera cifra es " + n);
        }else{
            if(n >= 10 & n < 100){
                System.out.println("La primera cifra es " + n/10);
            }else{
                if(n >= 100 & n < 1000){
                    System.out.println("La primera cifra es " + n/100);
                }else{
                    if(n >= 1000 & n < 10000){
                        System.out.println("La primera cifra es " + n/1000);
                    }else{
                        if(n >= 10000 & n < 100000){
                            System.out.println("La primera cifra es " + n/10000);
                        }else{
                            System.out.println("Tu número tiene más de 5 cifras");
                        }
                    }
                }
            }
        }
    }
}