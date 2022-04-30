package aula3;

import java.util.Random;
import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 10) + 1;
        System.out.println(numAleatorio);
        int numeroEscolhido;
        do {
            numeroEscolhido = input.nextInt();
            if(numAleatorio == numeroEscolhido) {
                System.out.println("Acertou");
                break;
            }else{
                System.out.println("Errouuuuuuu");
            }

        }while(true);
    }
}
