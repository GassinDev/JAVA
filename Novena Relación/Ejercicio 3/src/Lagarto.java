public class Lagarto extends Animal {

    //CONSTRUCTOR
    public Lagarto(Sexo s, String e){
        super(s,e);
    }

    //METODOS
    public void ponerHuevos(){
        System.out.println("Pone huevos");
    }

    public void tragarseAUnaPresa(){
        System.out.println("Engulle a su presa");
    }

    public void trepar(){
        System.out.println("Se sube al arbol");
    }
}
