package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main (String [] args){
        //9. Leia uma temperatura em graus Celsius e apresente-a convertida dem graus Kelvin.
        /*
        * A fórmula de conversão é: K = C + 273.15, sendo C a temperatura em Celsius
        * e K a temperatura em Kelvin
        * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºC: ");
        double temperaturaEmCelsius = Double.parseDouble(teclado.nextLine());
        double temperaturaEmKelvin=  temperaturaEmCelsius + 273.15;

        System.out.printf("%.2fºC corresponde a %.2fºK", temperaturaEmCelsius, temperaturaEmKelvin);

    }
}
