package aula5;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [][] numeros = new double[2][5];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]= input.nextDouble();
            }
        }
    }
}
