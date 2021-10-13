package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio16 {
    public static void main (String [] args){
        //16. Leia um valor de comprimento polegadas e apresenteo convertido em centímetro
        /*
        * A fórmula de conversão é: C = P * 2,54, sendo C o comprimeno em centímetros e P em polegadas
        * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma medida em polegadas: ");
        double medidaEmPolegadas = Double.parseDouble(teclado.nextLine());
        double medidaEmCm =  medidaEmPolegadas * 2.54;

        System.out.printf("%.2f polegadas corresponde a %.2fcm", medidaEmPolegadas, medidaEmCm);

    }
}
