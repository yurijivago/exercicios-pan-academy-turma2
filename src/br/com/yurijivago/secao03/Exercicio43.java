package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio43 {
    public static void main (String [] args){
        /* 43. Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
        *  - o total a pagar com desconto de 10%;
        *  - o valor de cada parcela, no parcelamento de 3x sem juros;
        *  - a comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto);
        *  - a comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total);
        * */

        Scanner teclado = new Scanner(System.in);

        double valorVenda;
        double totalComDesconto;
        double parcela3x;
        double comissaoComDesconto;
        double comissaoSemDesconto;

        System.out.print("Digite o valor da venda: R$");
        valorVenda = Double.parseDouble(teclado.nextLine());

        totalComDesconto = valorVenda * 0.90;
        parcela3x = valorVenda / 3;
        comissaoComDesconto = totalComDesconto * 0.05;
        comissaoSemDesconto = valorVenda * 0.05;

        System.out.printf("Valor com 10%%: R$%.2f.\n" +
                "Valor do parcelamento em 3x sem juros: 3 parcelas de R$%.2f\n" +
                "Comissão da venda a vista: R$%.2f\n" +
                "Comissão da venda parcelada: R$%.2f", totalComDesconto, parcela3x, comissaoComDesconto, comissaoSemDesconto);
    }
}
