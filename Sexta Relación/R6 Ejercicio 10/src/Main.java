public class Main {
    public static void main(String[] args) {

        int c,tamaLin;
        String caracter;

        for(int i = 0; i < 10;i++){

            tamaLin = (int)(Math.random()* 40 + 1);

            for(int x = 1; x < tamaLin;x++){

                c = (int)(Math.random()*6 + 1);

                switch (c) {

                    case 1: {
                        caracter = "*";
                        System.out.print(caracter);
                    }

                    case 2: {
                        caracter = "-";
                        System.out.print(caracter);
                    }

                    case 3: {
                        caracter = "=";
                        System.out.print(caracter);
                    }

                    case 4: {
                        caracter = ".";
                        System.out.print(caracter);
                    }

                    case 5: {
                        caracter = "|";
                        System.out.print(caracter);
                    }

                    case 6: {
                        caracter = "@";
                        System.out.print(caracter);
                    }
                    default:
                }
            }
            System.out.println("");
        }


    }
}