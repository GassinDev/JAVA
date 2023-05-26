public class Moneda {

    //ATRIBUTOS
    String[] lado = {"cara","cruz"};
    String[] tipo = {"1 céntimo","2 céntimos","5 céntimos","10 céntimos","20 céntimos","50 céntimos","1 euro","2 euro"};
    String l;
    String t;

    //CONSTRUCTORES

    public Moneda() {
        this.l = lado[(int)(Math.random()*2)];
        this.t = tipo[(int)(Math.random()*8)];
    }

    //METODOS

    public String getL() {
        return l;
    }

    public String getT() {
        return t;
    }

    //TOSTRING

    @Override
    public String toString() {
        return t + " - " + l;
    }
}
