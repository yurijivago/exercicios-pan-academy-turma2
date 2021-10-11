package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio08 {
    public static void main (String [] args){
        //8. Leia uma temperatura em graus Kelvin e apresente-a convertida dem graus Celsius.
        /*
        * A fórmula de conversão é: C = K - 273.15, sendo C a temperatura em Celsius
        * e K a temperatura em Kelvin
        * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em K: ");
        double temperaturaEmKelvin = Double.parseDouble(teclado.nextLine());
        double temperaturaEmCelsius=  temperaturaEmKelvin - 273.15;

        System.out.printf("%.2fK corresponde a %.2fºC", temperaturaEmKelvin, temperaturaEmCelsius);

    }
}
