package aula7;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saltosAtleta[] = new double[5];

        do {
            System.out.println("Nome do atleta:");
            String nome = input.nextLine();
            if(nome.equals("")){
                break;
            }
            for (int i = 0; i < saltosAtleta.length; i++) {
                saltosAtleta[i] = input.nextDouble();
            }

            double menorSalto = saltosAtleta[0], maiorSalto = saltosAtleta[0], somaSaltos = 0;
            for (int i = 0; i < saltosAtleta.length; i++) {
                if (saltosAtleta[i] < menorSalto) {
                    menorSalto = saltosAtleta[i];
                }
                if (saltosAtleta[i] > maiorSalto) {
                    maiorSalto = saltosAtleta[i];
                }
                somaSaltos += saltosAtleta[i];
            }

            double mediaSaltos = (somaSaltos - menorSalto - maiorSalto) / saltosAtleta.length - 2;

            System.out.printf("Atleta: %s\n\n", nome);
            System.out.printf("Primeiro salto: %.1f m\n", saltosAtleta[0]);
            System.out.printf("Segundo salto: %.1f m\n", saltosAtleta[1]);
            System.out.printf("Terceiro salto: %.1f m\n", saltosAtleta[2]);
            System.out.printf("Quarto salto: %.1f m\n", saltosAtleta[3]);
            System.out.printf("Quinto salto: %.1f m\n\n", saltosAtleta[4]);
            System.out.printf("Melhor salto: %.1f m\n", maiorSalto);
            System.out.printf("Pior salto: %.1f m\n", menorSalto);
            System.out.printf("Média dos demais saltos: %.1f m\n\n", mediaSaltos);
            System.out.printf("Resultado final:\n%s: %.1f m\n", nome, mediaSaltos);
        }while (true);
    }
}
