public class Main {
    public static void main(String[] args) {

        Canario pepe = new Canario(Animal.Sexo.Macho,"3");
        System.out.println(pepe);
        pepe.cantar();
        pepe.volar();
        pepe.lavarse();
    }
}