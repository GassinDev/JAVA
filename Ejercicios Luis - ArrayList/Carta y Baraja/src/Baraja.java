import java.util.ArrayList;
import java.util.List;

public class Baraja{

    //ATRIBUTOS
    private ArrayList<Carta> arrayListCartas = new ArrayList<>();

    //CONSTRUCTORES
    public Baraja() { }

    public Baraja(int tipobaraja) throws Exception{

        if(tipobaraja == 1){
            for (int i = 1; i <= 40; i++)
            {
                Carta c = new Carta(i);
                this.arrayListCartas.add(c);
            }
        } else if (tipobaraja == 2) {
            for(int i = 1; i <= 80;i++){
                arrayListCartas.add(new Carta(i));
            }
            for(int i = 41; i <= 80;i++){
                arrayListCartas.add(new Carta(i));
            }
        }else {
            throw new Exception("No existe una opción " + tipobaraja + "de  baraja");
        }
    }

    public Baraja(int tipobaraja, boolean barajar) throws Exception {

        if(tipobaraja == 1){
            for(int i = 1; i <= 40;i++){
                arrayListCartas.add(new Carta(i));
            }
        } else if (tipobaraja == 2) {
            for(int i = 0; i < 40;i++){
                arrayListCartas.add(new Carta(i));
            }
            for(int i = 40; i < 80;i++){
                arrayListCartas.add(new Carta(i));
            }
        }else {
            throw new Exception("No existe una opción " + tipobaraja + "de  baraja");
        }
        if (barajar)
        {
            Barajar();
        }
    }

    //METODOS

    //NO BARAJA NOSE PQ
    public void Barajar(){

        List<Carta> l2 = new ArrayList<>();
        int pos;

        while (arrayListCartas.size() > 0)
        {
            pos = (int) (Math.random()*41) + 1;
            l2.add(arrayListCartas.get(pos));
            arrayListCartas.remove(pos);
        }
        arrayListCartas.addAll(l2);
    }

    public Carta Robar() throws Exception {
        if (arrayListCartas.size() > 0)
        {
            Carta c = arrayListCartas.get(0);
            arrayListCartas.remove(0);
            return c;
        }
        else
        {
            throw new Exception("No quedan cartas");
        }
    }

    public void Cortar(int numero) throws Exception {
        if (numero < 1 || numero > arrayListCartas.size() - 1)
        {
            for (int i = 0; i < numero; i++)
            {
                arrayListCartas.add(arrayListCartas.get(0));
                arrayListCartas.remove(0);
            }
        }
        else
        {
            throw new Exception("Hay que cortar al menos una carta o dejar al menos una carta");
        }
    }

    public void insertaCartasAlPrincipio(Carta c)
    {
        arrayListCartas.add(0, c);
    }

    /// <summary>
    /// Inserta una carta al principio de la baraja
    /// </summary>
    /// <param name="id">El id es el número identificativo de la carta que le pasaremos a la función</param>

    public void insertaCartaAlPrincipio(int id) throws Exception {
        arrayListCartas.add(0, new Carta(id));
    }

    public void insertaCartaAlFinal(Carta c)
    {
        arrayListCartas.add(c);
    }

    public void insertaCartasAlFinal(int id) throws Exception {
        arrayListCartas.add(new Carta(id));
    }

    public int NumeroCarta()
    {
        return arrayListCartas.size();
    }

    public boolean Vacia() {
        return (arrayListCartas.size() == 0);
    }

    @Override
    public String toString() {
        return arrayListCartas + "\n";
    }
}
