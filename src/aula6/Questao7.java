package aula6;

import java.util.Locale;
import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalComprasEfetuadas=0;
        double totalComprasPrazo=0;
        double totalComprasAVista=0;
        double primeraPrestacaoPrazo=0;

        for (int i = 0; i < 15; i++) {
            System.out.println("Tipo da compra: V - a vista P - a prazo");
            char opcao = input.next().toLowerCase().charAt(0);
            System.out.println("valor da compra");
            double valorCompra = input.nextDouble();
            if(opcao == 'v'){
                totalComprasAVista+=valorCompra;
            }else if(opcao == 'p'){
                totalComprasPrazo+=valorCompra;
                if(primeraPrestacaoPrazo == 0){
                    primeraPrestacaoPrazo = valorCompra;
                }
            }
            totalComprasEfetuadas+=valorCompra;
        }

        System.out.println("Total compras a vista: " + totalComprasAVista);
        System.out.println("Total compras a prazo: " + totalComprasPrazo);
        System.out.println("Total compras efetuadas: " + totalComprasEfetuadas);
        System.out.println("Valor primeira prestacao das compras a prazo: " + primeraPrestacaoPrazo);
    }
}
