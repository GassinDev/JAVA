package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String dia;
        String asignatura;

        System.out.println("Dime el día");
        dia = reader.next();

        switch (dia){

            case "Lunes":
                asignatura = "Programacíón";
                System.out.println("Tienes " + asignatura);
                break;

            case "Martes":
                asignatura = "Lenguaje de marcas";
                System.out.println("Tienes " + asignatura);
                break;

            case "Miércoles":
                asignatura = "Inglés";
                System.out.println("Tienes " + asignatura);
                break;

            case "Jueves":
                asignatura = "Base de datos";
                System.out.println("Tienes " + asignatura);
                break;

            case "Viernes":
                asignatura = "Entornos de desarrollo";
                System.out.println("Tienes " + asignatura);
                break;
            default:System.out.println("En el caso de no funcionar, mire si esta bien escrito y con la primera letra en mayúscula");
        }
    }
}
