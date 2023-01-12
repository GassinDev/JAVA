public class Animal {

    public enum Sexo{
        Macho,Hembra
    }
    //ATRIBUTOS
    private Sexo sexo;
    private String edad;

    //CONSTRUCTOR
    public Animal(Sexo sexo, String e) {
        this.edad = e;
        this.sexo = Sexo.Macho;
    }

    //METODOS
    public String getEdad() {
        return edad;
    }
    public Sexo getSexo() {
        return this.sexo;
    }
    public void cazar(){
        System.out.println("Zaaasss Fiugh");
    }
    public void dormir(){
        System.out.println("ZZZZzzzzz");
    }
    public void reproduccion(){
        System.out.println("Pom Pom Pom Pam Pam Pam");
    }

}
