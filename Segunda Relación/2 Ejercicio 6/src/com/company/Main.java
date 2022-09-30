package com.company;

public class Main {

    public static void main(String[] args) {

        double baseImponible = 945.5;

        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA: " + (baseImponible * 0.21));
        System.out.println("-------------------------------------");
        System.out.println("Precio con IVA: " + (baseImponible * 1.21));
    }
}
