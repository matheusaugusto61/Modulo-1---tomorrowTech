package aula1;

public class ReajusteSalario {

    public Double reajustaSalario(Double salario){
        return salario + (salario * 0.07);
    }
    public static void main(String[] args) {
        ReajusteSalario reajuste = new ReajusteSalario();
        Double salario = 1200.56;
        System.out.println("Salario antes: R$" + salario);
        salario = reajuste.reajustaSalario(salario);
        System.out.println("Salario reajustado: R$" + salario);
    }
}
