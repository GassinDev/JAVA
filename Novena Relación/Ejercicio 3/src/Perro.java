public class Perro extends Mamifero {

    //CONSTRUCTOR
    public Perro(Sexo s,String e){
        super(s,e);
    }

    //METODOS
    public void ladrar(){
        System.out.println("Gua Gua Gua");
    }

    public void cojerLaPelota(){
        System.out.println("Corre a cojer la pelota");
    }

    public void sentarse() {
        System.out.println("Se sienta");
    }
}
