package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio24 {
    public static void main (String [] args){
        //24. Leia um valor de área em metros quadrados m² e apresente-o convertido em acres.
        /*
        * A fórmula de conversão é: A = M * 0.000247, sendo M a área em metros quadrados e A a área em acres.
        *
        * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a área em metros quadrados: ");
        double areaMetrosQuadrados = Double.parseDouble(teclado.nextLine());
        double areaEmAcres = areaMetrosQuadrados * 0.000247;

        System.out.printf("%.2fm² corresponde a %.2f acres", areaMetrosQuadrados, areaEmAcres);

    }
}
