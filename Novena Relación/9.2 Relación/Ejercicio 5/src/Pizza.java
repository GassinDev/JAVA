public class Pizza {


    //ATRIBUTOS
    String tipo;
    String tamaño;
    String estado;

    static int nservidas = 0;
    static int npedidas = 0;

    //CONSTRUCTOR
    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
        npedidas++;
    }

    //METODOS
    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void sirve(){

        if(estado == "servida"){
            System.out.println("Esta pizza ya ha sido servida");
        }else{
            this.estado = "servida";
            nservidas++;
        }

    }

    public static int getTotalPedidas(){
        return npedidas;
    }

    public static int getTotalServidas(){
        return nservidas;
    }
    //METODO TOSTRING

    @Override
    public String toString() {

        return "pizza " + this.tipo + " " + this.tamaño + ", " + this.estado;
    }
}
