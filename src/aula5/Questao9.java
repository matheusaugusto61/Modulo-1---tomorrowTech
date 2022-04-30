package aula5;

import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos:");
        int quantidadeProdutos = input.nextInt();
        String nomeProdutos[] = new String[quantidadeProdutos];
        Integer numeroEstoque[] = new Integer[quantidadeProdutos];
        Double valorUnitario[] = new Double[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.printf("Digite o nome do produto %d: \n", i);
            nomeProdutos[i] = input.nextLine();
            System.out.printf("Digite a quantidade do produto %d: \n", i);
            numeroEstoque[i] = input.nextInt();
            System.out.printf("Digite o valor unitario do produto %d: \n", i);
            valorUnitario[i] = input.nextDouble();
        }

        double valorTotalEstoque = 0, valorMercadorias=0;
        int totalMercadorias = 0;
        for (int i = 0; i < quantidadeProdutos; i++) {
            valorTotalEstoque+=valorUnitario[i] * numeroEstoque[i];
            valorMercadorias+=valorUnitario[i];
        }

        System.out.println("Valor total da mercadoria: " + valorTotalEstoque);
        System.out.println("Média das mercadorias: " + (valorMercadorias /quantidadeProdutos));
    }
}
