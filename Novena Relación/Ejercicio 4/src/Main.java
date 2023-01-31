public class Main {
    public static void main(String[] args) {

        Fraccion i = new Fraccion(3,4);
        Fraccion a = new Fraccion(2,10);
        Fraccion b = new Fraccion(-3,5);
        Fraccion c = new Fraccion(-2,3);

        i.invierte();
        System.out.println("Invertida: " + i);

        a.simplificar();
        System.out.println("Simplificación: " + a);

        Fraccion d = b.multiplicar(c);
        System.out.println("Multiplicación: " + d);

        Fraccion e = b.dividir(c);
        System.out.println("División: " + e);

        Fraccion r = a.sumar(b);
        System.out.println("Suma: " + r);

        Fraccion t = a.restar(b);
        System.out.println("Suma: " + t);


    }
}