package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio45 {
    public static void main (String [] args){
        /* 45. Faça um programa para converter uma letra maiúscula em letra minúscula.
         * Use a tabela ASCII para resolver o problema.
         * */

        Scanner teclado = new Scanner(System.in);

        String letra;
        char caractere;
        char caractereUpper;
        int caracASCII;

        System.out.print("Digite uma letra: ");
        letra = teclado.nextLine();

        caractere = letra.charAt(0);

        caracASCII = (int) caractere - 32;

        caractereUpper = (char) caracASCII;

        System.out.println(caractereUpper);

    }
}

