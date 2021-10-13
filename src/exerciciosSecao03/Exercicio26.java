package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio26 {
    public static void main (String [] args){
        //26. Leia um valor de área em metros quadrados m² e apresente-o convertido em hectares.
        /*
         * A fórmula de conversão é: H = M * 0.0001, sendo M a área em metros H e A a área em hectares.
         *
         * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a área em metros quadrados: ");
        double areaMetrosQuadrados = Double.parseDouble(teclado.nextLine());
        double areaEmHectares = areaMetrosQuadrados * 0.0001;

        System.out.printf("%.2fm² corresponde a %.2f hectares", areaMetrosQuadrados, areaEmHectares);

    }
}


