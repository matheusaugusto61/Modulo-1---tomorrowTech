package aula6;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int controladorAdicionar=0;
        int [][] agenda = new int[10][3];
        while(true){
            System.out.println("1 - inserir um contato\n2- Remover um contato");
            int opcaoMenu = input.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println("Codigo da pessoa");
                    agenda[controladorAdicionar][0]= input.nextInt();
                    System.out.println("numero de telefone");
                    agenda[controladorAdicionar][1]= input.nextInt();
                    System.out.println("idade");
                    agenda[controladorAdicionar][2]= input.nextInt();
                    controladorAdicionar++;
                    for (int i = 0; i < agenda.length; i++) {

                        for (int j = 0; j < agenda[i].length; j++) {
                            if(j==0 && agenda[i][j]!=0) {
                                System.out.println("contato: " + (i + 1));
                            }
                            if(agenda[i][j]!=0)
                                System.out.println(agenda[i][j]);
                            if(j == agenda[i].length-1 && agenda[i][j]!=0){
                                System.out.println();
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Informe o codigo da pessoa");
                    int codigoPessoa = input.nextInt();
                    for (int i = 0; i < agenda.length; i++) {
                        if(codigoPessoa == agenda[i][0]){
                            agenda[i][0]= 0;
                            agenda[i][1]= 0;
                            agenda[i][2]= 0;
                            controladorAdicionar--;
                        }
                    }
                    for (int i = 0; i < agenda.length; i++) {

                        for (int j = 0; j < agenda[i].length; j++) {
                            if(j==0 && agenda[i][j]!=0) {
                                System.out.println("contato: " + (i + 1));
                            }
                            if(agenda[i][j]!=0)
                                System.out.println(agenda[i][j]);
                            if(j == agenda[i].length-1 && agenda[i][j]!=0){
                                System.out.println();
                            }
                        }
                    }
                    break;
            }
        }
    }
}
