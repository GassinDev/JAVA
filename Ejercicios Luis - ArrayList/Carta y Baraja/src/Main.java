import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);

        Baraja b = new Baraja(1);
        double puntos = 0;
        boolean continuar = true;
        String opcion;

        while (puntos < 7.5 && continuar)
        {
            Carta c = b.Robar();
            System.out.println("Has robado: " + c);
            puntos = puntos + c.Valor7ymedia(c.getNumero());
            System.out.println("Puntos totales: " + puntos);
            System.out.println();
            if (puntos < 7.5)
            {
                System.out.println("¿Quíeres otra?");
                opcion = reader.next();

                if (!opcion.toLowerCase().startsWith("s"))
                {
                    continuar = false;
                }
            }
        }
        System.out.println(puntos);
        if (puntos > 7.5)
        {
            System.out.println("Te has pasado");
        }
            else
        {
            if (puntos == 7.5)
            {
                System.out.println("Has ganado");
            }
                else
            {
                System.out.println("Casi");
            }
        }
    }
}