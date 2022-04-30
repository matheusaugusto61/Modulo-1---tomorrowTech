package aula6;

import java.util.Locale;
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        System.out.println("Telefonou para a vitima?");
        count += input.next().toLowerCase().charAt(0) == 's' ? 1 : 0;
        System.out.println("Esteve no local do crime?");
        count += input.next().toLowerCase().charAt(0) == 's' ? 1 : 0;
        System.out.println("Mora perto da vítima?");
        count += input.next().toLowerCase().charAt(0) == 's' ? 1 : 0;
        System.out.println("Devia para a vítima?");
        count += input.next().toLowerCase().charAt(0) == 's' ? 1 : 0;
        System.out.println("Já trabalhou com a vítima?");
        count += input.next().toLowerCase().charAt(0) == 's' ? 1 : 0;

        if(count < 2){
            System.out.println("Inocente");
        }else if(count==2){
            System.out.println("Suspeito");
        }else if(count>2 && count <5){
            System.out.println("Cúmplice");
        }else if(count==5){
            System.out.println("Assassino");
        }
    }
}
