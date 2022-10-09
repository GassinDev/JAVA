public class Main {
    public static void main(String[] args) {

        int suma = 0,n,nMax = 100,nMin = 199;
        double media;

        System.out.println("");
        for(int i = 0; i < 50;i++){
            n = (int)(Math.random()*100) + 100;

            if(nMax < n){
                nMax = n;
            }

            if(nMin > n){
                nMin = n;
            }

            suma += n;

            System.out.print(n + " ");
        }

        media = (double)suma / 50;

        System.out.println("");
        System.out.println("");
        System.out.println("La media es " + media);
        System.out.println("El número más grande es " + nMax);
        System.out.println("El número más pequeño es " + nMin);
    }
}