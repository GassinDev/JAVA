public class Main {
    public static void main(String[] args) {

        int suma = 0;
        for(int i = 0;i < 3;i++){
            int n = (int)(Math.random()*6);
            System.out.println(n);
            suma += n;
        }
        System.out.println("");
        System.out.println("La suma es " + suma);
    }
}