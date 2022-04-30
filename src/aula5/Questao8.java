package aula5;

public class Questao8 {

    public static void main(String[] args) {
        int [][] matrizNumeros = new int[2][5];
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                matrizNumeros[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        boolean existeNumero=false;
        int pesquisaNaMatriz =  (int) (Math.random() * 100) + 1;
        a:
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                if(pesquisaNaMatriz == matrizNumeros[i][j]){
                    existeNumero=true;
                    break a;
                }
            }
        }
        if(existeNumero){
            System.out.println("O valor existe no conjunto");
        }else{
            System.out.println("O valor não existe no conjunto");
        }
    }
}
