import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int mes;
        int dia;

        System.out.println("Dime el mes en el que naciste");
        mes = reader.nextInt();
        System.out.println("Ahora dime el dia ");
        dia = reader.nextInt();

        switch (mes){
            case 1:
                if (dia < 21) {
                    System.out.println("Tu horoscopo es capricornio");
                } else {
                    System.out.println("Tu horoscopo es acuario");
                }
                break;
            case 2:
                if (dia < 20) {
                    System.out.println("Tu horoscopo es acuario");
                } else {
                    System.out.println("Tu horoscopo es piscis");
                }
                break;
            case 3:
                if (dia < 21) {
                    System.out.println("Tu horoscopo es piscis");
                } else {
                    System.out.println("Tu horoscopo es aries");
                }
                break;
            case 4:
                if (dia < 21) {
                    System.out.println("Tu horoscopo es aries");
                } else {
                    System.out.println("Tu horoscopo es tauro");
                }
                break;
            case 5:
                if (dia < 20) {
                    System.out.println("Tu horoscopo es tauro");
                } else {
                    System.out.println("Tu horoscopo es géminis");
                }
                break;
            case 6:
                if (dia < 22) {
                    System.out.println("Tu horoscopo es géminis");
                } else {
                    System.out.println("Tu horoscopo es cáncer");
                }
                break;
            case 7:
                if (dia < 22) {
                    System.out.println("Tu horoscopo es cáncer");
                } else {
                    System.out.println("Tu horoscopo es leo");
                }
                break;
            case 8:
                if (dia < 24) {
                    System.out.println("Tu horoscopo es leo");
                } else {
                    System.out.println("Tu horoscopo es virgo");
                }
                break;
            case 9:
                if (dia < 23) {
                    System.out.println("Tu horoscopo es virgo");
                } else {
                    System.out.println("Tu horoscopo es libra");
                }
                break;
            case 10:
                if (dia < 23) {
                    System.out.println("Tu horoscopo es libra");
                } else {
                    System.out.println("Tu horoscopo es escorpio");
                }
                break;
            case 11:
                if (dia < 23) {
                    System.out.println("Tu horoscopo es escorpio");
                } else {
                    System.out.println("Tu horoscopo es sagitario");
                }
                break;
            case 12:
                if (dia < 21) {
                    System.out.println("Tu horoscopo es sangitario");
                } else {
                    System.out.println("Tu horoscopo es capricornio");
                }
                break;
            default:
        }
        }

    }
