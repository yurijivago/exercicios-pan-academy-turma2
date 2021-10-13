package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio30 {
    public static void main (String [] args){
        //30. Leia um valor real e a cotação do dólar. Em seguida, imprima o valor correspondente em dólares.

        Scanner teclado = new Scanner(System.in);

        double valorReal;
        double dolarAtual;
        double valorDolar;

        System.out.print("Digite o valor em reais: R$");
        valorReal = Double.parseDouble(teclado.nextLine());

        System.out.print("Qual a cotação do dólar hoje? R$");
        dolarAtual = Double.parseDouble(teclado.nextLine());

        valorDolar = valorReal / dolarAtual;

        System.out.printf("R$%.2f com a cotação atual de %f está valendo U$%.2f", valorReal, dolarAtual, valorDolar);


    }
}
