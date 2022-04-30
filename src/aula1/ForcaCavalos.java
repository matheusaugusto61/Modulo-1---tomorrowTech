package aula1;

import java.util.Scanner;

public class ForcaCavalos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double quilogramas = 130.4;
        Double altura = 6.5;
        Integer tempo = 60;
        Double quantidadeCavalos = (quilogramas * altura / tempo) / 745.6999;
        System.out.println(quantidadeCavalos);
    }
}
