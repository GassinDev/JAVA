public class Main {
    public static void main(String[] args) {

        int notas,nSuspensos = 0,nBienes = 0,nSobres = 0,nNotables = 0,nSufi = 0;

        for(int i = 0;i < 20;i++){

            notas = (int)(Math.random()*11);

            switch (notas){

                case 0:{
                    nSuspensos++;
                }break;

                case 1:{
                    nSuspensos++;
                }break;

                case 2:{
                    nSuspensos++;
                }break;

                case 3:{
                    nSuspensos++;
                }break;

                case 4:{
                    nSuspensos++;
                }break;

                case 5:{
                    nSufi++;
                }break;

                case 6:{
                    nBienes++;
                }break;

                case 7:{
                    nNotables++;
                }break;

                case 8:{
                    nNotables++;
                }break;

                case 9:{
                    nSobres++;
                }break;

                case 10:{
                    nSobres++;
                }break;
                default:
            }
        }
        System.out.println("Suspensos: " + nSuspensos);
        System.out.println("Suficientes: " + nSufi);
        System.out.println("Bien: " + nBienes);
        System.out.println("Notables: " + nNotables);
        System.out.println("Sobresalientes: " + nSobres);
    }
}