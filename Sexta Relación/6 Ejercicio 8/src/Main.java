public class Main {
    public static void main(String[] args) {
        int resulRandom,f,colum = 3,apu,goles;

        String gol;

        for (f = 1; f <= 14; f++) {

            System.out.printf( f + ".\t |");

            for (apu= 1; apu <= colum; apu++) {

                resulRandom = (int)(Math.random() * 6) + 1;

                switch(resulRandom) {

                    case 1:{
                        System.out.print(" 1 |");
                    }break;

                    case 2:{
                        System.out.print(" 1 |");
                    }break;

                    case 3:{
                        System.out.print(" 1 |");
                    }break;

                    case 4:{
                        System.out.print(" 2 |");
                    }break;

                    case 5:{
                        System.out.print(" 2 |");
                    }break;

                    case 6:{
                        System.out.print(" X |");
                    }break;
                    default:
                }
            }
            System.out.println();
        }
        System.out.println("");

        goles = (int)(Math.random() * 4);

        switch (goles){

            case 0:{
                gol = "0";
            }

            case 1:{
                gol = "1";
            }

            case 2:{
                gol = "2";
            }

            case 3:{
                gol = "M";
            }
        }
        System.out.print("15.\t Pleno al 15 ---> Local - " + goles);
        goles = (int)(Math.random()*4);

        switch (goles){

            case 0:{
                gol = "0";
            }

            case 1:{
                gol = "1";
            }

            case 2:{
                gol = "2";
            }

            case 3:{
                gol = "M";
            }
        }
        System.out.print("   Visitante - " + goles);
        System.out.println("");
    }
}