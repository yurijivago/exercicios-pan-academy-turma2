package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio12 {
    public static void main (String [] args){
        //12. Leia uma distância em milhas e apresente-a em quilômetros.
        /*
         * A fórmula de conversão é: K = 1,61 * M, sendo K a distância em quilômetros e M em milhas.
         * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite distância em milhas: ");
        double distanaiMilhas = Double.parseDouble(teclado.nextLine());
        double distaciaKm=  distanaiMilhas * 1.61;

        System.out.printf("%.2f milhas corresponde a %.2f km", distanaiMilhas, distaciaKm);

    }
}

