import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        boolean s;
        int cont = 0,contlen = 7;
        String palabras;
        String[] arrayPalabras = new String[8];
        String[] arrayresultado = new String[8];
        String[] colores = {"verde","rojo","azul","amarillo","naranja",
                            "rosa","negro","blanco","morado"};

        for(int i = 0; i < arrayPalabras.length;i++){
            System.out.println("Dime palabras y algun color");
            palabras = reader.next();

            arrayPalabras[i] = palabras;
        }

        System.out.println("");
        System.out.println("Array original:");
        for(int i = 0; i < arrayPalabras.length;i++){
            System.out.println(i + "   " + arrayPalabras[i]);
        }

        for(int i = 0; i < arrayPalabras.length;i++){
            s = false;
            for(int x = 0; x < colores.length;x++){
                if(Objects.equals(arrayPalabras[i],colores[x])){
                    s = true;
                }
            }
            if(s == false){
                arrayresultado[contlen] = arrayPalabras[i];
                contlen--;
            }else if (s == true){
                arrayresultado[cont] = arrayPalabras[i];
                cont++;
            }
        }

        System.out.println("");
        System.out.println("Array resultado:");
        for(int i = 0; i < arrayresultado.length;i++){
            System.out.println(i + "   " + arrayresultado[i]);
        }
    }
}