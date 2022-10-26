import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] array = new int[10];
        int n,u,inicial = 0,fina = 0;

        for(int i = 0; i < 15;i++){
            System.out.println("Dime números");
            n = reader.nextInt();

            array[i] = n;
        }


        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Dime la posicion inicial");
        inicial = reader.nextInt();

        System.out.println("DIme la posicion final");
        fina = reader.nextInt();

        while(inicial > fina && inicial <= 0 & inicial >= 9 & fina <= 0 && fina >= 9 ){

            System.out.println();
            System.out.println();

            System.out.println("Dime la posicion inicial");
            inicial = reader.nextInt();

            System.out.println("DIme la posicion final");
            fina = reader.nextInt();
        }

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