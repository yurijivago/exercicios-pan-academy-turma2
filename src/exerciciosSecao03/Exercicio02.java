package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String [] args){
        //2. Faça um programa que leia um número real e o imprima.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número Real:");
        double numero = Double.parseDouble(teclado.nextLine());
        System.out.println("O número digitado foi: " + numero);

    }
}
