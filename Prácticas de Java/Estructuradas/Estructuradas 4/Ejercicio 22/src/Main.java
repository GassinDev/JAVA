import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int dia = 0,horas,minutos,minrestan,hdia;

        System.out.println("Dime un día de la semana");
        System.out.println("1) Lunes \n2) Martes \n3) Miércoles \n4) Jueves \n5) Viernes");
        dia = reader.nextInt();

        System.out.println("Dime las horas");
        horas = reader.nextInt();
        System.out.println("Dime los minutos");
        minutos = reader.nextInt();

        minutos = (horas*60) + minutos;
        minrestan = 6660;
        hdia = 24;

        switch (dia){
            case 1:{
                minrestan = minrestan - minutos;
                System.out.println("Te faltan " + minrestan + " minutos para el fin de semana");
            }break;

            case 2:{
                minrestan = minrestan - (minutos + (hdia * 60));
                System.out.println("Te faltan " + minrestan + " minutos para el fin de semana");
            }break;

            case 3:{
                minrestan = minrestan - (minutos + ((hdia*2) * 60));
                System.out.println("Te faltan " + minrestan + " minutos para el fin de semana");
            }break;

            case 4:{
                minrestan = minrestan - (minutos + ((hdia*3) * 60));
                System.out.println("Te faltan " + minrestan + " minutos para el fin de semana");
            }break;

            case 5:{
                minrestan = minrestan - (minutos + ((hdia*4) * 60));
                System.out.println("Te faltan " + minrestan + " minutos para el fin de semana");
            }break;
            default:
        }
    }
}