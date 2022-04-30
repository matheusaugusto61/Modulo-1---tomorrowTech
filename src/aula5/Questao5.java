package aula5;

public class Questao5 {

    double mediaLinha(int[][]numeros, int linha){
        int soma=0;
        for (int i = 0; i < numeros[linha].length; i++) {
            soma+=numeros[linha][i];
        }
        double quantidadeColunas = numeros[linha].length;
        return soma/quantidadeColunas;
    }

    public static void main(String[] args) {
        Questao5 media = new Questao5();
        int [][] numeros = {{5, 5, 6},{7,4,3}};
        System.out.println((media.mediaLinha(numeros, 1)));
    }
}
