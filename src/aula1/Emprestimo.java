package aula1;

public class Emprestimo {


    public Double valorEmprestimoComJuros(Double valorEmprestimo, Integer mesesEmprestimo, Double taxaJuros){
        return valorEmprestimo * Math.pow((1+taxaJuros), mesesEmprestimo);
    }

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();
        Double valorEmprestimo = Double.valueOf(10);
        Integer mesesEmprestimo = Integer.valueOf(2);
        Double taxaJurosAoMes = 0.02;
        System.out.println("O valor a ser pago com juros é: R$" + emprestimo.valorEmprestimoComJuros(valorEmprestimo, mesesEmprestimo, taxaJurosAoMes));

    }
}
