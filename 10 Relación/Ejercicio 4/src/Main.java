import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String pala = "";

        ArrayList<String> listaPalabras = new ArrayList<>(10);

        for(int i = 0; i < 10;i++){

            System.out.print("Dime palabras: ");
            pala = reader.nextLine();

            listaPalabras.add(pala);
        }

        Collections.sort(listaPalabras);

        for(String p: listaPalabras){
            System.out.println(p);
        }
    }
}