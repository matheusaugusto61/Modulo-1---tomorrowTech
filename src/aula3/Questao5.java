package aula3;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura = input.nextDouble();
        double peso = input.nextDouble();
        double imc = peso / (altura*altura);
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if(imc > 18.5 && imc < 25){
            System.out.println("Peso normal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("excesso de peso");
        }else if(imc >= 30){
            System.out.println("Obesa");
        }
    }
}
