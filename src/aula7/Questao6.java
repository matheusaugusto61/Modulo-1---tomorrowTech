package aula7;

import java.util.Locale;
import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe em metros quadrados a área a ser pintada:");
        double areaParaPintar = input.nextDouble();
        System.out.println("a. comprar apenas latas de 18 litros\nb.comprar apenas galões de 3,6 litros");
        char opcao = input.next().toLowerCase().charAt(0);
        if(opcao=='a') {
            double litrosDeTinta = areaParaPintar / 6.0;
            Double resultadoDivisaoLatas = litrosDeTinta / 18;
            resultadoDivisaoLatas += (resultadoDivisaoLatas % 2 != 0 ? 1 : 0);
            Integer latasTinta = resultadoDivisaoLatas.intValue();

            double valorTotalTinta = latasTinta * 80;
            System.out.println("Sera gasto R$" + valorTotalTinta);
        }else if(opcao == 'b'){

            double litrosDeTinta = areaParaPintar / 6.0;
            Double resultadoDivisaoLatas = litrosDeTinta / 3.6;
            resultadoDivisaoLatas += (resultadoDivisaoLatas % 2 != 0 ? 1 : 0);
            Integer latasTinta = resultadoDivisaoLatas.intValue();

            double valorTotalTinta = latasTinta * 25;
            System.out.println("Sera gasto R$" + valorTotalTinta);
        }
    }
}
