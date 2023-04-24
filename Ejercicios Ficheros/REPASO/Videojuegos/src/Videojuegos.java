import java.util.Objects;

public class Videojuegos {

    //ATRIBUTOS
    String nombre;
    int anno;
    Plataforma plataforma;
    TipoJuego tipojuego;
    int valoracion;

    //CONSTRUCTOR

    public Videojuegos(String nombre, int anno, Plataforma plataforma, TipoJuego tipojuego, int valoracion) {

        this.nombre = nombre;
        this.anno = anno;
        this.plataforma = plataforma;
        this.tipojuego = tipojuego;
        this.valoracion = valoracion;
    }

    //METODOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if(!Objects.equals(nombre, "")){
            this.nombre = nombre;
        }else {
            System.out.println("No puede estar vacío el nombre");
        }
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        if(anno >= 1970 && anno <= 2100){
            this.anno = anno;
        }else {
            System.out.println("El año de salido del juego tiene que estar comprendido entre 1970 y 2100");
        }
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public TipoJuego getTipojuego() {
        return tipojuego;
    }

    public void setTipojuego(TipoJuego tipojuego) {
        this.tipojuego = tipojuego;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        if(valoracion >= 0 && valoracion <= 100){
            this.valoracion = valoracion;
        }else {
            System.out.println("El valor de la valoración debe estar comprendido entre 0 y 100");
        }
    }

    @Override
    public String toString() {
        return nombre + "\t" + anno + "\t" + plataforma + "\t" + tipojuego + "\t" + valoracion + "\n";
    }
}
