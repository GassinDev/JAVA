import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cartas> Baraja = new ArrayList<>();

        Cartas a = new Cartas();
        Baraja.add(a);

        for(int i = 0; i < 9;i++){

            Cartas b = new Cartas();

            while(Baraja.contains(b)){

                b = new Cartas();
            }

            Baraja.add(b);
        }

        for(Cartas c:Baraja){
            System.out.println(c);
        }
    }
}