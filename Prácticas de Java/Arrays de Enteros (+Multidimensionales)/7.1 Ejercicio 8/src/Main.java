import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("\nIntroduzca la posición del alfil (Ejemplo = d2)");
        String posicionAlfil = reader.next();
        int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
        int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                int disty = Math.abs(filaAlfil - fila);
                int distx = Math.abs(columnaAlfil - columna);

                if ((disty == distx)) {
                    if((columna == columnaAlfil) && (fila == filaAlfil)){
                        continue;
                    }else {
                        System.out.print((char)(columna + 96) + "" + fila + " ");
                    }

                }
            }
        }
    }
}