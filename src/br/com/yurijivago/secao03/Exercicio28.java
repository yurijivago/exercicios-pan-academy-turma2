package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio28 {
    public static void main (String [] args){
        //28. Faça a letura de três valores e apresente como resuldo a soma dos quadrados dos três valores lidos

        Scanner teclado = new Scanner(System.in);

        double valor1;
        double valor2;
        double valor3;

        System.out.print("Digite o primero valor: ");
        valor1 = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite o segundo valor: ");
        valor2 = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite o terceiro valor: ");
        valor3 = Double.parseDouble(teclado.nextLine());

        double somaDoQuadrados = (Math.pow(valor1, 2) + Math.pow(valor2, 2) + Math.pow(valor3, 2));

        System.out.printf("A soma dos quadrados de %.2f, %.2f e %.2f é %.2f", valor1, valor2, valor3, somaDoQuadrados);


    }
}
