import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        int nRandom;

        for(int i = 0; i < 20;i++){

            nRandom = (int)(Math.random()*101);

            numero[i] = nRandom;
            cuadrado[i] = (int)(Math.pow(nRandom,2));
            cubo[i] = (int)(Math.pow(nRandom,3));
        }

        System.out.println("——————————————————————————————————————————————————————————————————————————————————");
        System.out.print("Array numero: ");
        for (int x = 0; x < 20;x++){
            System.out.print(numero[x] + " ");
        }
        System.out.println("");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————");
        System.out.print("Array cuadrado: ");
        for (int x = 0; x < 20;x++){
            System.out.print(cuadrado[x] + " ");
        }
        System.out.println("");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————");
        System.out.print("Array cubo: ");
        for (int x = 0; x < 20;x++){
            System.out.print(cubo[x] + " ");
        }
        System.out.println("");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————");
    }
}