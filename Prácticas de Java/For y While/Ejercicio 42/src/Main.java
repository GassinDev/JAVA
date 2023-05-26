import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n,nAcierto,intentos = 0;

        n = (int)(Math.random()*101);

        System.out.println("Intenta adivinar el número que he pensado del 0 al 100 (Estos están incluidos)");
        System.out.println("");

        for(int i = 0; i < i + 1 ;i++){

            System.out.println("Dime el número que crees que es");
            nAcierto = reader.nextInt();

            if(nAcierto == n){
                System.out.println("Muy bien acertaste");
                System.out.println("Ha necesitado " + intentos + " intentos");
                break;
            }else{
                System.out.println("Fallaste");
                System.out.println("");
                intentos++;

                if(n != nAcierto) {
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