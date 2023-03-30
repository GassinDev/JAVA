import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("No se reconocieron los argumentos y el comando es --> Ejercicio3");
            System.exit(-1);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

            String linea = "";
            String linea2 = "";

            while ( (linea != null) || (linea2 != null) ) {
                linea = br.readLine();
                linea2 = br2.readLine();

                if (linea != null) {
                    bw.write(linea + "\n");
                }

                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }
            }

            br.close();
            br2.close();
            bw.close();

        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}