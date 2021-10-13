package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio47 {
    public static void main (String [] args){
        /* 47. Leia um número inteiro de 4 dígitos (entre 1000 e 9999) e imprima 1 dígito por linha
         * */

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro entre 1000 e 9999: ");
        numero = Integer.parseInt(teclado.nextLine());

        String auxiliar = Integer.toString(numero);

        for( int i = 0; i < auxiliar.length(); i++){
            System.out.println(auxiliar.substring(i,i+1));
        }

    }
}

