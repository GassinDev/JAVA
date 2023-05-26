public class Main {
    public static void main(String[] args) {

        String r = "\033[31m";
        String v = "\033[32m";
        String n = "\033[33m";
        String a = "\033[34m";
        String m = "\033[35m";
        String c = "\033[36m";
        String b = "\033[37m";

        System.out.println("   LUNES      MARTES     MIÉRCOLES      JUEVES      VIERNES   " );
        System.out.println("--------------------------------------------------------------" );
        System.out.println("    " + r +"BDA" + v +"        PRG          PRG"+a+"           EDS"+r+"         BDA     " );
        System.out.println("    "+ r +"BDA"+v+"        PRG          PRG           PRG         "+r+"BDA     " );
        System.out.println("    "+c+"ING"+a+"        EDS          "+v+"PRG           PRG         "+m+"SIN     " );
        System.out.println("    "+n+"FOL        "+a+"EDS          "+c+"ING           "+v+"PRG         "+m+"SIN     " );
        System.out.println("    "+n+"FOL        "+b+"LMS          "+m+"SIN           SIN         "+b+"LMS     " );
        System.out.println("    "+n+"FOL        "+b+"LMS          "+m+"SIN           SIN         "+b+"LMS     " );
    }
}