package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio37 {
    public static void main (String [] args){
        //37. Faça um programa queleia o valor de um produto e imprima o valor com desconto, tendo em vista que o desconto foi de 12%

        Scanner teclado = new Scanner(System.in);

        double valorProduto;
        double desconto;
        double valorComDesconto;

        System.out.print("Digite o valor do produto: ");
        valorProduto = Double.parseDouble(teclado.nextLine());

        desconto = valorProduto * 0.12;
        valorComDesconto = valorProduto - desconto;

        System.out.printf("Valor original do produto: R$%.2f\n" +
                "Desconto de 12 %% = %.2f\n" +
                "Valor com desconto: R$%.2f.", valorProduto, desconto, valorComDesconto);


    }
}


