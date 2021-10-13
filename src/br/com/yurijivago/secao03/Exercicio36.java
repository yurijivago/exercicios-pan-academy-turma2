package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio36 {
    public static void main (String [] args){
        //36. Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro.
        /*
         * O volume de um cilindro circular é calculado por meio da seguinte fórmula:
         * V = pi * raio² * altura, onde pi = 3.141592.
         */

        Scanner teclado = new Scanner(System.in);

        double altura;
        double raio;
        double volume;
        double pi = 3.141592;

        System.out.print("Digite o valor da altura do cilindo circular: ");
        altura = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite o valor do raio do cilindo circular: ");
        raio = Double.parseDouble(teclado.nextLine());

        volume = pi * Math.pow(raio, 2) * altura;

        System.out.printf("O volume do cilindro circular cuja altura vale %.2f e o raio vale %.2f é %.2f", altura, raio, volume);


    }
}
