import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n,nAcierto;

        n = (int)(Math.random()*101);

        System.out.println("Intenta adivinar el número que he pensado del 0 al 100 (Estos están incluidos)");
        System.out.println("");
        for(int i = 5; i >= 0;i--){

            if(i == 0){
                System.out.println("Te has quedado sin intentos");
                break;
            }
            System.out.println("Te quedan " + i + " intentos");
            System.out.println("Dime el número que crees que es");
            nAcierto = reader.nextInt();

            if(nAcierto == n){
                System.out.println("Muy bien acertaste");
                break;
            }else{
                System.out.println("Fallaste");
                System.out.println("");

                if(i != 1) {
                    if (n < nAcierto) {
                        System.out.println("Es más pequeño");
                    } else {
                        System.out.println("Es más grande");
                    }
                }

            }
        }
    }
}