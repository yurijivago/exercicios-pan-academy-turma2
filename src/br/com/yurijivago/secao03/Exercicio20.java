package br.com.yurijivago.secao03;

import java.util.Scanner;

public class Exercicio20 {
    public static void main (String [] args){
        //20. Leia um valor de massa em quilogramas e apresente-o convertido em libras
        /*
        * A fórmula de conversão é: L = K / 0,45, sendo K a massa em quilogramas e L em libras
        *
        * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a massa em quilogramas: ");
        double massaEmKg = Double.parseDouble(teclado.nextLine());
        double massaEmLibras = massaEmKg / 0.45;

        System.out.printf("%.2fKg corresponde a %.2f libras", massaEmKg, massaEmLibras);

    }
}
