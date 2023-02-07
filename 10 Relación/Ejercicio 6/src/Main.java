import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int intentos = 3;
        String usuario,contrasena;
        boolean registroON = false;

        HashMap<String,String> login = new HashMap<String, String>();

        login.put("Gassin","1daw@SR");
        login.put("Invitado","daw1234");

        System.out.println("AREA RESTRINGIDA - INGRESE SU CUENTA DE PERSONAL AUTORIZADO");
        System.out.println("-----------------------------------------------------------");

        while(intentos > 0 && !registroON){

            System.out.print("Usuario: ");
            usuario = reader.nextLine();
            System.out.print("Contraseña: ");
            contrasena = reader.nextLine();

            if(login.containsKey(usuario) &&  login.get(usuario).equals(contrasena)){
                System.out.println("Usuario reconocido, ingresando en el Área restringida");
                registroON = true;
            }else{
                intentos--;
                System.out.println("Usuario no reconocido repita la identificación le quedan " + intentos + " intentos");
            }
        }

    }
}