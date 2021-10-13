package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String [] args){
        //5. Leia um número real e imprima a quinta parte desse número
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número real:");
        double numero = Double.parseDouble(teclado.nextLine());
        double quintaParte = numero/5;

        System.out.println("A 5ª parte de " + numero + " é " + quintaParte);

    }
}
