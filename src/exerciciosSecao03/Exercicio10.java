package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main (String [] args){
        //10. Leia a velocidade em km/h (quilômetros por hora) e apresente-a em m/s (metros por segundo)
        /*
         * A fórmula de conversão é: M = K/3.6, sendo K a velocidade em km/h e M em m/s
         * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a velocidade em km/h: ");
        double velocidadekmh = Double.parseDouble(teclado.nextLine());
        double velocidadems=  velocidadekmh/3.6;

        System.out.printf("%.2fkm/h corresponde a %.2fm/s", velocidadekmh, velocidadems);

    }
}
