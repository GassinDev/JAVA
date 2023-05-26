import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        String n;
        System.out.println("┌───────────────────────────────┐");
        System.out.println("│ Menú de Juan - Las pirámides  │");
        System.out.println("├───────────────────────────────┤");
        System.out.println("│ 1) Pirámide hacia arriba      │");
        System.out.println("│ 2) Pirámide hacia abajo       │");
        System.out.println("│ 3) Pirámide hacia la derecha  │");
        System.out.println("│ 4) Pirámide hacia la izquierda│");
        System.out.println("└───────────────────────────────┘");
        i = reader.nextInt();

        System.out.println("┌───────────────────────────────────────────────────────┐");
        System.out.println("│ Menú de Juan - Las pirámides                          │");
        System.out.println("├───────────────────────────────────────────────────────┤");
        System.out.println("│ Elija un carácter o número para crear la pirámide     │");
        System.out.println("└───────────────────────────────────────────────────────┘");
        n = reader.next();

        switch (i){
            case 1:
                System.out.println("   " + n + "   " );
                System.out.println("  " + n + n + n + "  " );
                System.out.println(" " + n + n + n + n + n + " " );
            break;
            case 2:
                System.out.println(" " + n + n + n + n + n + " " );
                System.out.println("  " + n + n + n + "  " );
                System.out.println("   " + n + "   " );
            break;
            case 3:
                System.out.println(n);
                System.out.println(n + "  " + n);
                System.out.println(n + "  " + n + "  " + n);
                System.out.println(n + "  " + n);
                System.out.println(n);
            break;
            case 4:
                System.out.println("      " + n);
                System.out.println("   " + n + "  " + n);
                System.out.println(n + "  " + n + "  " + n);
                System.out.println("   " + n + "  " + n);
                System.out.println("      " + n);
            break;
            default:
        }

    }
}