package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main (String [] args){
        //4. Leia um número real e imprima o resultado do quadrado desse número
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número real:");
        double numero = Double.parseDouble(teclado.nextLine());
        double quadrado = numero * numero;

        System.out.println(numero + " ao quadrado é " + quadrado);

    }
}
