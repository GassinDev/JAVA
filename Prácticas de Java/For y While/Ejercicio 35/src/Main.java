import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double n;

        System.out.println("Dime la nota del examen");
        n = reader.nextDouble();

        while (n < 0 | n > 10){
            System.out.println("Porfavor digame una nota valida entre 0 y 10");

            System.out.println("Dime la nota del examen");
            n = reader.nextDouble();
        }

        if(n >= 0 & n < 5){
            System.out.println("Suspenso");
        }else{
            if(n >= 5 & n < 6){
                System.out.println("Suficiente");
            }else{
                if(n >= 6 & n < 7){
                    System.out.println("Bien");
                }else{
                    if(n >= 7 & n < 9){
                        System.out.println("Notable");
                    }else{
                        System.out.println("Sobresaliente");
                    }
                }
            }
        }
    }
}