import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> nombres = new ArrayList<>();

        nombres.add("Jesús");
        nombres.add("Juan");
        nombres.add("Dani");
        nombres.add("Álvaro");
        nombres.add("Rafael");
        nombres.add("Marco");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}