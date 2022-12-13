import sun.security.krb5.internal.crypto.Des;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int opcion = 1;

        while (opcion != 0) {

            System.out.println();
            System.out.println("MENU");
            System.out.println("------------------");
            System.out.println("1. Primos Relativos");
            System.out.println("2. CentigradosFaren y viceseversa");
            System.out.println("3. Calderilla");
            System.out.println("4. potencia2");
            System.out.println("5. trianguloEstrilla");
            System.out.println("6. Rombo");
            System.out.println("7. calendarioGrafico");
            System.out.println("8. cuadradoEstrellitas");
            System.out.println("9. BisiestoXXL");
            System.out.println("10. EscribeSerieNumero3");
            System.out.println("11. maximo,medio,minimo");
            System.out.println("12. romboide");
            System.out.println("13. calculalaNotaFinal");
            System.out.println("14. mesEnTexto,escribeFechaBonita");
            System.out.println("15. cuadradoPerfecto, listacuadradoPerfectos");
            System.out.println("16. DescomponerFactoresPrimos");
            System.out.println();

            System.out.println("Que ejercicios quieres:");
            opcion = reader.nextInt();

            switch (opcion) {

                case 1: {
                    int n, n2;

                    System.out.println("Dime el primer numero");
                    n = reader.nextInt();
                    System.out.println("Dime el segundo numero");
                    n2 = reader.nextInt();
                    primosRelativos(n, n2);
                }
                break;

                case 2: {

                    int o = 0;

                    System.out.println();
                    System.out.println("MENU");
                    System.out.println("-----------------------");
                    System.out.println("1. centigrados ---> Fahrenheit");
                    System.out.println("2. fahrenheit ----> Centigrados");
                    System.out.println("------------------------");
                    System.out.println();
                    System.out.print("Dime que opcion quieres:");

                    System.out.println("Que necesitas:");
                    o = reader.nextInt();

                    switch (o) {
                        case 1: {
                            double centigrados;
                            System.out.println("Dime los centígrados");
                            centigrados = reader.nextDouble();
                            System.out.println(centigradosAFahrenheit(centigrados) + " °F");
                        }
                        break;

                        case 2: {
                            double fahrenheit;
                            System.out.println("Dime los fahrenheit");
                            fahrenheit = reader.nextDouble();
                            System.out.println(fahrenheitACentigrados(fahrenheit) + " °C");
                        }
                        break;
                    }
                }
                break;

                case 3: {

                    double dinero;

                    System.out.println("Dime la cantidad de dinero (Menor de 5€) :");
                    dinero = reader.nextDouble();
                    calderilla(dinero);

                }
                break;

                case 4: {
                    int n;

                    System.out.println("Dime un número");
                    n = reader.nextInt();
                    System.out.println(potencia2(n));
                }
                break;

                case 5: {
                    int tamaño;

                    System.out.println("Dime el tamaño del triangulo");
                    tamaño = reader.nextInt();
                    trianguloEstrellita(tamaño);
                }
                break;

                case 6: {
                    int tamaño;

                    System.out.println("Dime el tamaño del rombo");
                    tamaño = reader.nextInt();
                    rombo(tamaño);
                }
                break;

                case 7: {

                }
                break;

                case 8: {

                }
                break;

                case 12: {
                    int longitud, altura;

                    System.out.println("Dime la altura");
                    altura = reader.nextInt();
                    System.out.println("Dime la longitud");
                    longitud = reader.nextInt();
                    romboide(altura, longitud);
                }
                break;

                case 16: {
                    int n;

                    System.out.println("Dime un numero");
                    n = reader.nextInt();
                    descomponerFactoresPrimos(n);
                }
                break;
            }

            System.out.println("Quieres volver a ejecutar el programa: 1-Si o 0-No");
            opcion = reader.nextInt();
        }
    }

    public static void primosRelativos(int n, int n2) {
        if (MCD(n, n2) == 1) {
            System.out.println(n + " y " + n2 + " son primos relativos.");
        } else {
            System.out.println(n + " y " + n2 + " no son primos relativos.");
        }
    }

    public static int MCD(int a, int b) {
        int min, i;

        min = Math.min(a, b);

        i = min;

        while (a % i != 0 || b % i != 0) {
            i--;
        }

        return i;
    }

    public static double centigradosAFahrenheit(double centigrados) {

        double fahrenheit;

        fahrenheit = (centigrados * 1.8) + 32;

        return fahrenheit;
    }

    public static double fahrenheitACentigrados(double fahrenheit) {

        double centigrados;

        centigrados = (fahrenheit - 32) / 1.8;

        return centigrados;
    }

    public static void calderilla(double dinero) {

        int e2 = 0, e1 = 0, cincuentaent = 0, ventecent = 0, cincocent = 0, diezcent = 0, uncent = 0, doscent = 0;

        while (dinero >= 2) {
            e2++;
            dinero = dinero - 2;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        while (dinero >= 1) {
            e1++;
            dinero = dinero - 1;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        while (dinero >= 0.5) {
            cincuentaent++;
            dinero = dinero - 0.5;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        while (dinero >= 0.2) {
            ventecent++;
            dinero = dinero - 0.2;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        while (dinero >= 0.1) {
            diezcent++;
            dinero = dinero - 0.1;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        while (dinero >= 0.05) {
            cincocent++;
            dinero = dinero - 0.05;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        while (dinero >= 0.02) {
            doscent++;
            dinero = dinero - 0.02;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        while (dinero >= 0.01) {
            uncent++;
            dinero = dinero - 0.01;
            dinero = Math.round(dinero * 100d) / 100d;
            System.out.println(dinero);
        }

        System.out.println();
        System.out.println(e2 + " monedas de 2€");
        System.out.println(e1 + " monedas de 1€");
        System.out.println(cincuentaent + " monedas de 50 cent");
        System.out.println(ventecent + " monedas de 20 cent");
        System.out.println(diezcent + " monedas de 10 cent");
        System.out.println(cincocent + " monedas de 5 cent");
        System.out.println(doscent + " monedas de 2 cent");
        System.out.println(uncent + " monedas de 1 cent");

    }

    public static int potencia2(int n) {

        int result = 0;

        if (n == 0) {
            result = -1;
        } else if (n < 0) {
            result = -1;
        } else {
            result = n * n;
        }

        return result;
    }

    public static void trianguloEstrellita(int tamaño) {

        if (tamaño >= 3 && tamaño <= 20) {
            for (int i = 1; i <= tamaño; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }

    }

    public static void rombo(int tamaño) {

        int i, j;
        for (j = 1; j <= tamaño; j++) {
            for (i = 0; i < tamaño - j; i++) {

                System.out.print(" ");
            }

            for (i = 0; i < j * 2; i++) {

                System.out.print("*");
            }
            System.out.println("");

        }
        for (j = tamaño - 1; j >= 0; j--) {
            for (i = 0; i < tamaño - j; i++) {

                System.out.print(" ");
            }

            for (i = j * 2; i > 0; i--) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void romboide(int altura, int longitud) {

        int i, j;

        for (j = 0; j <= altura - 1; j++) {

            for (i = 0; i < altura - j; i++) {

                System.out.print(" ");
            }

            for (i = 0; i <= longitud - 1; i++) {

                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void descomponerFactoresPrimos(int n) {
        int i = 1, resultado = 0;

        while (n % i == 0) {
            for (i = 1; i < n; i--) {
                resultado = n / i;

                resultado = resultado / i;

            }
            System.out.print(resultado + " x ");
            i++;
        }
    }

}