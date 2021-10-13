package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio35 {
    public static void main (String [] args){
        //35. Sejam a e b os catetos de um triângul, onde a hipotesa é obtida pela equação:
        /*
         * hipotensa = √(a² + b²)
         * Faça um programa que receba a os valores de a e b e calcule o valor da hipotenusa
         * através da equação. Imprima o resultado dessa operação
         */

        Scanner teclado = new Scanner(System.in);

        double catetoA;
        double catetoB;
        double hipotenusa;

        System.out.print("Digite o valor do cateto A: ");
        catetoA = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite o valor do cateto B: ");
        catetoB = Double.parseDouble(teclado.nextLine());

        hipotenusa = Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoB, 2)));

        System.out.printf("A hipotenusa do triângulo cujos catetos valem %.2f e %.2f é %.2f", catetoA,catetoB, hipotenusa);


    }
}
