package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio27 {
    public static void main (String [] args){
        //27. Leia um valor de área em hectares e apresente-o convertido em metros quadrados m².
        /*
         * A fórmula de conversão é: M = H * 10000, sendo M a área em metros H e A a área em hectares.
         *
         * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a área em hectares: ");
        double areaEmHectares = Double.parseDouble(teclado.nextLine());
        double areaMetrosQuadrados = areaEmHectares * 10000;

        System.out.printf("%.2f hectares corresponde a %.2fm²", areaEmHectares, areaMetrosQuadrados);

    }
}

