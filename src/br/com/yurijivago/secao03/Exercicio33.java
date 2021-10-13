package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio33 {
    public static void main (String [] args){
        //33. Leia o tamanho do lado de um quadrado e imprima como resultado a sua área

        Scanner teclado = new Scanner(System.in);

        double lado;
        double area;

        System.out.print("Digite o lado do quadrado: ");
        lado = Double.parseDouble(teclado.nextLine());

        area = lado * lado; //outra forma, sem utilizar a classe Math

        System.out.printf("A área do quadrado cujo lado mede %.2f vale %.2f", lado, area);


    }
}
