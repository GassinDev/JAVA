package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double nEuros;
        double nPesetas;

        System.out.println("Dime los euros que tienes");
        nEuros = reader.nextDouble();

        nPesetas = nEuros * 166.66;

        System.out.println("Tienes " + nPesetas + " pesetas.");

    }
}
