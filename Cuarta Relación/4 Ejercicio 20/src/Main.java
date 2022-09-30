import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n,cifras = 0;
        System.out.println("Dime el número que quieres que te cuente las cifras");
        n = reader.nextInt();

        if(n < 10 & n > -10){
            System.out.println("Es capicúa");
        }else{
            if(n >= 10 & n < 100 | n <= -10 & n > -100){
                if ((n / 10) == (n % 10)) {
                    System.out.println("Es capicúa");
                }else{
                    System.out.println("No es capicúa");
                }
            }else{
                if(n >= 100 & n < 1000 | n <= -100 & n > -1000){
                    if ((n / 100) == (n % 10)) {
                        System.out.println("Es capicúa");
                    }else{
                        System.out.println("No es capicúa");
                    }
                }else{
                    if(n >= 1000 & n < 10000 | n <= -1000 & n > -10000){
                        if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
                            System.out.println("Es capicúa");
                        }else{
                            System.out.println("No es capicúa");
                        }
                    }else{
                        if(n >= 10000 & n < 100000 | n <= -10000 & n > -100000){
                            if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
                                System.out.println("Es capicúa");
                            }else{
                                System.out.println("No es capicúa");
                            }
                        }else{
                            System.out.println("Perdona pero números con más de 5 cifras no puedo contartelos.");
                        }
                    }
                }
            }
        }
    }
}