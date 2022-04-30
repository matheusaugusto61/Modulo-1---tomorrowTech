package aula3;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        do{
            numero = input.nextInt();
            System.out.println("O numero é: " + (numero%2==0 ? "par" : "impar"));
        }while (numero!=0);
    }
}
