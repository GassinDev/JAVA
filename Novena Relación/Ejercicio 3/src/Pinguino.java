public class Pinguino extends Ave {

    //CONSTRUCTOR
    public Pinguino (Sexo s, String e){
        super(s,e);
    }

    //METODOS
    public void calentarALasCrias(){
        System.out.println("Se pone encima de las crias");
    }

    public void deslizarse(){
        System.out.println("Se pone de panza y se desliza");
    }

    public void andarASaltos(){
        System.out.println("Comienza a pegar saltitos");
    }

}
