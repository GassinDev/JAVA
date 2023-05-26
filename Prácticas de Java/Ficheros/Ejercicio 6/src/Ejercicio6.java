import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("No se reconoció el argumento");
            System.out.println("El nombre del fichero es: fichero.txt");
            System.exit(-1);
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            String linea = "";
            String palabra = args[1];
            int nPalabras = 0;

            int i = 0;

            while ((linea = br.readLine()) != null) {

                while ((i = linea.indexOf(palabra)) != -1) {
                    linea = linea.substring(i + palabra.length(), linea.length());
                    nPalabras++;
                }
            }

            System.out.println("La palabra " + palabra + " se repite en el fichero un total de " + nPalabras);

            br.close();

        }catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}