package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio07 {
    public static void main (String [] args){
        //7. Leia uma temperatura em graus Fahrenheit e apresente-a convertida dem graus Celsius.
        /*
         * A fórmula de conversão é: C = 5.0 * (F - 32.0)/9.0, sendo C a temperatura em Celsius
         * e F a temperatura em Fahrenheit
         * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em ºF: ");
        double temperaturaEmFahrenheit = Double.parseDouble(teclado.nextLine());
        double  temperaturaEmCelsius =  5.0 * (temperaturaEmFahrenheit - 32.0)/9.0;

        System.out.println(temperaturaEmFahrenheit + "ºF corresponde a " + temperaturaEmCelsius + "ºC");

    }
}
