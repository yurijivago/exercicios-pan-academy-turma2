package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio23 {
    public static void main (String [] args){
        //23. Leia um valor de comprimento em metros e apresente-o convertido em jardas.
        /*
        * A fórmula de conversão é: J = M / 0.91, sendo J o comprimento em jardas e M o comprimento em metros
        *
        * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o comprimento em metros: ");
        double comprimentoEmM = Double.parseDouble(teclado.nextLine());
        double comprimentoEmJardas = comprimentoEmM / 0.91;

        System.out.printf("%.2f metros corresponde a %.2f jardas", comprimentoEmM, comprimentoEmJardas);

    }
}
