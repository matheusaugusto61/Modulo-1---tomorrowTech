package aula2;

import java.util.Scanner;

public class MediaAlunos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        String turma = input.next();
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        double media = (nota1+nota2+nota3)/3;
        System.out.println("A média do aluno é: " + media);
    }
}
