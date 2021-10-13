package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio38 {
    public static void main (String [] args){
        //38. Leia o salário de um funcionário. Clacule e imprima o valor do novo salário, sabendo que ele recebeu um aumento de 25%

        Scanner teclado = new Scanner(System.in);

        double salarioAtual;
        double aumento;
        double salarioComAumento;

        System.out.print("Digite o valor do salário: R$");
        salarioAtual = Double.parseDouble(teclado.nextLine());

        aumento = salarioAtual * 0.25;
        salarioComAumento = salarioAtual + aumento;

        System.out.printf("Salário atual: R$%.2f\n" +
                "Aumento de  25%% = %.2f\n" +
                "Novo salário: R$%.2f.", salarioAtual, aumento, salarioComAumento);


    }
}

