import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double n1,n2,nf;
        String recu;

        System.out.println("Dime la primera nota");
        n1 = reader.nextDouble();
        System.out.println("Dime la primera nota");
        n2 = reader.nextDouble();

        nf = (n1 + n2)/2;

        if(nf >= 5){
            System.out.println("Nota del primer control: " + n1);
            System.out.println("Nota del segundo control: " + n2);
            System.out.println("Tu nota de Programación es " + nf);
        }else{
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            recu = reader.next();

            if(recu.equals("apto")){
                System.out.println("Nota del primer control: " + n1);
                System.out.println("Nota del segundo control: " + n2);
                System.out.println("¿Cuál ha sido el resultado de la recuperación?: " + recu);
                System.out.println("Tu nota de Programación es 5");
            }else{
                System.out.println("Nota del primer control: " + n1);
                System.out.println("Nota del segundo control: " + n2);
                System.out.println("¿Cuál ha sido el resultado de la recuperación?: " + recu);
                System.out.println("Tu nota de Programación es " + nf);
            }
        }
    }
}