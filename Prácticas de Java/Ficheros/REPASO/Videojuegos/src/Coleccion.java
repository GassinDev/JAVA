import java.util.ArrayList;
import java.util.List;

public class Coleccion {

    //ATRIBUTOS
    ArrayList<Videojuegos> lista;

    //CONSTRUCTOR
    public Coleccion() {
        lista = new ArrayList<>();
    }

    //METODOS

    public void insertaVideojuegos(Videojuegos v){

        lista.add(v);
        System.out.println("Juego añadido.");
    }

    public void eliminaVideojuego(int posicion){
        lista.remove(posicion);
    }

    public Videojuegos getVideojuego(int posicion){

        return lista.get(posicion);
    }

    @Override
    public String toString() {
        return "" + lista;
    }


}
