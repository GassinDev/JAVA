import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double horas, minutos, segundos, segundosRestan;

        System.out.println("Te voy a decir cuantos segundos quedan para la medianoche");
        System.out.println("Dime primero las horas");
        horas = reader.nextInt();
        System.out.println("Ahora dime los minutos");
        minutos = reader.nextInt();

        segundos = ((horas * 60) + minutos)*60;

        segundosRestan = 86400 - segundos;

        System.out.println("Te quedarían " + (int)segundosRestan + " segundos para la medianoche");

    }
}