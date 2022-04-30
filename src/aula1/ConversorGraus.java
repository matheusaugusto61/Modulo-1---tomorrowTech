package aula1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ConversorGraus {

    private final Float conversorKelvin = 273.15f;
    private final Float conversorRankine = 459.67f;
    private final float conversorReaumur = 273.15f;


    public Float conversorGrausParaKelvin(Float temperaturaGraus){
        return temperaturaGraus + conversorKelvin;
    }

    public Float conversorGrausParaFahrenheit(Float temperaturaGraus){
        return temperaturaGraus * 1.8f + 32;
    }

    public Float conversorGrausParaRankine(Float temperaturaGraus){
        return temperaturaGraus * 1.8f + 32 + conversorRankine;
    }

    public Float conversorGrausParaReaumur(Float temperaturaGraus){
        return temperaturaGraus * 0.8f;
    }


    public static void main(String[] args) {
        ConversorGraus conversor = new ConversorGraus();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus:");
        Float temperaturaGraus = input.nextFloat();
        System.out.printf("A temperatura em Kelvin fica: %.2f\n", conversor.conversorGrausParaKelvin(temperaturaGraus));
        System.out.printf("A temperatura em Fahrenheit fica: %.2f\n", conversor.conversorGrausParaFahrenheit(temperaturaGraus));
        System.out.printf("A temperatura em Rankine fica: %.2f\n", conversor.conversorGrausParaRankine(temperaturaGraus));
        System.out.printf("A temperatura em Reaumur fica: %.2f\n", conversor.conversorGrausParaReaumur(temperaturaGraus));
    }
}
