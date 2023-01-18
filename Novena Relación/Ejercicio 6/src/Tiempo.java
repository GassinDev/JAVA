public class Tiempo {

    //ATRIBUTOS
    int horas;
    int minutos;
    int segundos;

    //CONSTRUCTOR
    public Tiempo(int horas, int minutos, int segundos) {
        this.segundos = (horas * 3600) + (minutos * 60) + segundos;
    }

    public Tiempo(int segundos){
        this.segundos = segundos;
    }
    //METODOS


    public int getSegundos() {
        return segundos;
    }


    public Tiempo suma(Tiempo t2){

        t2.segundos += getSegundos();

        return t2;
    }
    //METODOS TOSTRING

    @Override
    public String toString() {
        return "Tiempo = " + horas + "h " + minutos + "m " + segundos + "s";
    }
}
