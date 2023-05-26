public class Mamifero extends Animal {

    //CONSTRUCTOR
    public Mamifero(Sexo s, String e) {
        super(s,e);
    }

    //METODOS
    public void darTeta(){
        if(this.getSexo() == Sexo.Hembra){
            System.out.println("Amamanta las crías");
        }else{
            System.out.println("No puede dar teta a las crías");
        }
    }

    public void parirCrias(){
        System.out.println("Ha tenido un par de crías");
    }

    public void cuidar(){
        System.out.println("Cuida de las crias");
    }
}
