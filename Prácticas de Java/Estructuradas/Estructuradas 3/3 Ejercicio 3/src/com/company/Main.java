package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double nEuros;
        double nPesetas;

        System.out.println("Dime las pesetas que tienes");
        nPesetas = reader.nextDouble();

        nEuros  = nPesetas * 0.006;

        System.out.println("Tienes " + nEuros + " euros");
    }
}
