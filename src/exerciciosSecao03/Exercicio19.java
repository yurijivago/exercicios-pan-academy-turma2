package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio19 {
    public static void main (String [] args){
        //19. Leia um valor de volume em litros e apresent-o convertido em metros cúbicos m³.
        /*
         * A fórmula de conversão é: M = L / 1000, sendo L o volume em litros e M o volume em metros cúbicos
         * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o volume em litros: ");
        double volumeEmLitros = Double.parseDouble(teclado.nextLine());
        double volumeEmMetrosCubicos = volumeEmLitros / 1000;

        System.out.printf("%.2fl corresponde a %.2fm³", volumeEmLitros, volumeEmMetrosCubicos);

    }
}


