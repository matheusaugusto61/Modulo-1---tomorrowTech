package aula7;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Altura:");
        double altura = input.nextDouble();
        System.out.println("Sexo:");
        char sexo = input.next().charAt(0);
        double pesoIdeal=0;
        if(sexo=='m'){
            pesoIdeal = (62.1*altura)-58;
        } else if(sexo=='h'){
            pesoIdeal = (72.7*altura)-44.7;
        }

        System.out.println("Peso ideal: " + pesoIdeal);
    }
}
