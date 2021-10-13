package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio15 {
    public static void main (String [] args){
        //15. Leia um ângulo em radianos e apresente-o convertido em graus.
        /*
        * A fórmula de conversão é: G = R * 180 / pi, sendo G o ângulo em graus e R em radianos e pi=3.14
        * */
        Scanner teclado = new Scanner(System.in);

        var pi = 3.14;

        System.out.print("Digite um ângulo em radianos: ");
        double anguloEmRadianos = Double.parseDouble(teclado.nextLine());
        double anguloEmGraus=  anguloEmRadianos * 180 / pi;

        System.out.printf("%.2f radianos corresponde a %.2fº", anguloEmRadianos, anguloEmGraus);

    }
}
