package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio25 {
    public static void main (String [] args){
        //25. Leia um valor de área em acres e apresente-o convertido em metros quadrados m².
        /*
         * A fórmula de conversão é: M = A * 4048.58, sendo M a área em metros quadrados e A a área em acres.
         *
         * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a área em acres: ");
        double areaEmAcres = Double.parseDouble(teclado.nextLine());
        double areaMetrosQuadrados = areaEmAcres * 4048.58;

        System.out.printf("%.2f acres corresponde a %.2fm²", areaEmAcres, areaMetrosQuadrados);

    }
}
