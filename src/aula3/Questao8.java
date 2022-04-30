package aula3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer numeros[] = new Integer[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        Optional<Integer> max = Arrays.stream(numeros)
                .max(Comparator.naturalOrder());
        Optional<Integer> min = Arrays.stream(numeros)
                .min(Comparator.naturalOrder());
        Optional<Integer> total = Arrays.stream(numeros)
                .reduce((n1,n2) -> n1+n2);


        System.out.println("O maior número é: " + max.get());
        System.out.println("O menor número é: " + min.get());
        System.out.println("A média dos numeros é: " + (total.get()/numeros.length));

    }
}
