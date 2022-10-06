import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int h1,h2,totalHoras;
        String dia1,dia2;

        System.out.println("Por favor, introduzca la primera hora.");
        h1 = reader.nextInt();
        System.out.println("Dime el día");
        dia1 = reader.next();
        System.out.println("Por favor, introduzca la segunda hora.");
        h2 = reader.nextInt();
        System.out.println("Dime el segundo día");
        dia2 = reader.next();

        switch (dia1.toLowerCase()){

            case "lunes","1":{
                switch (dia2.toLowerCase()){

                    case "lunes","1":{
                        totalHoras = h2 - h1;
                        System.out.println(totalHoras);
                    }break;

                    case "martes","2":{
                        totalHoras = 24 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "miércoles","3":{
                        totalHoras = 24*2 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "jueves","4":{
                        totalHoras = 24*3 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "viernes","5":{
                        totalHoras = 24*4 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "sabado","6":{
                        totalHoras = 24*5 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "domingo","7":{
                        totalHoras = 24*6 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;
                }
            }break;

            case "martes","2":{
                switch (dia2.toLowerCase()){

                    case "martes","2":{
                        totalHoras = h2 - h1;
                        System.out.println(totalHoras);
                    }break;

                    case "miércoles","3":{
                        totalHoras = 24 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "jueves","4":{
                        totalHoras = 24*2 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "viernes","5":{
                        totalHoras = 24*3 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "sabado","6":{
                        totalHoras = 24*4 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "domingo","7":{
                        totalHoras = 24*5 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;
                }
            }break;

            case "miércoles","3":{
                switch (dia2.toLowerCase()){
                    case "miércoles","3":{
                        totalHoras = h2 - h1;
                        System.out.println(totalHoras);
                    }break;

                    case "jueves","4":{
                        totalHoras = 24 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "viernes","5":{
                        totalHoras = 24*2 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "sabado","6":{
                        totalHoras = 24*3 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "domingo","7":{
                        totalHoras = 24*4 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;
                }
            }break;

            case "jueves","4":{
                switch (dia2.toLowerCase()){
                    case "jueves","4":{
                        totalHoras = h2 - h1;
                        System.out.println(totalHoras);
                    }break;

                    case "viernes","5":{
                        totalHoras = 24 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "sabado","6":{
                        totalHoras = 24*2 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "domingo","7":{
                        totalHoras = 24*3 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;
                }
            }break;

            case "viernes","5":{
                switch (dia2.toLowerCase()){
                    case "viernes","5":{
                        totalHoras = h2 - h1;
                        System.out.println(totalHoras);
                    }break;

                    case "sabado","6":{
                        totalHoras = 24 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;

                    case "domingo","7":{
                        totalHoras = 24*2 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;
                }
            }break;

            case "sabado","6":{
                switch (dia2.toLowerCase()){
                    case "sabado","6":{
                        totalHoras = h2 - h1;
                        System.out.println(totalHoras);
                    }break;

                    case "domingo","7":{
                        totalHoras = 24 - h1 + h2;
                        System.out.println(totalHoras);
                    }break;
                }
            }break;

            case "domingo","7":{
                switch (dia2.toLowerCase()){
                    case "domingo","7":{
                        totalHoras = h2 - h1;
                        System.out.println(totalHoras);
                    }break;
                }
            }break;
        }
    }
}