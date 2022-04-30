package aula6;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pessoasMais90kg=0;
        int countPessoasMais90kg=0;
        double mediaIdades;
        int totalIdades=0;

        for (int i = 0; i < 7; i++) {
            System.out.println("idade:");
            int idade = input.nextInt();
            System.out.println("Peso:");
            double peso = input.nextDouble();
            if(peso>90){
                countPessoasMais90kg++;
            }
            totalIdades+=idade;
        }
        mediaIdades = (double) totalIdades/7;
        System.out.println("Quantidade de pessoas com mais de 90kg: " + countPessoasMais90kg);
        System.out.println("Media idade: " + mediaIdades);
    }
}
