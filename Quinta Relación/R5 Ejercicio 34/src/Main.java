import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        long n1,n2,n3,n4,vol= 0, vol2, vol3 = 0, vol4;
        System.out.println("Dime un número");
        n1 = reader.nextLong();

        n2 = n1;
        n2 = n2 * 10 +1;

        while (n2 > 0) {
            vol = (vol * 10) + (n2 % 10);
            n2 /= 10;
        }
        vol2 = vol;

        System.out.println("Dime otro número");
        n3 = reader.nextLong();

        n4 = n3;
        n4 = n4 * 10 +1;

        while (n4 > 0) {
            vol3 = (vol3 * 10) + (n4 % 10);
            n4 /= 10;
        }

        vol4 = vol3;

        System.out.print("El número formado por los dígitos pares es ");
        while(vol != 1 || vol3 != 1){
            if ((vol % 10) % 2 == 0){
                System.out.print(vol % 10);
            }
            if ((vol3 % 10) % 2 == 0){
                System.out.print(vol3 % 10);
            }
            vol = vol / 10;
            vol3 = vol3 / 10;
        }
        System.out.println("");

        System.out.print("El número formado por los dígitos impares es ");
        while(vol2 != 1 || vol4 != 1){
            if ((vol2 % 10) % 2 != 0){
                System.out.print(vol2 % 10);
            }

            if ((vol4 % 10) % 2 != 0){
                System.out.print(vol4 % 10);
            }
            vol4 = vol4 / 10;
            vol2 = vol2 / 10;
        }
    }
}