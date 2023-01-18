public class Gato extends Mamifero{

    //CONSTRUCTOR
    public Gato(Sexo s, String e) {
        super(s, e);
    }

    //METODOS
    public void ronronea(){
        System.out.println("RRRRmmmmmm");
    }

    public void alimentarse(String comida){
        if(comida.equals("Atún") | comida.equals("Atun")){
            System.out.println("Se lo come");
        }else {
            System.out.println("Te echa la cara abajo");
        }
    }

    public void cazar(String presa){
        if(presa.equals("ratón") | presa.equals("raton")){
            System.out.println("Corre para cazarlo");
        }else{
            System.out.println("Se queda parado no vé ninguna presa que le interese");
        }
    }
}
