import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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
                System.out.println("6) Listado Pokemon Capturados");
                System.out.println("7) Listado Pokemon Tipo");
                System.out.println("8) Listado Pokemon Tipo y Capturados");

                System.out.print("Elije tu ópcion:");
                opcion = reader.nextInt();

                switch (opcion){
                    case 1:{
                        pq.capturaPokemon();
                        pq.guardaCSV("ficheroPokemons.csv");
                    }break;

                    case 2:{
                        System.out.println(pq.porcentajeCapturas());
                    }break;

                    case 3:{
                        int id;
                        System.out.print("Dime el id del Pokemon:");
                        id = reader.nextInt();
                        System.out.println(pq.buscaPokemonId(id));
                    }break;

                    case 4:{
                        String nombre;
                        System.out.print("Dime el id del Pokemon:");
                        reader.nextLine();
                        nombre = reader.nextLine();
                        System.out.println(pq.buscaPokemonNombre(nombre));
                    }break;

                    case 5:{
                        System.out.println(pq.listadoPokemon());
                    }break;

                    case 6:{
                        System.out.println(pq.listadoPokemonCapturados());
                    }break;

                    case 7:{
                        System.out.println(pq.listadoPokemonTipo());
                    }break;

                    case 8:{
                        System.out.println(pq.listadoPokemonTipoCapturado());
                    }break;
                }
            }

    }
}