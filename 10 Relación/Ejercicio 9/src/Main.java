import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        String palabra;
        HashMap<String,String> diccionario = new HashMap<>();

        diccionario.put("pan","bread");
        diccionario.put("taza","cup");
        diccionario.put("tarta","cake");
        diccionario.put("ordenador","computer");
        diccionario.put("libro","book");
        diccionario.put("dragon","drake");
        diccionario.put("videojuego","videogame");

        System.out.print("Dime una palabra de las siguientes (pan,taza,tarta,ordenador,libro,dragon,videojuego) y te la traducire: ");
        palabra = reader.nextLine();

        if(diccionario.containsKey(palabra)){
            System.out.println(palabra + " --> " + diccionario.get(palabra));
        }
    }
}