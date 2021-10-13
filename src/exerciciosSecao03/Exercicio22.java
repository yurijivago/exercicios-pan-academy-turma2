package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio22 {
    public static void main (String [] args){
        //22. Leia um valor de comprimento em jardas e apresente-po convertido em metros.
        /*
         * A fórmula de conversão é: M = 0.91 * J, sendo J o comprimento em jardas e M o comprimento em metros
         *
         * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o comprimento em jardas: ");
        double comprimentoEmJardas = Double.parseDouble(teclado.nextLine());
        double comprimentoEmM = comprimentoEmJardas * 0.91;

        System.out.printf("%.2f jardas corresponde a %.2f metros", comprimentoEmJardas, comprimentoEmM);

    }
}

