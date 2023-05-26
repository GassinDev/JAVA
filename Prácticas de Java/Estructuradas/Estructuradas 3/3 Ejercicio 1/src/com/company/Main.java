package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Dime el primer número");
        x = reader.nextInt();
        System.out.println("Dime el segundo número");
        y = reader.nextInt();

        System.out.println("Tu resultado es " + (x*y));
    }
}
