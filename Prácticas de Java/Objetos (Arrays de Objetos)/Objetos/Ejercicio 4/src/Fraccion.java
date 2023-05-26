public class Fraccion {

    //ATRIBUTOS
    int numerador;
    int denominador;

    //CONSTRUCTORES
    public Fraccion(){
        this.numerador = 0;
        this.denominador = 1;
    }

    public  Fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //METODOS
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void invierte(){

        int a = numerador, b = denominador;
        numerador = b;
        denominador = a;
    };
    public void simplificar(){

        int n = MCD();

        numerador /= n;
        denominador /= n;
    }

    public Fraccion multiplicar(Fraccion f){

        Fraccion f2 = new Fraccion();

        f2.numerador = this.numerador * f.numerador;
        f2.denominador = this.denominador * f.denominador;

        return f2;
    }

    public Fraccion dividir(Fraccion f){

        Fraccion f2 = new Fraccion();

        f2.numerador = this.numerador * f.denominador;
        f2.denominador = this.denominador * f.numerador;

        return f2;
    }

    public Fraccion sumar(Fraccion f){

        Fraccion f2 = new Fraccion();

        f2.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        f2.denominador = this.denominador * f.denominador;

        return f2;
    }

    public Fraccion restar(Fraccion f){

        Fraccion f2 = new Fraccion();

        f2.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        f2.denominador = this.denominador * f.denominador;

        return f2;
    }

    public int MCD() {

        int a = Math.abs(numerador);
        int b = Math.abs(denominador);

        if (a == 0) {
            return a;
        }

        int c;

        while (a != 0) {
            c = b % a;
            b = a;
            a = c;
        }
        return b;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}
