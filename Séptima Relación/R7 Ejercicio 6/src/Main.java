import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] array = new int[15];
        int n,p,s;

        for(int i = 0; i < 15;i++){
            System.out.println("Dime números");
            n = reader.nextInt();

            array[i] = n;
        }

        //ARRAY SIN MODIFICAR
        for(int i = 0; i < 15;i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

        //ARRAY MODIFICADO

        System.out.print(array[14] + " ");

        for(int i = 0; i < 14;i++){

            System.out.print(array[i] + " ");
        }
    }
}