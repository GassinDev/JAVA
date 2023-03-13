import java.util.Scanner;

public class Fraccion {
    Scanner reader = new Scanner(System.in);

    //ATRIBUTOS
    private int numerador;
    private int denominador;

    //CONSTRUCTORES


    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion(double numerador)
    {
        this.denominador = 1;
        while (Math.floor(numerador) != numerador)
        {
            numerador = numerador * 10;
            denominador = denominador * 10;
        }
        this.numerador = (int)numerador;
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

    public void setDenominador(int denominador) throws Exception {
        if (denominador != 0)
        {
            this.denominador = denominador;
        }
        else
        {
            throw new Exception("No puede ser 0");
        }
    }

    //METODOS
    private int mcd(int a, int b)
    {
        while (a != b)
        {
            if (a > b)
            {
                a = a - b;
            }

            else
            {
                b = b - a;
            }
        }
        return a;
    }

    private int mcm(int a, int b)
    {
        int mcm = 0;
        mcm = (a * b) / mcd(a, b);
        return mcm;
    }

   //METODOS

    public void simplificar()
    {
        int mcd = this.mcd(numerador, denominador);
        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    public Fraccion negate(){
        Fraccion f = new Fraccion(numerador,denominador);

        numerador = numerador * -1;

        return new Fraccion(numerador,denominador);
    }

    public Fraccion add (Fraccion f){
        int n,d,resulnum,resuldem;

        System.out.print("Dime el numerador: ");
        n = reader.nextInt();
        System.out.print("Dime el denominador: ");
        d = reader.nextInt();

        Fraccion f2 = new Fraccion(n,d);

        int mcm = f.mcm(f.denominador,f2.denominador);

        if (f.denominador == f2.denominador)
        {
            resulnum = f.numerador + f2.numerador;
            resuldem = f.denominador;
        }
        else
        {
            resulnum = ((mcm / f.denominador) * f.numerador) + ((mcm / f2.denominador) *  f2.numerador);
            resuldem = mcm;
        }

        return new Fraccion(resulnum,resuldem);
    }

    public Fraccion substract (Fraccion f){
        int n,d,resulnum,resuldem;

        System.out.print("Dime el numerador: ");
        n = reader.nextInt();
        System.out.print("Dime el denominador: ");
        d = reader.nextInt();

        Fraccion f2 = new Fraccion(n,d);

        int mcm = f.mcm(f.denominador,f2.denominador);

        if (f.denominador == f2.denominador)
        {
            resulnum = f.numerador + f2.numerador;
            resuldem = f.denominador;
        }
        else
        {
            resulnum = ((mcm / f.denominador) * f.numerador) - ((mcm / f2.denominador) *  f2.numerador);
            resuldem = mcm;
        }

        return new Fraccion(resulnum,resuldem);
    }

    public Fraccion multiply (Fraccion f){
        int n,d,resulnum,resuldem;

        System.out.print("Dime el numerador: ");
        n = reader.nextInt();
        System.out.print("Dime el denominador: ");
        d = reader.nextInt();

        Fraccion f2 = new Fraccion(n,d);

        resulnum = f.numerador * f2.numerador;
        resuldem = f.denominador * f2.denominador;

        return new Fraccion(resulnum,resuldem);
    }

    public Fraccion divide (Fraccion f){
        int n,d,resulnum,resuldem;

        System.out.print("Dime el numerador: ");
        n = reader.nextInt();
        System.out.print("Dime el denominador: ");
        d = reader.nextInt();

        Fraccion f2 = new Fraccion(n,d);

        resulnum = f.numerador * f2.denominador;
        resuldem = f.denominador * f2.numerador;

        return new Fraccion(resulnum,resuldem);
    }

    public boolean equals (Fraccion f){
        int n,d;

        System.out.print("Dime el numerador: ");
        n = reader.nextInt();
        System.out.print("Dime el denominador: ");
        d = reader.nextInt();

        Fraccion f2 = new Fraccion(n,d);

        f.simplificar();
        f2.simplificar();

        if(f.denominador == f2.denominador & f.numerador == f2.numerador){
            return true;
        }else {
            return false;
        }
    }

    public int compareTo (Fraccion f) {

        int n, d,i = 0;
        double vfra1, vfra2;

        System.out.print("Dime el numerador: ");
        n = reader.nextInt();
        System.out.print("Dime el denominador: ");
        d = reader.nextInt();

        Fraccion f2 = new Fraccion(n, d);

        vfra1 = f.numerador / f.denominador;
        vfra2 = f2.numerador / f2.denominador;

        if (vfra1 < vfra2) {
            i = -1;
        } else if (vfra1 > vfra2) {
            i = 1;
        } else if (vfra1 == vfra2) {
            i = 0;
        }


        return i;
    }



   //TOSTRING
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
