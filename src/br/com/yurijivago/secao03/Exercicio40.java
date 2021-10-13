package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio40 {
    public static void main (String [] args){
        /* 40. Uma empresa contrata um encanador a R$30,00 por dia. Faça um programa que solicite o número de dias
        * trabalhados pelo encanador e imprima a quantia líquida que deverá ser paga, sabendo-se que são
        * descontados 8% para imposto de renda.
        * */

        Scanner teclado = new Scanner(System.in);

        double diasTrabalahdos;
        double salarioBruto;
        double irpf;
        double totalAPagar;

        System.out.println("Digite a quantidade de dias trabalhados: ");
        diasTrabalahdos = Double.parseDouble(teclado.nextLine());

        salarioBruto = diasTrabalahdos * 30;
        irpf = salarioBruto * 0.08;
        totalAPagar = salarioBruto - irpf;

        System.out.printf("Dias trabalahdos: %s\n" +
                "Valor bruto: R$%.2f\n" +
                "Descont o IRPF: R$%.2f\n" +
                "Valor a pagar: R$%.2f.", diasTrabalahdos, salarioBruto, irpf, totalAPagar);
    }
}
