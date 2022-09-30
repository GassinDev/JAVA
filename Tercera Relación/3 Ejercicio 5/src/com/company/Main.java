package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double base;
        double altura;

        System.out.println("Dime la base del rectángulo");
        base = reader.nextDouble();
        System.out.println("Dime la altura del rectángulo");
        altura = reader.nextDouble();

        double areaRectangulo = base * altura;

        System.out.println("El área del rectángulo es " + areaRectangulo);

    }
}
