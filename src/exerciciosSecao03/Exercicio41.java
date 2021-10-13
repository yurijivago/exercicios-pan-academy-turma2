package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio41 {
    public static void main (String [] args){
        /* 41. Faça um programa qu leia o valor da hora de trabalho (em reais) e número de horas trabalhadas no mês
         * Imprima o valor a ser pago ao funcionário, adicionando 10% sobre o valor calculado.
         * */

        Scanner teclado = new Scanner(System.in);

        double valroHora;
        double horasTrabalhadas;
        double salario;

        System.out.println("Digite o valor da hora trabalhada: R$");
        valroHora = Double.parseDouble(teclado.nextLine());

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = Double.parseDouble(teclado.nextLine());

        salario = valroHora * horasTrabalhadas * 1.10;

        System.out.printf("Salário a receber: R$%.2f.", salario);
    }
}

