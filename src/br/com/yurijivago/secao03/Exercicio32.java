package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio32 {
    public static void main (String [] args){
        //32. Leia um número inteiro e imprima a soma do seu triplo com o antecessor do seu dobro

        Scanner teclado = new Scanner(System.in);

        int numero;
        int sucessorDoTriplo;
        int dobroDoAntecessor;
        int resultado;

        System.out.print("Digite um número inteiro: ");
        numero = Integer.parseInt(teclado.nextLine());

        sucessorDoTriplo = (3 * numero) + 1;
        dobroDoAntecessor = (numero * 2) - 1;

        resultado = sucessorDoTriplo + dobroDoAntecessor;

        System.out.printf("A soma do sucessor do triplo de %d com o antecessor do seu dobro é %d", numero, resultado);


    }
}
