import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int nSecreto,n, max = 100, min = 0,mom;

        System.out.println("Dime el número secreto para yo adivinarlo");
        nSecreto = reader.nextInt();
        System.out.println("");

        for(int i = 5; i >= 0;i--){

            if(i == 0){
                System.out.println("Te has quedado sin intentos");
                break;
            }

            n = (int)(Math.random() * (max - min) + min);

            if(nSecreto == n){
                System.out.println("Te digo el " + n);
                System.out.println("Muy bien acertaste");
                break;
            }else{
                System.out.println("Te digo el " + n);
                System.out.println("Fallaste");
                System.out.println("Te quedan " + (i - 1) + " intentos");
                System.out.println("");

                System.out.println("Dime si es mayor(1) o menor(2)");
                mom = reader.nextInt();

                if(mom == 1) {
                    min = nSecreto + 1;
                }else{
                    if(mom == 2){
                        max = nSecreto - 1;
                    }
                }

            }
        }
    }
}