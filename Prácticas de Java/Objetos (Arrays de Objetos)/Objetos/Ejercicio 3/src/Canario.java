public class Canario extends Ave{


    //CONSTRUCTOR
    public Canario(Sexo s,String e) {
        super(s,e);
    }

    //METODOS
    public void cantar(){
        System.out.println("Pipipi pipipi piuuuuu");
    }

    public void volar(){
        System.out.println("Comienza a volar");
    }

    public void lavarse(){
        System.out.println("Se comienza a lavar en su aguita");
    }
}
