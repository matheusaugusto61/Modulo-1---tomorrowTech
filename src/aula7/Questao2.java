package aula7;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe em metros quadrados a área a ser pintada:");
        double areaParaPintar = input.nextDouble();
        double litrosDeTinta = areaParaPintar / 3.0;
        Double resultadoDivisaoLatas = litrosDeTinta/18;
        resultadoDivisaoLatas+=(resultadoDivisaoLatas%2!=0 ? 1 : 0);
        Integer latasTinta = resultadoDivisaoLatas.intValue();

        double valorTotalTinta = latasTinta * 60;
        System.out.println("Sera gasto R$" + valorTotalTinta);
    }
}
