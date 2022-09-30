package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double base;
        double altura;

        System.out.println("Dime la base del triángulo");
        base = reader.nextDouble();
        System.out.println("Dime el area del triángulo");
        altura = reader.nextDouble();

        System.out.println("El area del triángulo es " + ((base*altura)/2));
    }
}
