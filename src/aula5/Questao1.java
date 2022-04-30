package aula5;

public class Questao1 {

    public static void main(String[] args) {
        double numerosAleatorios[] = new double[10];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (Math.random() * 100) + 1;
        }
    }
}
