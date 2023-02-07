import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList<Moneda> sucesion = new ArrayList<>();

        Moneda primera = new Moneda();
        sucesion.add(primera);

        for(int i = 0; i < 5;i++){

            Moneda siguientes = new Moneda();


            while(!Objects.equals(siguientes.getL(), primera.getL()) && !Objects.equals(siguientes.getT(), primera.getT())){
               siguientes = new Moneda();
            }

            primera = siguientes;
            sucesion.add(siguientes);

        }

        for(Moneda m:sucesion){
            System.out.println(m);
        }

    }
}