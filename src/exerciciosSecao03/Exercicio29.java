package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio29 {
    public static void main (String [] args){
        //29. Leia quatro notas, calcule a média aritmética e imprima o resultado

        Scanner teclado = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.print("Digite a primera nota: ");
        nota1 = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite a segunda nota: ");
        nota2 = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite a terceira nota: ");
        nota3 = Double.parseDouble(teclado.nextLine());

        System.out.print("Digite a quarta nota: ");
        nota4 = Double.parseDouble(teclado.nextLine());

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média das notas %.2f, %.2f, %.2f e %.2f é %.2f ", nota1, nota2, nota3, nota4, media);


    }
}


