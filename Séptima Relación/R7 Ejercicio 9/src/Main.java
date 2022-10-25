import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int array[] = new int[8];
        int n;

        for(int i = 0; i < array.length;i++){
            System.out.println("Dime numeros enteros");
            n = reader.nextInt();

            array[i] = n;

        }

        for(int i = 0; i < array.length;i++){

            if(array[i] % 2 == 0){
                System.out.print(array[i] + ":par  ");
            }else{
                System.out.print(array[i] + ":impar  ");
            }
        }

    }
}