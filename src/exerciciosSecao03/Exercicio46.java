package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio46 {
    public static void main (String [] args){
        /* 46. Faça um programa que leia um número inteiro positivo de três dígitos (de 100 a 999).
         * Gere outro número formado pelos dígitos invertidos do número lido. Exemplo
         * NumeroLido = 123
         * NumeroGerado = 321
         * */

        Scanner teclado = new Scanner(System.in);

        int numero;
        String numeral = "";


        System.out.print("Digite um número inteiro entre 100 e 999: ");
        numero = Integer.parseInt(teclado.nextLine());

        String auxiliar = Integer.toString(numero);

        for( int i = auxiliar.length(); i>0; i--){
            numeral += auxiliar.substring(i-1, i);
        }

        numero = Integer.parseInt(numeral);

        System.out.println(numero);

    }
}

