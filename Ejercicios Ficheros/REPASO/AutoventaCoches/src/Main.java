import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Autoventa autoventa = new Autoventa();

        int opcion = -1;

        while(opcion != 0){

            System.out.println("Menú de AutoVentas Juan");
            System.out.println("---------------------------");
            System.out.println("1) Inserta coches");
            System.out.println("2) Imprime Listado");
            System.out.println("3) Busca coches");


            System.out.print("Elije tu ópcion:");
            opcion = reader.nextInt();

            switch (opcion){
                case 1:{
                    autoventa.insertaCoche();
                }break;

                case 2:{
                    System.out.println(autoventa.imprimeListado());
                }break;

                case 3:{
                    System.out.println(autoventa.buscaCoches());
                }break;

            }
        }

        autoventa.guardaCSV("coches");
    }
}