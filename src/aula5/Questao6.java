package aula5;

public class Questao6 {

    public static void main(String[] args) {
        int [] gabarito = new int[13];
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] =  (int) (Math.random() * 3) + 1;
        }

        int [][] respostaApostador = new int[3][13];
        for (int i = 0; i < respostaApostador.length; i++) {
            for (int j = 0; j < respostaApostador[i].length; j++) {
                respostaApostador[i][j] =  (int) (Math.random() * 3) + 1;
            }
        }

        int count=0;
        for (int i = 0; i < respostaApostador.length; i++) {
            for (int j = 0; j < respostaApostador[i].length; j++) {
                if(respostaApostador[i][j]==gabarito[i]){
                    count++;
                }
            }
            System.out.println("Apostador " + (i+1) + ": " + count + " acertos" + (count==13 ? "Ganhador!" : ""));
            count=0;
        }


    }
}
