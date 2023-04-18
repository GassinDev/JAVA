
public class Pokemon {

    //ATRIBUTOS
    int id,ataque,defensa,vida,ataqueespecial,defensaespecial,velocidad;
    String nombre,tipo1,tipo2;
    boolean capturado;

    //CONSTRUCTOR

    public Pokemon(int id, String nombre, String tipo1,String tipo2, int ataque, int defensa, int vida, int ataqueespecial, int defensaespecial, int velocidad, boolean capturado) {
        this.id = id;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.ataqueespecial = ataqueespecial;
        this.defensaespecial = defensaespecial;
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.capturado = capturado;
    }

    //PROPIEDADES

    public int getId() {
        return id;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaqueespecial() {
        return ataqueespecial;
    }

    public int getDefensaespecial() {
        return defensaespecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo1() {
        return tipo1;
    }
    public String getTipo2() {
        return tipo2;
    }

    public boolean getCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    //METODOS

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", ataque=" + ataque + ", defensa=" + defensa + ", vida=" + vida + ", ataqueespecial=" + ataqueespecial + ", defensaespecial=" + defensaespecial + ", velocidad=" + velocidad + ", nombre=" + nombre + ", tipo1=" + tipo1 + ", tipo2=" + tipo2 + ", capturado=" + capturado + '}';
    }


}
