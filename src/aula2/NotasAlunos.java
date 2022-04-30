package aula2;

import java.util.Scanner;

public class NotasAlunos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomes [] = {"ALINE", "MÁRIO", "SÉRGIO", "SHIRLEY"};
        String notas [] = {"9.0", "DEZ", "4.5", "7.0"};
        System.out.println("ALUNO(A)    NOTA");
        System.out.println("=============");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + "     " + notas[i]);
        }
    }
}
