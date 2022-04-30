package aula5;

public class Questao4 {

    int somaElementosMatriz(int [][] numeros){
        int somaTotal=0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                somaTotal+=numeros[i][j];
            }
        }
        return somaTotal;
    }

    public static void main(String[] args) {
        Questao4 somaElementos = new Questao4();
        int [][] numeros = {{5, 5, 6},{7,4,3}};
        System.out.println(somaElementos.somaElementosMatriz(numeros));
    }
}
