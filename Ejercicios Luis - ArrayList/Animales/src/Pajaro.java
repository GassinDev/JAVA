import java.util.Date;

enum EspeciePajaro
{
    Canario, Periquito, Agapornis
}

public class Pajaro extends Animal{

    //ATRIBUTOS
    protected EspeciePajaro especiePajaro;
    protected boolean cantor;

    //CONSTRUCTOR
    public Pajaro(String nombre, Date fechaNacimiento, double peso, String comentarios, EspeciePajaro especiePajaro, boolean cantor) {
        super(nombre, fechaNacimiento, peso);
        this.especiePajaro = especiePajaro;
        this.cantor = cantor;
    }

    //METODOS

    public EspeciePajaro getEspeciePajaro() {
        return especiePajaro;
    }

    public boolean isCantor() {
        return cantor;
    }

    //TOSTRING
    public String toString() {
        return "Ficha Perro" + "\n" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + "\n" +
                "Comentario: " + comentarios + "\n" +
                "Especie: " + especiePajaro + "\n" +
                "Cantor: " + cantor;
    }
}
