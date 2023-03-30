import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class quita_comentarios {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("No se reconoció el argumento");
            System.out.println("El nombre del fichero es: hola.java y el comando seria ---> quita_comentarios.java");
            System.exit(-1);
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            String linea = "";
            int i = 0;
            boolean comentarioBloque = false;
            String inicioCB = "";
            String finCB = "";

            while((linea = br.readLine()) != null){

                if (((i = linea.indexOf("//")) != -1)) {
                    linea = linea.substring(0, 0);
                    bw.write(linea);
                }else

                if ((i = linea.indexOf("/*")) != -1) {
                    comentarioBloque = true;
                    inicioCB = linea.substring(0, i);
                }

                if ((i = linea.indexOf("*/")) != -1) {
                    comentarioBloque = false;
                    finCB = linea.substring(i + 2, linea.length());
                    linea = linea.substring(0,0);
                }

                if (!comentarioBloque) {
                    bw.write(linea + "\n");
                }
            }
            bw.close();
            br.close();

        }catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}