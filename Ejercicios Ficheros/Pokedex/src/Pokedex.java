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

                    System.out.println(line);
                    String[] p = line.split(",");

                    int id = Integer.parseInt(p[0]);
                    String nombre = p[1];
                    String tipo1 = p[2];
                    String tipo2 = p[3];
                    int vida = Integer.parseInt(p[4]);
                    int ataque = Integer.parseInt(p[5]);
                    int ataqueEspecial = Integer.parseInt(p[6]);
                    int defensa = Integer.parseInt(p[7]);
                    int defensaEspecial = Integer.parseInt(p[8]);
                    int velocidad = Integer.parseInt(p[9]);
                    boolean capturado;

                    if (Objects.equals(p[10], "false")) {
                        capturado = false;
                    } else {
                        capturado = true;
                    }

                    listaPokemon.add(new Pokemon(id, nombre, tipo1, tipo2, ataque, defensa, vida, ataqueEspecial, defensaEspecial, velocidad, capturado));
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
            PrintWriter pw = new PrintWriter(nombreFichero);

            for(Pokemon p: listaPokemon){
                pw.println(p.getId() + p.getNombre() + p.getAtaque() + p.getDefensa() + p.getVida() + p.getAtaqueespecial() + p.getDefensaespecial() + p.getVelocidad() + p.getTipo1() + p.getTipo2());
            }

        } catch (IOException e) {
            System.out.println("error!!" + e.getMessage());
        }

    }

    public void capturaPokemon(){
        String nombrePokemon;

        System.out.println("Dime el nombre del personaje que has capturado");
        nombrePokemon = reader.next();

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

    public Pokemon buscaPokemon(int id) {

        Pokemon poke = null;

        for (Pokemon p : listaPokemon) {
            if (id == p.id) {
                poke = p;
            }
        }
        return poke;
    }

    public Pokemon buscaPokemon(String nombrePoke) {

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



}
