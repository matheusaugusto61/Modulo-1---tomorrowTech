package aula6;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double descontoSindicato = 0.03;
        double valorHorasTrabalhadas = input.nextDouble();
        int quantidadeHorasTrabalhadas = input.nextInt();
        double salarioBruto = valorHorasTrabalhadas * quantidadeHorasTrabalhadas;
        Double desconto = null;
        if(salarioBruto > 900 && salarioBruto<=1500){
            desconto = 0.05;
        }else if(salarioBruto > 1500 && salarioBruto<=2500){
            desconto = 0.1;
        }else if(salarioBruto>2500){
            desconto = 0.2;
        }

        double salarioLiquido = salarioBruto - (desconto.equals(null) ? 0 : salarioBruto * desconto) - (salarioBruto * descontoSindicato);
        System.out.println("Salario liquido: R$" + salarioLiquido);
        System.out.println("FGTS depositado: R$" + (salarioBruto * 0.11));
    }
}
