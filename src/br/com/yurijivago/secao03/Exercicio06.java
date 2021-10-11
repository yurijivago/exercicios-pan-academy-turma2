package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main (String [] args){
        //6. Leia uma temperatura em graus Celsius e apresente-a convertida dem graus Fahrenheit.
        /*
        * A fórmula de conversão é: F = C * (9.0/5.0) + 32.0, sendo F a temperatura em Fahrenheit
        * e C a temperatura em Celsius
        * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºC: ");
        double temperaturaEmCelsius = Double.parseDouble(teclado.nextLine());
        double temperaturaEmFahrenheit = temperaturaEmCelsius * (9.0/5.0) + 32.0;

        System.out.println(temperaturaEmCelsius + "ºC corresponde a " + temperaturaEmFahrenheit + "ºF");

    }
}
