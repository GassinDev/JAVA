import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n,cifras = 0;
        System.out.println("Dime el número que quieres que te cuente las cifras");
        n = reader.nextInt();

        if(n < 10 & n > -10){
            System.out.println("Tiene 1 cifra");
        }else{
            if(n >= 10 & n < 100 | n <= -10 & n > -100){
                System.out.println("Tiene 2 cifras");
            }else{
                if(n >= 100 & n < 1000 | n <= -100 & n > -1000){
                    System.out.println("Tiene 3 cifras");
                }else{
                    if(n >= 1000 & n < 10000 | n <= -1000 & n > -10000){
                        System.out.println("Tiene 4 cifras");
                    }else{
                        if(n >= 100000 & n < 100000 | n <= -10000 & n > -100000){
                            System.out.println("Tiene 5 cifras");
                        }else{
                            System.out.println("Perdona pero número con más de 5 cifras no puedo contartelos.");
                        }
                    }
                }
            }
        }


    }
}