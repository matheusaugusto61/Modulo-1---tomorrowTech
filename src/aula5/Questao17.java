package aula5;

import java.util.Scanner;

public class Questao17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isHabitanteValido=true;
        int habitantes = 0, totalFilhos=0, salarioMenor = 0;
        double salarioTotal=0, maiorSalario = 0;

        while(true){
            System.out.println("Digite o salário");
            double salario = input.nextDouble();

            if(salario<0){
                break;
            }

            System.out.println("Digite o numero de filhos");
            int numeroFilhos = input.nextInt();

            isHabitanteValido = salario>=0;


            habitantes += 1;
            totalFilhos += numeroFilhos;
            salarioTotal += salario;
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

        }

        System.out.println("Media salarios" + (salarioTotal/habitantes));
        System.out.println("Media do numero de filhos:" + (totalFilhos/habitantes));
        System.out.println("Maior salario:" + maiorSalario);
        System.out.println("Porcentagem de salarios menor que 150" + ((salarioMenor/habitantes)*100));

    }
}
