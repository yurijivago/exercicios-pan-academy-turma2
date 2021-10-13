package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio17 {
    public static void main (String [] args){
        //17. Leia um valor de comprimento centímetro e apresenteo convertido em polegadas
        /*
         * A fórmula de conversão é: P = C / 2,54, sendo C o comprimeno em centímetros e P em polegadas
         * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma medida em centímetros: ");
        double medidaEmCm = Double.parseDouble(teclado.nextLine());
        double medidaEmPolegadas =  medidaEmCm / 2.54;

        System.out.printf("%.2fcm corresponde a %.2f polegadas", medidaEmCm, medidaEmPolegadas);

    }
}

