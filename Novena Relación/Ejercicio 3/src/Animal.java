public class Animal {

    //ATRIBUTOS
    private String raza;
    private String edad;
    private String sexo;

    //CONSTRUCTOR
    public Animal(String r, String e, String s) {
        this.raza = r;
        this.edad = e;
        this.sexo = s;
    }

    //METODOS
    public String getRaza(){
        return raza;
    }
    public String getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
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
