import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int horas;
        double dinero;

        System.out.println("Dime las horas trabajadas en la semana");
        horas = reader.nextInt();

        if(horas <= 40){

            dinero = horas * 16;

        }else{
            dinero = (40 * 12) + ((horas - 40)*16);
        }

        System.out.println("Ha ganado esta semana " + dinero + " €");
    }
}