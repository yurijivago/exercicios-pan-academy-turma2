package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio13 {
    public static void main (String [] args){
        //13. Leia uma distância em quilômetros e apresente-a convertida em milhas.
        /*
        * A fórmula de conversão é: M = K/1.61, sendo K a distância em quilômetros e M em milhas.
        * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite distância em milhas: ");
        double distaciaKm = Double.parseDouble(teclado.nextLine());
        double distanaiMilhas=  distaciaKm / 1.61;

        System.out.printf("%.2f milhas corresponde a %.2f km", distaciaKm, distanaiMilhas);

    }
}
