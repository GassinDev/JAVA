package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double baseImponible;

        System.out.println("Dime la base imponible");
        baseImponible = reader.nextDouble();

        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA: " + (baseImponible * 0.21));
        System.out.println("-------------------------------------");
        System.out.println("Precio con IVA: " + (baseImponible * 1.21));
    }
}
