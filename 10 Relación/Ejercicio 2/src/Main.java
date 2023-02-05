import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int tamaarrayr = (int) (Math.random() * 11) + 10;

        ArrayList <Integer> numeros = new ArrayList<>(tamaarrayr);

        for(int i = 0; i < tamaarrayr; i++){
            int nr = (int)(Math.random()*101);
            numeros.add(nr);
        }

        for(Integer n:numeros){
            System.out.println(n);
        }
        System.out.println("");
        System.out.println("Suma: " + Suma(numeros));
        System.out.println("Max: " + Max(numeros));
        System.out.println("Min: " + Min(numeros));
        System.out.println("Media: " + Media(numeros,tamaarrayr));
    }

    public static int Suma(ArrayList <Integer> a){

        int sum = 0;

        for(Integer n: a){
            sum += n;
        }

        return sum;
    }

    public static int Max(ArrayList <Integer> a){
        int max = 0;

        for(Integer n: a){
            if(n > max){
                max = n;
            }
        }

        return max;
    }

    public static int Min(ArrayList <Integer> a){
        int min = 100;

        for(Integer n: a){
            if(n < min){
                min = n;
            }
        }

        return min;
    }

    public static int Media(ArrayList <Integer> a,int tamanoarray){
        int medi = 0;

        medi = Suma(a) / tamanoarray;

        return medi;
    }
}