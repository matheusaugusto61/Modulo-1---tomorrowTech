package aula7;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] codigoCidade = new int[5];
        int [] numeroVeiculosPasseio = new int[5];
        int [] numeroAcidentesComVitimas = new int[5];
        for (int i = 0; i < codigoCidade.length; i++) {
            codigoCidade[i] = input.nextInt();
            numeroVeiculosPasseio[i] = input.nextInt();
            numeroAcidentesComVitimas[i] = input.nextInt();
        }

        int referenciaMenorIndiceAcidente = 0;
        int referenciaMaiorIndiceAcidente = 0;
        int totalAcidentesComMenosVeiculos= 0;
        int countCidadesMenosVeiculos = 0;
        int totalVeiculos=0;
        for (int i = 1; i < numeroAcidentesComVitimas.length; i++) {
            if(numeroAcidentesComVitimas[referenciaMenorIndiceAcidente] > numeroAcidentesComVitimas[i]){
                referenciaMenorIndiceAcidente = i;
            }
            if(numeroAcidentesComVitimas[referenciaMaiorIndiceAcidente] < numeroAcidentesComVitimas[i]) {
                referenciaMaiorIndiceAcidente = i;
            }
            if(numeroVeiculosPasseio[i]<2000){
                totalAcidentesComMenosVeiculos += numeroAcidentesComVitimas[i];
                countCidadesMenosVeiculos++;
            }

            totalVeiculos+=numeroVeiculosPasseio[i];
        }

        double mediaVeiculos = (double)totalVeiculos/numeroVeiculosPasseio.length;
        double mediaAcidentesMenosCarros = (double)totalAcidentesComMenosVeiculos/countCidadesMenosVeiculos;
        System.out.println("Menor indice de acidentes é da cidade: " + codigoCidade[referenciaMenorIndiceAcidente]);
        System.out.println("Maior indice de acidentes é da cidade: " + codigoCidade[referenciaMaiorIndiceAcidente]);
        System.out.println("Média de veiculos de passeios: " + mediaVeiculos);
        System.out.println("Média de acidentes nas cidades com menos de 2000 veiculos: " + mediaAcidentesMenosCarros);

    }
}
