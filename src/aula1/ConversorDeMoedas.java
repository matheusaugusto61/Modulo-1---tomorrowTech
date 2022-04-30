package aula1;

public class ConversorDeMoedas {

    private Double cotacaoDolar = 4.73;
    private Double cotacaoEuro = 5.74;
    private Double cotacaoLibra = 6.88;


    public Double conversorRealparaDolar(Double valorEmReal){
        return valorEmReal / cotacaoDolar;
    }

    public Double conversorRealparaLibra(Double valorEmReal){
        return valorEmReal / cotacaoLibra;
    }

    public Double conversorRealparaEuro(Double valorEmReal){
        return valorEmReal / cotacaoEuro;
    }

    public static void main(String[] args) {
        ConversorDeMoedas conversor = new ConversorDeMoedas();
        Double valorEmReal = 56.5;
        System.out.printf("valor em dolar $%.2f\n", conversor.conversorRealparaDolar(valorEmReal));
        System.out.printf("valor em Euro $%.2f\n", conversor.conversorRealparaEuro(valorEmReal));
        System.out.printf("valor em libra $%.2f\n", conversor.conversorRealparaLibra(valorEmReal));
    }
}
