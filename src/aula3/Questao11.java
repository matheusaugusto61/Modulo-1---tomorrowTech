package aula3;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        }else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
            }
        }
    }
}
