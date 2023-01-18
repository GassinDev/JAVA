public class Main {
    public static void main(String[] args) {

        Canario pepe = new Canario(Animal.Sexo.Macho,"3");
        pepe.cantar();
        pepe.volar();
        pepe.lavarse();

        System.out.println();

        Gato kiko = new Gato(Animal.Sexo.Hembra,"5");
        kiko.cazar("ratón");
        kiko.cazar("mosca");
        kiko.ronronea();

    }
}