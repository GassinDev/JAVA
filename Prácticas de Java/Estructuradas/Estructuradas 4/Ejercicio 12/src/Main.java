import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Aqui tienes un pequeño test de las clases de solo 5 preguntas");
        System.out.println("");

        String respuesta;
        int puntos = 0;

        System.out.println("1º ¿ Si te llevan de viaje que tienes que hacer por las noches ?");
        System.out.println("a) Acostarte para estudiar al dia siguiente bien \nb) Salir de fiesta y partir la noche en dos \nc) Quedarte en la habitación tranquilito hasta tarde");
        respuesta = reader.next();

        if(respuesta.equals("b")){
            puntos++;
            System.out.println("Perfecto, estaba más que claro jajajaja");
        }else{
            System.out.println("Mal, te falta calle");
        }

        System.out.println("2º ¿ Cuál es la bebida que más le gusta a Fernando ?");
        System.out.println("a) Cocacola \nb) Nestea \nc) Gatorade");
        respuesta = reader.next();

        if(respuesta.equals("a")){
            puntos++;
            System.out.println("Perfecto, estaba más que claro jajajaja");
        }else{
            System.out.println("Mal, te falta calle");
        }

        System.out.println("3º ¿ Qué usamos para hacer varios casos diferentes en un ejercicio en JAVA ?");
        System.out.println("a) Switch \nb) For \nc) Spring");
        respuesta = reader.next();

        if(respuesta.equals("a")){
            puntos++;
            System.out.println("Perfecto, estaba más que claro jajajaja");
        }else{
            System.out.println("Mal, te falta calle");
        }

        System.out.println("4º ¿ Si haz hecho todas las tareas adelantadas que se hace en clase ?");
            System.out.println("a) Te pones a escuchar música \nb) Te pones a estudiar \nc) Se juega al server");
        respuesta = reader.next();

        if(respuesta.equals("c")){
            puntos++;
            System.out.println("Perfecto, estaba más que claro jajajaja");
        }else{
            System.out.println("Mal, te falta calle");
        }

        System.out.println("5º ¿ Qué no se te puede olvida en un switch ?");
        System.out.println("a) El default al final \nb) El if final \nc) Un for al final con break");
        respuesta = reader.next();

        if(respuesta.equals("a")){
            puntos++;
            System.out.println("Perfecto, estaba más que claro jajajaja");
        }else{
            System.out.println("Mal, te falta calle");
        }

        System.out.println("Has sacado " + puntos + " puntos.");
    }
}