package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio14 {
    public static void main (String [] args){
        //14. Leia um ângulo em graus e apresente-o convertido em radianos.
        /*
        * A fórmula de conversão é: R = G * pi / 180, sendo G o ângulo em graus e R em radianos e pi=3.14
        * */
        Scanner teclado = new Scanner(System.in);

        var pi = 3.14;

        System.out.print("Digite um ângulo em graus: ");
        double anguloEmGraus = Double.parseDouble(teclado.nextLine());
        double anguloEmRadianos=  anguloEmGraus * pi / 180;

        System.out.printf("%.2fº corresponde a %.2f radianos", anguloEmGraus, anguloEmRadianos);

    }
}
