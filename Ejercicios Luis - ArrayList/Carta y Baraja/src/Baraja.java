import java.util.ArrayList;

public class Baraja{

    //ATRIBUTOS
    ArrayList<Carta> arrayListCartas = new ArrayList<>();

    //CONSTRUCTORES
    public Baraja() { }

    public Baraja(int tipobaraja) throws Exception{

        if(tipobaraja == 1){
            for(int i = 0; i < 40;i++){
                arrayListCartas.add(new Carta(i));
            }
        } else if (tipobaraja == 2) {
            for(int i = 0; i < 40;i++){
                arrayListCartas.add(new Carta(i));
            }
            for(int i = 41; i < 80;i++){
                arrayListCartas.add(new Carta(i));
            }
        }else {
            throw new Exception("No existe una opción " + tipobaraja + "de  baraja");
        }
    }

    public Baraja(int tipobaraja, boolean barajar) throws Exception {

        if(tipobaraja == 1){
            for(int i = 0; i < 40;i++){
                arrayListCartas.add(new Carta(i));
            }
        } else if (tipobaraja == 2) {
            for(int i = 0; i < 40;i++){
                arrayListCartas.add(new Carta(i));
            }
            for(int i = 41; i < 80;i++){
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



}
