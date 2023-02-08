import java.util.Objects;

public class Cartas {

    //ATRIBUTOS
    String[] numero = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
    String[] palo = {"Bastos","Copas","Oros","Espadas"};
    String n;
    String p;

    //CONSTRUCTORES
    public Cartas() {
        this.n = numero[(int)(Math.random()*10)];
        this.p = palo[(int)(Math.random()*4)];

    }

    //METODOS

    public String getN() {
        return n;
    }

    public String getP() {
        return p;
    }

    //TOSTRING


    @Override
    public String toString() {
        return n + " de " + p;
    }


}
