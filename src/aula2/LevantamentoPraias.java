package aula2;

import java.util.Scanner;

public class LevantamentoPraias {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomePraia[] = new String[5];
        double distanciaPraia[] = new double[5];
        for (int i = 0; i < nomePraia.length; i++) {
            nomePraia[i] = input.nextLine();
            distanciaPraia[i] = input.nextDouble();
        }

        int idPraiaMaisDistante = 0;
        boolean distanciaMaior10Menor15[] = new boolean[5];
        double somadorTodasDistancias=0;
        for (int i = 1; i < distanciaPraia.length; i++) {
            if(distanciaPraia[idPraiaMaisDistante]<distanciaPraia[i]){
                idPraiaMaisDistante = i;
            }
            if(distanciaPraia[i]>10 && distanciaPraia[i]<15){
                distanciaMaior10Menor15[i]=true;
            }else
                distanciaMaior10Menor15[i]=false;
            somadorTodasDistancias+=distanciaPraia[i];
        }
        double distanciaMediaPraia = somadorTodasDistancias / nomePraia.length;

        System.out.println("A praia mais distante é: " + nomePraia[idPraiaMaisDistante]);
        System.out.println("Praias que estão a mais de 10km e menos de 15km:");
        for (int i = 0; i < distanciaMaior10Menor15.length; i++) {
            if(distanciaMaior10Menor15[i]){
                System.out.println(nomePraia[i]);
            }
        }
        System.out.println("Distancia média das praias: " + distanciaMediaPraia);
    }
}
