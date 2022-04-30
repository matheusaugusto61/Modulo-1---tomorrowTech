package aula7;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("KG dos peixes");
        int kgPeixes = input.nextInt();
        int excesso = kgPeixes - 50;
        int multa = excesso * 4;
        System.out.println("Excesso: " + excesso + " KG");
        System.out.println("Multa R$" + multa);
    }
}
