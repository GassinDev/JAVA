import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double h;
        double t;

        System.out.println("Dime la altura a la que vas a dejar caer el objecto. (t = √((2*h)/g)) --> g = 9,81 m/s^2");
        h = reader.nextDouble();

        t = Math.sqrt((h*2)/9.81);

        System.out.println("Tu resultado es " + String.format("%.2f", t) + " segundos");

    }
}