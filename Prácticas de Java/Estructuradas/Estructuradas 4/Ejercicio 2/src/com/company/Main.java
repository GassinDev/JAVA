package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int hora;

        System.out.println("Dime la hora");
        hora = reader.nextInt();

        if(hora >= 6 & hora <= 12 ){
            System.out.println("Hola buenos días");
        }else{
            if(hora >= 13 & hora <= 20 ){
                System.out.println("Hola buenos tardes");
            }else{
                System.out.println("Hola buenos noches");
            }
        }
    }
}
