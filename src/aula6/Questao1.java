package aula6;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero de anos que fuma:");
        int anosFumando = input.nextInt();
        System.out.println("Numero de cigarros fumados por dia");
        int cigarrosFumadosDia = input.nextInt();
        System.out.println("Preço de uma cateira de 20 cigarros");
        double valorMacoCigarro = input.nextDouble();

        int cigarrosPorAno = cigarrosFumadosDia * (365*anosFumando);
        double macosPorAno = cigarrosPorAno / 20.0;
        System.out.println("O valor gasto com cigarros foi de R$" + (macosPorAno*valorMacoCigarro));
    }
}
