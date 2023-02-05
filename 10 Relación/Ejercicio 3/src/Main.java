import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num;

        ArrayList<Integer> numeros = new ArrayList<>(10);

        for(int i = 0; i < 10;i++){

            System.out.print("Dime numeros: ");
            num = reader.nextInt();

            numeros.add(num);
        }

        Collections.sort(numeros);

        for(Integer n: numeros){
            System.out.println(n);
        }
    }
}