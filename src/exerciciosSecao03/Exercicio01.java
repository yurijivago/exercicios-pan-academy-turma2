package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String [] args){
        //1. Faça um programa que leia um número inteiro e o imprima.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int numero = Integer.parseInt(teclado.nextLine());
        System.out.println("O número digitado foi: " + numero);

    }
}

