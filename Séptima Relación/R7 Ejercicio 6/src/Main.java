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
        for(int i = 0; i < 15;i++){

            s = array[14];
            array [0] = s;

            System.out.print(array[i] + " ");

            if(i != 0){
                i = 1;
                array[i] = i;
                i++;
            }
        }
    }
}