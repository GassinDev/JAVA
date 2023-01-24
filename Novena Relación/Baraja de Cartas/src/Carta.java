public class Carta {



    //ATRIBUTOS
    int numero;
    int palo;

    //CONSTRUCTORES
    public Carta(int numero,int palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Carta(int id) {
        this.palo = id/10;
        this.numero = id%10;
    }

    //METODOS
    public int getNumero() {
        return this.numero;
    }

    public int getPalo() {
        return this.palo;
    }

    public int nombreNumero(){
        String[] nombre = {"as","dos","tres","cuatro","cinco","seis"};
    }

}
