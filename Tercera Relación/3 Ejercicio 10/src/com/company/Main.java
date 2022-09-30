package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double mb,kb;

        System.out.println("Dime los mb que quieres convertir a kb");
        mb = reader.nextDouble();

      32  kb = mb * 1000;

        System.out.println("Serían " + kb + " kb");
    }
}
