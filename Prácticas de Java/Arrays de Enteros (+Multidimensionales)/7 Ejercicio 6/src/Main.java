import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] array = new int[15];
        int n,u;

        for(int i = 0; i < 15;i++){
            System.out.println("Dime números");
            n = reader.nextInt();

            array[i] = n;
        }

        //ARRAY SIN MODIFICAR
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

        //ARRAY MODIFICADO
        u = array[14];

        for(int i = array.length - 1; i > 0;i--){

                array[i] = array[i - 1];

        }

        array[0] = u;

        //ARRAY SIN MODIFICAR
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }

    }
}