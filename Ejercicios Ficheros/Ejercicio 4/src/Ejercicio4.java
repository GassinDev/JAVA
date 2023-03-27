import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No se reconoció el argumento");
            System.out.println("El nombre del fichero es: fichero.txt");
            System.exit(-1);
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));

            String linea = "";

            while( linea != null){
                linea = br.readLine();

                char[] chars = linea.toCharArray();
                Arrays.sort(chars);
                linea = new String(chars);

                bw.write(linea);
            }

            br.close();
            bw.close();
        }catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}