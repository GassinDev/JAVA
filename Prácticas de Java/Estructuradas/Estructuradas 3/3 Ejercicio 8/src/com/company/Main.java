package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int nHoras;

        System.out.println("Dime las horas trabajadas");
        nHoras = reader.nextInt();

        double sueldo = nHoras*12*7;

        System.out.println("El resultado son " + sueldo + " euros");
    }
}
