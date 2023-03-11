import java.util.ArrayList;

public class Baraja{

    //ATRIBUTOS
    private ArrayList<Carta> arrayListCartas = new ArrayList<>();

    //CONSTRUCTORES
    public Baraja() { }

    public Baraja(int tipobaraja) throws Exception{

        if(tipobaraja == 1){
            for(int i = 1; i <= 40;i++){
                arrayListCartas.add(new Carta(i));
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
            for(int i = 0; i < 40;i++){
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

    public void Barajar(){

        switch (arrayListCartas.size()){

            case 40:{

                ArrayList<Carta> alc2 = new ArrayList<>();
                int pos1 = (int)(Math.random()*41);

                while ((long) arrayListCartas.size() > 0){
                    alc2.add(arrayListCartas.get(pos1));
                    arrayListCartas.remove(pos1);
                }

            }break;

            case 80:{

                ArrayList<Carta> alc2 = new ArrayList<>();
                int pos1 = (int)(Math.random()*81);

                while ((long) arrayListCartas.size() > 0){
                    alc2.add(arrayListCartas.get(pos1));
                    arrayListCartas.remove(pos1);
                }
            }break;
        }
    }

    @Override
    public String toString() {
        return arrayListCartas + "\n";
    }
}
