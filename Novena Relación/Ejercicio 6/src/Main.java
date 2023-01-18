public class Main {
    public static void main(String[] args) {

        Tiempo t1 = new Tiempo(1, 50, 310);
        Tiempo t2 = new Tiempo(0, 30, 140);
        Tiempo t3 = new Tiempo(0, 35, 20);
        System.out.println(t1);
        System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
        System.out.println(t1 + " - " + t3 + " = " + t3.resta(t1));
    }
}