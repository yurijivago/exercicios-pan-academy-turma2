package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio18 {
    public static void main (String [] args){
        //18. Leia um valor de volume em metros cúbicos m³ e apresent-o convertido em litros.
        /*
         * A fórmula de conversão é: L = 1000 * M, sendo L o volume em litros e M o volume em metros cúbicos
         * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o volume em metros cúbicos: ");
        double volumeEmMetrosCubicos = Double.parseDouble(teclado.nextLine());
        double volumeEmLitros =  volumeEmMetrosCubicos * 1000;

        System.out.printf("%.2fm³ corresponde a %.2fl", volumeEmMetrosCubicos, volumeEmLitros);

    }
}
