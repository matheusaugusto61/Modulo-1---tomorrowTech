package aula2;

import java.util.Scanner;

public class LitrosNecessarios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tempoViagem = input.nextDouble();
        int velocidadeMedia = input.nextInt();
        double distancia = tempoViagem * velocidadeMedia;
        double litrosNecessarios = distancia / 12;
        System.out.println("Litros necessários: " + litrosNecessarios);
    }
}
