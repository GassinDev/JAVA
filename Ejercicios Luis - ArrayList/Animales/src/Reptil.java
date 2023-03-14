import java.util.Date;

enum EspecieReptil
{
    Tortuga, Iguana, DragonDeComodo
}

public class Reptil extends Animal{

    //ATRIBUTOS
    protected EspecieReptil especieReptil;
    protected boolean venenoso;

    //CONSTRUCTOR
    public Reptil(String nombre, Date fechaNacimiento, double peso, String comentarios, EspecieReptil especieReptil, boolean venenoso) {
        super(nombre, fechaNacimiento, peso);
        this.especieReptil = especieReptil;
        this.venenoso = venenoso;
    }

    //METODOS

    public EspecieReptil getEspecieReptil() {
        return especieReptil;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    //TOSTRING
    public String toString() {
        return "Ficha Perro" + "\n" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n" +
                "Peso: " + peso + "\n" +
                "Comentario: " + comentarios + "\n" +
                "Especie: " + especieReptil + "\n" +
                "Venenoso: " + venenoso;
    }
}
