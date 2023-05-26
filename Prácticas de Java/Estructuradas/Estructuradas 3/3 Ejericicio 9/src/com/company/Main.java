package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double radio,altura;

        System.out.println("Dime el radio de la base del cono");
        radio = reader.nextDouble();
        System.out.println("Dime la altura del cono");
        altura = reader.nextDouble();

        double volumenCono = ((double)1/3)*Math. PI*(Math.pow(radio,2))*altura;

        System.out.println("El volumen del cono es " + volumenCono);
    }
}
