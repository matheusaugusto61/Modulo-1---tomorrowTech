package aula5;

import java.util.Random;

public class Questao7 {

    public static void main(String[] args) {
        Random generator = new Random();
        char [] gabarito = new char[13];
        for (int i = 0; i < gabarito.length; i++) {
            Integer letraAscii = (int) (Math.random() * 3) + 1;
            gabarito[i] = (char)(generator.nextInt(4) + 97);
        }

        char [][] respostaApostador = new char[3][13];
        for (int i = 0; i < respostaApostador.length; i++) {
            for (int j = 0; j < respostaApostador[i].length; j++) {
                respostaApostador[i][j] = (char)(generator.nextInt(4) + 97);
            }
        }

        int count=0;
        for (int i = 0; i < respostaApostador.length; i++) {
            for (int j = 0; j < respostaApostador[i].length; j++) {
                if(respostaApostador[i][j]==gabarito[i]){
                    count++;
                }
            }
            System.out.println("Aluno " + (i+1) + ": " + count + " acertos" + (count>=6 ? "Aprovado!" : "Reprovado"));
            count=0;
        }

    }
}
