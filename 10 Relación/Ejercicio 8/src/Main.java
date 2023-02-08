import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cartas> Baraja = new ArrayList<>();

        Cartas a = new Cartas();
        Baraja.add(a);

        for(int i = 0; i < 9;i++){

            while(Baraja.contains(a)){
                a = new Cartas();
            }

            Baraja.add(a);
        }

        for(Cartas c:Baraja){
            System.out.println(c);
        }
    }
}