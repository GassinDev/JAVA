package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double nota1examen;
        double notaQuerida;
        double nota2examen;

	    System.out.println("Dime la nota del primer examen");
	    nota1examen = reader.nextDouble();
	    System.out.println("¿ Qué nota quieres en el trimestre ?");
        notaQuerida = reader.nextDouble();
        System.out.println("Dime la nota del primer examen " + nota1examen);
        System.out.println("¿ Qué nota quieres en el trimestre ? " + notaQuerida);
        nota1examen = nota1examen * 0.4;
        nota2examen = notaQuerida - nota1examen;
        nota2examen = nota2examen / 0.6;


        System.out.println("Tendrías que sacar en el segundo examen un " + nota2examen);




    }
}
