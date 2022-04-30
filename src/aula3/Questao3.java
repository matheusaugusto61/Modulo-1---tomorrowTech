package aula3;

public class Questao3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + (i%10==0 ? " Multiplo de 10" : ""));
        }
    }
}
