import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] array = new int[10];
        int n;

        //GUARDA LOS NUMEROS
        for(int i = 0; i < 10;i++){
            System.out.println("Dime numeros");
            n = reader.nextInt();

            array[i] = n;
        }

        int maximo = array[0],minimo = array[0];

        //LOCALIZA EL MINIMO Y MAXIMO
        for(int i = 0; i < 10;i++){

            if(array[i] > maximo) {
                maximo = array[i];
            }

            if(array[i] < minimo) {
                minimo = array[i];
            }
        }

        //PINTA EL ARRAY
        for(int i = 0; i < 10;i++){
            System.out.print(array[i]);
            if(array[i] == maximo){
                System.out.print(":maximo");
            }else{
                if(array[i] == minimo){
                    System.out.print(":mínimo ");
                }
            }
            System.out.println();
        }
    }
}