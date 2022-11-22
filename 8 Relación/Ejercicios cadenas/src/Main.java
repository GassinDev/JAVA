import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int opcion;
        System.out.println("┌──────────────────────┐");
        System.out.println("│ Menú Cadenas         │");
        System.out.println("├──────────────────────┤");
        System.out.println("│ 1- NumeroEspacios    │");
        System.out.println("│ 2- NumeroVocales     │");
        System.out.println("│ 3- EsPalindromo      │");
        System.out.println("│ 4- Contiene          │");
        System.out.println("│ 5- RepiteCaracter    │");
        System.out.println("│ 6- QuitaEspacios     │");
        System.out.println("│ 7- QuitaEspaciosTrim │");
        System.out.println("│ 8- SustituyeCaracter │");
        System.out.println("│ 9- CuentaPalabras    │");
        System.out.println("│ 10- EsNumero         │");
        System.out.println("└──────────────────────┘");

        System.out.println();
        System.out.println("Dime que ejercicio quieres");
        opcion = reader.nextInt();

        switch (opcion)
        {
            case 1: {

                String s;
                System.out.println("Dime la frase");
                s = reader.next();
                System.out.println(numeroEspacios(s));

            }break;

            case 2:{

            }break;
        }


    }

    public static String numeroEspacios(String s){

        int cont = 0;

        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == ' '){
                cont++;
            }
        }
        return "En total hay " + cont + " espacios.";
    }

}