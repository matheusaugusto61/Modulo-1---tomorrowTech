package aula3;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        for(int i = 0; i <5; i++) {
            for(int j = i; j < 5; j++) {
                if(numeros[j] < numeros[i]) {
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }
    }
}
