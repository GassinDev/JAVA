import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            for(int i = 1; i <= 500;i++){

                if(esPrimo(i)){
                    bw.write(i + " ");
                }
            }

            bw.close();

        } catch (IOException e){
            System.out.println("No se pudo escribir en el fichero");
        }


    }
    public static boolean esPrimo(int numero) {

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0)
                return false;
        }

        return true;
    }
}

