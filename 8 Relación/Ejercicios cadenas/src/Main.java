import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int opcion;
        System.out.println("┌───────────────────────────────────────────────────┐└┘─┬┴┤┤├ ");
        System.out.println("│ Menú Cadenas                                      │");
        System.out.println("├──────────────────────┬────────────────────────────┤");
        System.out.println("│ 1- NumeroEspacios    │ 11- EsNumero               │");
        System.out.println("│ 2- NumeroVocales     │ 12- QuitaCaracter          │");
        System.out.println("│ 3- EsPalindromo      │ 13- QuitaAcentos           │");
        System.out.println("│ 4- Contiene          │ 14- InvierteCadena         │");
        System.out.println("│ 5- RepiteCaracter    │ 15- VecesCaracter          │");
        System.out.println("│ 6- Padleft        x   │ 16- VecesPalabra           │");
        System.out.println("│ 7- QuitaEspacios     │ 17- MayusculasPrimera      │");
        System.out.println("│ 8- QuitaEspaciosTrim │ 18- SustituyePalabra       │");
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
                System.out.println("Hay un total de " + numeroEspacios(s) + " espacios.");

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
                System.out.println(quitaEspacios(s));
            }
            break;

            case 8: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println("*" + s + "*");
                System.out.println("*" + quitaEspaciosTrim(s) + "*");
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
                System.out.println(quitaAcentos(s));
            }
            break;

            case 14: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println(invierteCadena(s));
            }
            break;

            case 15: {
                String s;
                String caracter;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println("Dime un caracter que quieras que cuente");
                caracter = reader.nextLine();
                System.out.println("Hay un total de " + vecesCaracter(s,caracter) + " veces ese caracter");
            }
            break;

            case 16: {
                String s;
                String palabra;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println("Dime una palabra que quieras que cuente");
                palabra = reader.nextLine();
                System.out.println("Se repite un total de " + vecesPalabra(s,palabra) + " veces");
            }
            break;

            case 17: {
                String s;
                System.out.println("Dime una palabra u oración");
                reader.nextLine();
                s = reader.nextLine();
                System.out.println(mayusculasPrimera(s));
            }
            break;
        }


    }

    public static int numeroEspacios(String s) {

        int cont = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                cont++;
            }
        }
        return cont;
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

    public static String RepiteCaracter(int n, String caracter){

        String caraRepe = "";
        for(int i = 0; i < n;i++){
            caraRepe = caraRepe + caracter;
        }

        return  caraRepe;
    }

    public static String quitaEspacios(String s){

        String sinespaS = "";

        for(int i = 0; i < s.length();i++){

            if(s.charAt(i) == ' '){

            }else{
                sinespaS = sinespaS + s.charAt(i);
            }
        }

        return sinespaS;
    }

    public static String quitaEspaciosTrim(String s){

        int i;
        String nada = "";
        String sinEspa = "";
        if(numeroEspacios(s) != s.length()){
            int p1, p2;

            p1 = 0;
            while (s.charAt(p1) == ' '){
                p1 ++;
            }

            p2 = s.length() - 1;
            while (s.charAt(p2) == ' '){
                p2--;
            }
            for (i = p1; i < p2 + 1; i++){
                sinEspa = sinEspa + s.charAt(i);
            }
            return sinEspa;
        }
        else{
            return nada;
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

    public static boolean esNumero(String s){

        for (int cont = 0; cont < s.length(); cont++) {
            if (!Character.isDigit(s.charAt(cont))) {
                return false;
            }
        }
        return true;

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
        int pos;

        for(int i = 0; i < s.length();i++) {

            for(int j = 0; j < acentos.length();j++){

                if(s.charAt(i) == acentos.charAt(j)){

                    pos = j;

                    for (int x = 0; x < sinAce.length();x++){
                        if(x == pos){
                            s = s.replace(String.valueOf(s.charAt(i)),String.valueOf(sinAce.charAt(x)));
                        }
                    }
                }
            }
        }

        return s;
    }

    public static String invierteCadena(String s){

        String cadenaInver = "";
        for(int i = s.length() - 1; i >= 0;i--) {
            cadenaInver = cadenaInver + s.charAt(i);
        }

        return cadenaInver;
    }

    public static int vecesCaracter(String s,String caracter){

        int cont = 0;

        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == caracter.charAt(0)){
                cont++;
            }
        }

        return cont;
    }

    public static int vecesPalabra(String s,String palabra){

        int cont = 0;
        String[] palabras = s.split("\\ ");

        for(int i = 0; i < palabras.length;i++){

            if(palabras[i].equals(palabra)){
                cont++;
            }
        }

        return cont;
    }

    public static String mayusculasPrimera(String s){

        String mayúscula = "QWERTYUIOPASDFGHJKLÑZXCVBNMÁÉÍÓÚ";
        String minusculas  = "qwertyuiopñlkjhgfdsazxcvbnmáéíóú";
        int pos;

        for(int i = 0; i < s.length();i++) {

            for(int j = 0; j < minusculas.length();j++){



                if(s.charAt(i) != ' ' && s.charAt(i - 1) == ' '){
                    if(s.charAt(i) == minusculas.charAt(j)){

                        pos = j;

                        for (int x = 0; x < mayúscula.length();x++){
                            if(x == pos){
                                s = s.replace(String.valueOf(s.charAt(i)),String.valueOf(mayúscula.charAt(x)));
                                break;
                            }
                        }
                    }
                }

            }
        }

        return s;
    }


}
