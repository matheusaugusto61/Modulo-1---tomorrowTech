package aula3;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double notas [] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = input.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            if(notas[i]>=7){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }
    }
}
