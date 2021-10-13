package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio42 {
    public static void main (String [] args){
        /* 42. Receba o salário-base de um funcionário. Calcule e imprima o salário a receber, sabendo-se que esse
        * funcionário tem uma gratificação de 5% sobre o salário-base. Além disso, ele paga 7% de imposto sobre o
        * salário-base;
        * */

        Scanner teclado = new Scanner(System.in);

        double salarioBase;
        double imposto;
        double comissao;
        double salarioAReceber;

        System.out.print("Digite o valor do salário-base: R$");
        salarioBase = Double.parseDouble(teclado.nextLine());

        imposto = salarioBase * 0.07;
        comissao = salarioBase * 0.10;

        salarioAReceber = salarioBase - imposto + comissao;

        System.out.printf("Salário-base: R$%.2f.\n" +
                "Comissão: R$%.2f\n" +
                "Desconto imposto: R$-%.2f\n" +
                "Salário a receber R$%.2f", salarioBase, comissao, imposto, salarioAReceber);
    }
}
