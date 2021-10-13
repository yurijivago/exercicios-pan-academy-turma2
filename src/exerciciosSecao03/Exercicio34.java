package exerciciosSecao03;


import java.util.Scanner;

public class Exercicio34 {
    public static void main (String [] args){
        //34. Leia o valor do raio de um círculo e calcule e imprima a área do circulo correspondente
        /*
         * A área do círculo é pi * raio², considere pi = 3.14592.
         */

        Scanner teclado = new Scanner(System.in);

        double raio;
        double area;
        double pi = 3.141592;

        System.out.print("Digite o raio do círculo: ");
        raio = Double.parseDouble(teclado.nextLine());

        area = pi * Math.pow(raio, 2);

        System.out.printf("A área do círclo cujo raio mede %.2f vale %.2f", raio, area);


    }
}
