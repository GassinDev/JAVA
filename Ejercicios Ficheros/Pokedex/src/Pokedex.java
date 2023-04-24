import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Pokedex {

    Scanner reader = new Scanner(System.in);
    //ATRIBUTOS
    ArrayList<Pokemon> listaPokemon;

    //CONSTRUCTOR

    public Pokedex(){
        listaPokemon = new ArrayList<>();
        leeCSV("ficheroPokemons.csv");
    }

    //METODOS
    public void leeCSV(String nombreFichero){

        try{
            BufferedReader br = new BufferedReader(new FileReader(nombreFichero));

            String line = "";

            while(line != null){

                line = br.readLine();

                if(line != null) {
                    String[] p = line.split(",");

                    int id = Integer.parseInt(p[0]);
                    String nombre = p[1];
                    String tipo1 = p[2];
                    int vida = Integer.parseInt(p[3]);
                    int ataque = Integer.parseInt(p[4]);
                    int ataqueEspecial = Integer.parseInt(p[5]);
                    int defensa = Integer.parseInt(p[6]);
                    int defensaEspecial = Integer.parseInt(p[7]);
                    int velocidad = Integer.parseInt(p[8]);
                    String habilidad = p[9];
                    boolean capturado;

                    if (Objects.equals(p[10], "false")) {
                        capturado = false;
                    } else {
                        capturado = true;
                    }

                    listaPokemon.add(new Pokemon(id, nombre, tipo1, ataque, defensa, vida, ataqueEspecial, defensaEspecial, velocidad,habilidad, capturado));
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("error!!" + e.getMessage());
        }
    }

    public void guardaCSV(String nombreFichero) {
        try {
            FileWriter fw = new FileWriter(nombreFichero);

            for(Pokemon p: listaPokemon){
                fw.write(p.getId() + "," + p.getNombre() + "," + p.getTipo1() + "," + p.getAtaque() + "," + p.getDefensa()+ "," + p.getVida() + "," + p.getAtaqueespecial()+ "," + p.getDefensaespecial() + "," + p.getVelocidad() + "," + p.getHabilidad() + ","+ p.getCapturado() + "\n");
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("error!!" + e.getMessage());
        }

    }

    public void capturaPokemon(){
        String nombrePokemon;

        System.out.println("Dime el nombre del Pokemon que has capturado");
        nombrePokemon = reader.nextLine();

        for(Pokemon p: listaPokemon){
            if(Objects.equals(p.nombre, nombrePokemon)){
                p.capturado = true;
            }
        }
    }

    public double porcentajeCapturas(){
        double totalCapturados = 0;
        double porcentaje;
        double totalPokemons = listaPokemon.size();
        for(Pokemon p: listaPokemon){
            if(p.capturado){
                totalCapturados++;
            }
        }

        porcentaje = ((totalCapturados/totalPokemons))*100;

        return porcentaje;
    }

    public Pokemon buscaPokemonId(int id) {

        Pokemon poke = null;

        for (Pokemon p : listaPokemon) {
            if (id == p.id) {
                poke = p;
            }
        }
        return poke;
    }

    public Pokemon buscaPokemonNombre(String nombrePoke) {

        Pokemon poke = null;

        for (Pokemon p : listaPokemon) {
            if (Objects.equals(nombrePoke, p.nombre)) {
                poke = p;
            }
        }
        return poke;
    }

    public String listadoPokemon(){

        String s = "";

        for(Pokemon p : listaPokemon){
            s += p.toString() + "\n";
        }
        return s;
    }

    public String listadoPokemonCapturados(){

        String s = "";

        for(Pokemon p : listaPokemon){

            if(p.getCapturado()){
                s += p.toStringSimple() + "\n";
            }
        }
        return s;
    }

    public String listadoPokemonTipo(){

        String s = "";
        String tipo;

        System.out.println("Dime el tipo");
        tipo = reader.nextLine();

        for(Pokemon p : listaPokemon){

            if(Objects.equals(tipo, p.tipo1)){
                s += p.toStringSimple2() + "\n";
            }
        }
        return s;
    }

    public String listadoPokemonTipoCapturado(){

        String s = "";
        String tipo;

        System.out.println("Dime el tipo");
        tipo = reader.nextLine();

        for(Pokemon p : listaPokemon){

            if(Objects.equals(tipo, p.tipo1) && p.getCapturado()){
                s += p.toStringSimple3() + "\n";
            }
        }
        return s;
    }

}
