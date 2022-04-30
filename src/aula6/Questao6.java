package aula6;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("idade:");
        int idade = input.nextInt();
        if(idade >=18 && idade <=67){
            System.out.println("Pode doar");
        } else {
            System.out.println("Não pode doar");
        }
    }
}
