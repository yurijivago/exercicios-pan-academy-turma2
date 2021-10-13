package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio21 {
    public static void main (String [] args){
        //21. Leia um valor de massa em libras e apresente-o convertido em quilogramas
        /*
         * A fórmula de conversão é: K = L * 0,45, sendo K a massa em quilogramas e L em libras
         *
         * * */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a massa em libras: ");
        double massaEmLibras = Double.parseDouble(teclado.nextLine());
        double massaEmKg = massaEmLibras * 0.45;

        System.out.printf("%.2f libras corresponde a %.2fKg", massaEmLibras, massaEmKg);

    }
}

