package aula2;

import java.util.Scanner;

public class QuadradoDoNumero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[4];
        int somatoriaNumeros=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
            numeros[i] = numeros[i]*numeros[i];
            somatoriaNumeros+=numeros[i];
        }
        System.out.println("Resultado da soma de todos os valores elevados ao quadrado: " + somatoriaNumeros);
    }
}
