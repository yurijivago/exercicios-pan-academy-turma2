package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio31 {
    public static void main (String [] args){
        //31. Leia um número inteiro e imprima o seu antecessor e o seu sucessor.

        Scanner teclado = new Scanner(System.in);

        int numero;
        int sucessor;
        int antecessor;

        System.out.print("Digite um número inteiro: ");
        numero = Integer.parseInt(teclado.nextLine());

        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.printf("%d \nAntecessor: %d\nSucessor: %d", numero, antecessor, sucessor);


    }
}
