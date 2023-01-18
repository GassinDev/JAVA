public class Tiempo {

    //ATRIBUTOS
    int segundos;

    //CONSTRUCTOR
    public Tiempo(int horas, int minutos, int segundos) {
        this.segundos = (horas * 3600) + (minutos * 60) + segundos;
    }
    public Tiempo(int minutos,int segundos){
        this.segundos = (minutos * 60) + segundos;
    }
    public Tiempo(int segundos){
        this.segundos = segundos;
    }

    //METODOS
    public int getSegundos() {
        return segundos;
    }


    public Tiempo suma(Tiempo t){

        int segundos = t.segundos + getSegundos();
        Tiempo t2 = new Tiempo(segundos);

        return t2;
    }

    public Tiempo resta(Tiempo t){

        int segundos = t.segundos - getSegundos();
        Tiempo t2 = new Tiempo(segundos);

        return t2;
    }
    //METODOS TOSTRING

    @Override
    public String toString() {

        int horas, minutos, segundos;
        segundos = this.segundos;
        horas = (segundos / 3600);
        minutos = ((segundos - horas * 3600) / 60);
        segundos = segundos - (horas * 3600 + minutos * 60);


        return "Tiempo = " + horas + "h " + minutos + "m " + segundos + "s";
    }
}
