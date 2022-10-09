public class Main {
    public static void main(String[] args) {
        int notas,min = 1,max = 7,tamaño;

        String nota = "";

        tamaño = 4 * (int)(Math.random() * 7 + 1);

        for(int i = 1;i < tamaño + 1;i++){

            notas = (int)(Math.random() * 7);

            switch (notas){

                case 0:{
                    nota = "do";
                }break;

                case 1:{
                    nota = "re";
                }break;

                case 2:{
                    nota = "mi";
                }break;

                case 3:{
                    nota = "fa";
                }break;

                case 4:{
                    nota = "sol";
                }break;

                case 5:{
                    nota = "la";
                }break;

                case 6:{
                    nota = "si";
                }break;
            }

            System.out.print(nota + " ");
            if(i % 4 == 0 & i != tamaño){
                System.out.print("| ");
            }
        }
        System.out.println("||");


    }
}