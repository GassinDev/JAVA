import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No se reconoció el argumento");
            System.out.println("El nombre del fichero es: fichero.txt y el comando es --> Ejercicio4");
            System.exit(-1);
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            int tamañoTotalNombreFiche = args[0].length();
            String nombreFichero = args[0].substring(0,tamañoTotalNombreFiche - 4);
            String extension = args[0].substring(tamañoTotalNombreFiche - 4,tamañoTotalNombreFiche);

            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero + "_sort" + extension));

            String linea = "";

            while( linea != null){
                linea = br.readLine();

                for(int i = linea.length(); i >= 0;i--){
                    linea = linea.substring(i,i+1);
                }
                bw.write(linea);
            }
            bw.close();
            br.close();

        }catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }

    }

}