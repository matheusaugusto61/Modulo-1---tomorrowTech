package aula3;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numFatorial = input.nextInt();
        Integer resultFatorial=numFatorial;
        while(numFatorial>1){
            resultFatorial = resultFatorial*(numFatorial-1);
            numFatorial--;
        }
        System.out.println(resultFatorial);
    }
}
