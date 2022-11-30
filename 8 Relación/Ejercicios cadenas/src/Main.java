import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int opcion;
        System.out.println("┌───────────────────────────────────────────────────┐└┘─┬┴┤┤├ ");
        System.out.println("│ Menú Cadenas                                      │");
        System.out.println("├──────────────────────┬────────────────────────────┤");
        System.out.println("│ 1- NumeroEspacios    │ 11- EsNumero  x             │");
        System.out.println("│ 2- NumeroVocales     │ 12- QuitaCaracter          │");
        System.out.println("│ 3- EsPalindromo      │ 13- QuitaAcentos           │");
        System.out.println("│ 4- Contiene          │ 14- InvierteCadena         │");
        System.out.println("│ 5- RepiteCaracter    │ 15- VecesCaracter          │");
        System.out.println("│ 6- Padleft        x   │ 16- VecesPalabra           │");
        System.out.println("│ 7- QuitaEspacios   x  │ 17- MayusculasPrimera      │");
        System.out.println("│ 8- QuitaEspaciosTrim x│ 18- SustituyePalabra       │");
        System.out.println("│ 9- SustituyeCaracter │ 19- InviertePalabras       │");
        System.out.println("│ 10- CuentaPalabras   │ 20- QuitaEspaciosSobrantes │");
        System.out.println("└──────────────────────┴────────────────────────────┘");

        System.out.println();
        System.out.println("Dime que ejercicio quieres");
        opcion = reader.nextInt();

        switch (opcion) {
            case 1: {

                String s;
                System.out.println("Dime la frase");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println(numeroEspacios(s));

            }
            break;

            case 2: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println(numeroVocales(s));
            }
            break;

            case 3: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println(EsPalindromo(s));
            }
            break;

            case 4: {
                String s;
                String caracter;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println("Dime un caracter");
                caracter = reader.nextLine();
                Contiene(caracter,s);
            }
            break;

            case 5: {
                int n;
                String caracter;
                System.out.println("Dime un caracter");
                reader.nextLine();
                caracter = reader.nextLine();
                System.out.println("¿Cuantas veces lo repito?");
                n = reader.nextInt();
                RepiteCaracter(n,caracter);
            }
            break;

            case 7: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                quitaEspacios(s);
            }
            break;

            case 8: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                quitaEspaciosTrim(s);
            }
            break;

            case 9: {
                String s;
                String caracterCambiar;
                String caracterPuesto;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println("Dime un caracter que quieras cambiar");
                caracterCambiar = reader.nextLine();
                System.out.println("¿Por cual lo cambio?");
                caracterPuesto = reader.nextLine();
                System.out.println(sustituyeCaracter(s,caracterCambiar,caracterPuesto));
            }
            break;

            case 10: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println("Hay un total de " + cuentaPalabras(s) + " palabras");
            }
            break;

            case 11: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                esNumero(s);
            }
            break;

            case 12: {
                String s;
                String caracter;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println("Dime un caracter que quieras quitar");
                caracter = reader.nextLine();
                System.out.println(quitaCaracter(s,caracter));
            }
            break;

            case 13: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                quitaAcentos(s);
            }
            break;
        }


    }

    public static String numeroEspacios(String s) {

        int cont = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                cont++;
            }
        }
        return "En total hay " + cont + " espacios.";
    }

    public static String numeroVocales(String s) {

        int cont = 0;

        String vocales = "AEIOUaeiouáéíóúÁÉÍÓÚ";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (s.charAt(i) == vocales.charAt(j)) {
                    cont++;
                }
            }
        }

        return "En total hay " + cont + " vocales.";

    }

    public static Boolean EsPalindromo(String s) {

        s = s.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");

        String inverS = new StringBuilder(s).reverse().toString();

        if(s.equals(inverS)){
            return true;
        }else{
            return false;
        }
    }

    public static void Contiene(String s, String caracter){

        for(int i = 0; i < s.length();i++){
            if(caracter.contains(s)){
                System.out.println("Si aparece el caracter");
            }else {
                System.out.println("No aparece el caracter");
            }
        }
    }

    public static void RepiteCaracter(int n, String caracter){

        for(int i = 0; i < n;i++){
            System.out.print(caracter);
        }
    }

    public static void quitaEspacios(String s){

        String sinespaS;

        for(int i = 0; i < s.length();i++){

            if(s.charAt(i) == ' '){

            }else{
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void quitaEspaciosTrim(String s){


        for(int i = 0; i < s.length();i++){

            if(s.charAt(i) != s.length()){
                if(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ' | s.charAt(i + 1) == ' ' && s.charAt(i + 2) != ' ' ){

                }else{
                    System.out.print(s.charAt(i));
                }
            }else{
                break;
            }

        }
    }
    public static String sustituyeCaracter(String s,String caracterCambiar,String caracterPuesto){


        for(int i = 0; i < s.length();i++) {

            if (s.charAt(i) == caracterCambiar.charAt(0)) {

                s = s.replace(caracterCambiar.charAt(0), caracterPuesto.charAt(0));

            }
        }

        return s;
    }

    public static int cuentaPalabras(String s){

        int cont = 0;

        for(int i = 0; i < s.length();i++) {

            if(i == s.length() - 1){
                cont++;
                break;
            }else{
                if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {

                    cont++;
                }
            }
        }

        return cont;
    }

    public static void esNumero(String s){


        String numeros = "0123456789 ";
        int cont = 0;

        for(int i = 0; i < s.length();i++) {

            for(int j = 0; j < numeros.length();j++){
                if(s.charAt(i) == numeros.charAt(j)){

                }else{
                    cont++;
                }
            }
        }
        if(cont != 0){
            System.out.println("No esta compuesto solo por números " + cont);

        }else {
            System.out.println("Si esta compuesto por solo números " + cont);
        }

    }

    public static String quitaCaracter(String s,String caracter){

        String nada = "";

        for(int i = 0; i < s.length();i++) {

            if (s.charAt(i) == caracter.charAt(0)) {

                s = s.replace(String.valueOf(caracter),"");

            }
        }

        return s;
    }

    public static String quitaAcentos(String s){

        String acentos = "áéíóúÁÉÍÓÚ";
        String sinAce  = "aeiouAEIOU";
        for(int i = 0; i < s.length();i++) {

            for(int j = 0; j < )
            if (s.charAt(i) == caracter.charAt(0)) {

                s = s.replace(String.valueOf(caracter),"");

            }
        }

        return s;
    }
}
