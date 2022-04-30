package aula1;

public class CalculadoraSimples {

    public double soma(double num1, double num2){
        return num1+num2;
    }

    public double subtracao(double num1, double num2){
        return num1-num2;
    }

    public double divisao(double num1, double num2){
        return num1/num2;
    }

    public double multiplicacao(double num1, double num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        CalculadoraSimples calculadora = new CalculadoraSimples();
        Double num1 = Double.valueOf(5);
        Double num2 = Double.valueOf(0);
        System.out.println("Soma: " + calculadora.soma(num1, num2));
        System.out.println("Subtração: " + calculadora.subtracao(num1, num2));
        if(!num2.equals(0.0)){
            System.out.println("Divisão: " + calculadora.divisao(num1, num2));
        }else{
            System.out.println("Divisão inválida");
        }
        System.out.println("Multiplicação: " + calculadora.soma(num1, num2));
    }
}
