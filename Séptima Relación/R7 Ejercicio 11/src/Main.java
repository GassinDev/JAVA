import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n,contador = 0;
        int[] array = new int[10];
        int[] arraymodi = new int[10];
        boolean primo;

        for(int i = 0; i < array.length; i++){
            System.out.println("Dime números");
            n = reader.nextInt();

            array[i] = n;
        }

        System.out.println();
        System.out.println("Array original");
        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.println("[" + i + "]" + "\t" + array[i]);
        }
//-------------------------------------------------------------------------------------
        for(int i = 0; i < array.length;i++){
            primo = true;

            for(int x = 2; x < array[i];x++){
                if(array[i] % x == 0) {
                    primo = false;
                }
            }
            if(primo){
                arraymodi[contador] = array[i];
                contador++;
            }
        }

        for(int i = 0; i < array.length;i++){
            primo = true;

            for(int x = 2; x < array[i];x++){
                if(array[i] % x == 0) {
                    primo = false;
                }
            }
            if(!primo){
                arraymodi[contador] = array[i];
                contador++;
            }
        }


        System.out.println();
        System.out.println("Array modificado");
        System.out.println();

        for(int i = 0; i < array.length; i++){
            System.out.println("[" + i + "]" + "\t" + arraymodi[i]);
        }
    }
}