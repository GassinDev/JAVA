import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, alt, j;

        System.out.println("Dime la altura de la pirámide:");
        alt = sc.nextInt();

        alt += 3;

        for( i = 3; i < alt; i++){
            for(int blancos = 1; blancos <= alt - i; blancos++){
                System.out.print(" ");
            }

            if(i % 2 == 0){
                for (int asteriscos = 2; asteriscos < ((i / 2) * 2); asteriscos++) {
                    System.out.print("*");
                }
                System.out.print("    ");
                for (int asteriscos = (i*2) - 2; asteriscos > ((i / 2) * 2); asteriscos--) {
                    System.out.print("*");
                }
            }
            else {
                for (int asteriscos = 1; asteriscos <= (i*2); asteriscos++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}