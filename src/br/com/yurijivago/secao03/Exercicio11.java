package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio11 {
    public static void main (String [] args){
        //11. Leia a velocidade em m/s (metros por segundo) e apresente-a em km/h (quilômetros por hora)
        /*
        * A fórmula de conversão é: K = M * 3.6, sendo K a velocidade em km/h e M em m/s
        * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double velocidadems = Double.parseDouble(teclado.nextLine());
        double velocidadekmh=  velocidadems * 3.6;

        System.out.printf("%.2fm/s corresponde a %.2fkm/h", velocidadems, velocidadekmh);

    }
}
