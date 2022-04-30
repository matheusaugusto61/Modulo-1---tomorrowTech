package aula6;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximaVelocidadePermitida = input.nextInt();
        int velocidadeMotorista = input.nextInt();
        int diferencaVelocidade = velocidadeMotorista - maximaVelocidadePermitida;
        int valorMulta=0;
        if(diferencaVelocidade > 0 && diferencaVelocidade<=10){
            valorMulta=50;
        }else if(diferencaVelocidade > 10 && diferencaVelocidade <=30){
            valorMulta=100;
        }else if(diferencaVelocidade > 30){
            valorMulta=200;
        }

        System.out.println("valor da multa: R$" + valorMulta);
    }
}
