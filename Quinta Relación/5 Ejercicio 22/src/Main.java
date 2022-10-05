import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        int i,n;
        boolean primo;

        for(n = 2; n <= 100;n++){
            primo = true;
            for(i = 2; i < n;i++){

                if(n % i == 0){
                    primo = false;
                }
            }
            if(primo)
                System.out.print(n + " ");
            }
        }

    }
