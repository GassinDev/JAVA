import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String palabra;
        int fallos = 0,aciertos = 0;
        int random;

        HashMap<String,String> diccionario = new HashMap<>();

        diccionario.put("pan","bread");
        diccionario.put("taza","cup");
        diccionario.put("tarta","cake");
        diccionario.put("ordenador","computer");
        diccionario.put("libro","book");
        diccionario.put("dragon","drake");
        diccionario.put("videojuego","videogame");

        Collections.shuffle(diccionario);
        for(int i = 0;i < 5;i++){

            random = (int)(Math.random()*6);

            if( d)){
                aciertos++;
            }else {
                fallos++;
            }

        }
    }
}