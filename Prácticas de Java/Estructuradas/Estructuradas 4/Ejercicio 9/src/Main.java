import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double a,b,c,x1,x2;

        System.out.println("Este programa realiza una ecuación de segundo grado de tipo (ax^2 + bx + c = 0)");
        System.out.println("Dime la variable a");
        a = reader.nextDouble();
        System.out.println("Dime la variable b");
        b = reader.nextDouble();
        System.out.println("Dime la variable c");
        c = reader.nextDouble();

        if(a == 0 & b == 0 & c == 0){
            System.out.println("Tiene infinitas soluciones");
        }else{
            if(a != 0 & b == 0 & c == 0){

            }else{
                if(a != 0 & b != 0 & c == 0){
                    System.out.println("x1 = 0");
                    System.out.println("x2 = " + (-b/a));
                }else{
                    if(a != 0 & b != 0 & c != 0){

                        double dis = b*b - (4 * a * c);

                        if(dis > 0) {
                            System.out.println("x1 = " + (-b + Math.sqrt(dis)) / (2 * a));
                            System.out.println("x2 = " + (-b - Math.sqrt(dis)) / (2 * a));
                        }else {
                            System.out.println("No tiene soluciones reales");
                        }

                    }else{
                        if(a == 0 & b != 0 & c != 0){
                            System.out.println("x1 = " + (-c/b));
                            System.out.println("x2 = " + (-c/b));
                        }else{
                                if(a == 0 & b == 0 & c != 0){
                                    System.out.println("No tiene solución");
                                }else{

                                 }
                            }
                        }
                    }
                }
            }
        }
    }
