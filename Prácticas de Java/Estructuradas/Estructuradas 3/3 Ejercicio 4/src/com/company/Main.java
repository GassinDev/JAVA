package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Dime el primer número");
        x = reader.nextDouble();
        System.out.println("Dime el primer número");
        y = reader.nextDouble();

        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + ((double)x/y));
    }
}
