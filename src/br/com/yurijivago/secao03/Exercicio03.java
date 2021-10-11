package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String [] args){
        //3. Peça para o usuário digitar três valores inteiros e imprima a soma deles.
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int numero;
        for (int i = 0; i <3; i++){
            System.out.print("Digite um número inteiro:");
             numero = Integer.parseInt(teclado.nextLine());
            soma += numero;
        }

        System.out.println("A soma é: " + soma);

    }
}
