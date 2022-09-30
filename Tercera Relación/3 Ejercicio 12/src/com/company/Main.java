package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double baseImponible;
        double precioIva;
        double baseImponibleConIva;
        String iva;
        String codigo;
        double valorIva = 0;
        double ofertaCodigo = 0;
        double precioOferta = 0;

        System.out.println("Dime la base imponible");
        baseImponible = reader.nextDouble();
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido)");
        iva = reader.next();
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc)");
        codigo = reader.next();

        switch (iva) {

            case "general":
                valorIva = 0.21;
                break;

            case "reducido":
                valorIva = 0.10;
                break;

            case "superreducido":
                valorIva = 0.04;

                break;
            default:
        }

        switch (codigo) {

            case "nopro":
                ofertaCodigo = 0;
                break;

            case "mitad":
                ofertaCodigo = -0.5;
                break;

            case "menos5":
                ofertaCodigo = -5;

                break;

            case "5porc":
                ofertaCodigo = - 0.05;

                break;

            default:
        }

        System.out.println("Introduzca la base imponible: " + baseImponible);
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): " + iva);
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): " + codigo);
        System.out.println();
        System.out.println("Base Imponible      " + baseImponible);
        System.out.println("IVA("+(int)(valorIva*100)+"%)       "+baseImponible*valorIva);
        System.out.println("Precio con IVA      "+ (baseImponible*(valorIva+1)));

        if(codigo=="menos5"){
            precioOferta = baseImponible    + ofertaCodigo;

        }else {
            precioOferta = baseImponible  * ofertaCodigo;
        }
        System.out.println("Cód. promo. (" + codigo + "):     "+precioOferta);
        System.out.println("---------------------------------------------");
        System.out.println("Total               " + (baseImponible*(valorIva+1)+precioOferta));
    }
}



