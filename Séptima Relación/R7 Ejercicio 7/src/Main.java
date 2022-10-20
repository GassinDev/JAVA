import javax.naming.PartialResultException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int n, v,v2;
        int [] array = new int[100];

        System.out.print("[ ");
        for(int i = 0; i < 100;i++){
            n = (int) (Math.random()* 21);
            array[i] = n;
            System.out.print(array[i] + " ");
        }
        System.out.print(" ]");
        System.out.println("");

        System.out.println("Dime el número que quieres cambiar");
        v = reader.nextInt();
        System.out.println("El número que quieres colocar");
        v2 = reader.nextInt();

        System.out.print("[ ");
        for(int i = 0; i < array.length;i++){

            if(array[i] == v){
                array[i] = v2;System.out.print("'" + array[i] + "' ");
            }else{
                System.out.print(array[i] + " ");
            }

        }
        System.out.print(" ]");
    }
}