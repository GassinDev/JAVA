public class Main {
    public static void main(String[] args) {

        int d, d2;

        d = (int)(Math.random()* 6 + 1);
        d2 = (int)(Math.random()* 6 + 1);

        System.out.println("Dado 1: " + d + " - - - Dado 2: " + d2);
        System.out.println("");
        if(d != d2){
            while (d != d2){
                d = (int)(Math.random()* 6 + 1);
                d2 = (int)(Math.random()* 6 + 1);
                System.out.println("Dado 1: " + d + " - - - Dado 2: " + d2);
                System.out.println("");
            }
            System.out.println("Son iguales.");
        }else{
            System.out.println("Son iguales.");
        }


    }
}