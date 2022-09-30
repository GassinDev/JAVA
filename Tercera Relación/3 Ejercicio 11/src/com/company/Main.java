package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double mb,kb;

        System.out.println("Dime los kb que quieres convertir a mb");
        kb = reader.nextDouble();

        mb = kb * 0.001;

        System.out.println("Serían " + mb + " mb");
    }
}
