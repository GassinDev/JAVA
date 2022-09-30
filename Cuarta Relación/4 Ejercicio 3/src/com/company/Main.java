package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n;
        String dia;
        System.out.println("Dime un número del 1 al 7");
        n = reader.nextInt();

        switch (n){
            case 1:
                dia = "Lunes";
                System.out.println("Es el " + dia);
            break;
            case 2:
                dia = "Martes";
                System.out.println("Es el " + dia);
                break;
            case 3:
                dia = "Miércoles";
                System.out.println("Es el " + dia);
                break;
            case 4:
                dia = "Jueves";
                System.out.println("Es el " + dia);
                break;
            case 5:
                dia = "Viernes";
                System.out.println("Es el " + dia);
                break;
            case 6:
                dia = "Sábado";
                System.out.println("Es el " + dia);
                break;
            case 7:
                dia = "Domingo";
                System.out.println("Es el " + dia);
                break;
        }
    }
}
