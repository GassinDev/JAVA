import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] array = new int[10];
        int numeros;

        for(int i = 0; i < 10;i++){
            System.out.println("Dime números");
            numeros = reader.nextInt();

            array[i] = numeros;
        }

        for (int x = 9; x >= 0;x--){
            System.out.print(array[x] + " ");
        }
    }
}