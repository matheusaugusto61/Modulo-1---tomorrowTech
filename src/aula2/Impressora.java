package aula2;

import java.util.Scanner;

public class Impressora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        String endereco = input.nextLine();
        String cep = input.nextLine();
        String telefone = input.nextLine();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu endereço é: " + endereco);
        System.out.println("Seu cep é: " + cep + " e telefone é: " + telefone);
    }
}
