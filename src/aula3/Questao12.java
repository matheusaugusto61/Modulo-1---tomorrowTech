package aula3;

import java.util.Locale;
import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        Integer idade = input.nextInt();
        Double salario = input.nextDouble();
        Character sexo = input.next().toLowerCase().charAt(0);
        Character estadoCivil = input.next().toLowerCase().charAt(0);
        if(nome.length() < 3){
            System.out.println("Nome muito curto");
        }else if(idade < 0 || idade > 150){
            System.out.println("Idade invalida");
        }else if(salario<0){
            System.out.println("Salario invalido");
        }else if(!sexo.equals('f') || !sexo.equals('m')){
            System.out.println("Sexo invalido");
        }else if(!estadoCivil.equals('s') || !estadoCivil.equals('c') || !estadoCivil.equals('v') || !estadoCivil.equals('d')){
            System.out.println("Estado civil invalido");
            }
        }
    }

