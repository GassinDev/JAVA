import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int nescalones,hescalones;

        String d = "****";

        System.out.print("Dime el número de escalones");
        nescalones = reader.nextInt();
        System.out.println();
        System.out.print("Dime la altura de los escalones");
        hescalones = reader.nextInt();



                for(int x = 0; x < nescalones;x++){

                    for(int i = 0; i < hescalones;i++){

                        for(int m = 0; m < x;m++){
                            System.out.print(d);
                        }
                        System.out.println();
                    }

                }
    }



}
