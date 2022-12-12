import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int opcion = -1;

        while(opcion == -1){

            System.out.println("MENU");
            System.out.println("--------------------------");
            System.out.println("1. Binario a decimal");
            System.out.println("2. Decimal a binario");
            System.out.println("3. Conversor");
            System.out.println();
            System.out.print("Elija una opcion: ");
            opcion = reader.nextInt();

            switch (opcion){

                case 1:{
                    int n;

                    System.out.println("Dime un numero");
                    n = reader.nextInt();

                    System.out.println(n + " en decimal es " + aDecimal(n));
                }break;

                case 2:{

                }break;

                case 3:{

                }break;
            }
        }
    }

    public static int aDecimal(int n){

    }
}