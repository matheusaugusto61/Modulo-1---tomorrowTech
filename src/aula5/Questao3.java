package aula5;

public class Questao3 {

    double maiorValorMatriz(double [][] numeros){
        double maiorValor = numeros[0][0];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j] > maiorValor){
                    maiorValor = numeros[i][j];
                }
            }
        }
        return maiorValor;
    }

    public static void main(String[] args) {
        Questao3 maiorvalor = new Questao3();
        double [][] numeros = {{5.0, 5.2, 6.0},{7.0,4.0,3.5}};
        System.out.println(maiorvalor.maiorValorMatriz(numeros));
    }

}
