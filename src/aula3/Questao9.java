package aula3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Questao9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer idade[] = new Integer[10];
        for (int i = 0; i < idade.length; i++) {
            idade[i] = input.nextInt();
        }

         Arrays.stream(idade)
                .filter(i -> i > 18)
                .forEach(System.out::println);


    }
}
