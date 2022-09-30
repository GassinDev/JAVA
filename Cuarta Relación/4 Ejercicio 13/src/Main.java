import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int caso = 0;
        System.out.println("¿ Cómo quieres que te ordene los números ?");
        System.out.println("1) Menor a mayor \n2) Mayor a menor");
        caso = reader.nextInt();
        int a,b,c;

        System.out.println("Dime el primer número");
        a = reader.nextInt();
        System.out.println("Dime el segundo número");
        b = reader.nextInt();
        System.out.println("Dime el tercera número");
        c = reader.nextInt();

        switch (caso){
            case 1:
                if(a < b & b < c){
                    System.out.println(a + " - " + b + " - " + c);
                }else{
                    if(a > b & b < c & a < c){
                        System.out.println(b + " - " + a + " - " + c);
                    }else{
                        if(a < b & b > c & a < c){
                            System.out.println(a + " - " + c + " - " + b);
                        }else{
                            if(a > b & b < c & a > c){
                                System.out.println(b + " - " + c + " - " + a);
                            }else{
                                if(a > b & b > c & a > c){
                                    System.out.println(c + " - " + b + " - " + a);
                                }else{
                                    System.out.println(c + " - " + a + " - " + b);
                                }
                            }
                        }
                    }
                }
            break;

            case 2:
                if(a < b & b < c){
                    System.out.println(c + " - " + b + " - " + a);
                }else{
                    if(a > b & b < c & a < c){
                        System.out.println(c + " - " + a + " - " + b);
                    }else{
                        if(a < b & b > c & a < c){
                            System.out.println(b+ " - " + c + " - " + a);
                        }else{
                            if(a > b & b < c & a > c){
                                System.out.println(a + " - " + c + " - " + b);
                            }else{
                                if(a > b & b > c & a > c){
                                    System.out.println(a + " - " + b + " - " + c);
                                }else{
                                    System.out.println(b + " - " + a + " - " + c);
                                }
                            }
                        }
                    }
                }
            break;
        }
    }
}