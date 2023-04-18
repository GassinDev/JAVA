import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(System.in);

            Pokedex pq = new Pokedex();

            int opcion = -1;

            while(opcion != 0){

                System.out.println("Menú de la Pokedex");
                System.out.println("---------------------------");
                System.out.println("1) Captura Pokemon");
                System.out.println("2) Porcentaje Capturas");
                System.out.println("3) Busca Pokemon por ID");
                System.out.println("4) Busca Pokemon por Nombre");
                System.out.println("5) Listado Pokemon");

                System.out.print("Elije tu ópcion:");
                opcion = reader.nextInt();

                switch (opcion){
                    case 1:{
                        int id;
                        id = reader.nextInt();
                        pq.buscaPokemon(id);
                    }break;

                    case 2:{
                        System.out.println(pq.porcentajeCapturas());
                    }break;

                    case 5:{

                    }break;
                }
            }

    }
}