package exerciciosSecao03;

import java.util.Scanner;

public class Exercicio48 {
    public static void main (String [] args){
        /* 48. Leia um número inteiro em segundos, e imprima-o em horas, minutos e segundos
         * */

        Scanner teclado = new Scanner(System.in);

        int numero;
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int auxiliar = 0;

        System.out.print("Digite os segundos: ");
        numero = Integer.parseInt(teclado.nextLine());

        segundos = numero % 60;
        auxiliar = numero / 60;
        if(auxiliar>0){
            minutos = auxiliar % 60;
            auxiliar = auxiliar / 60;
        }
        if(auxiliar>0){
            horas = auxiliar % 60;
        }

        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        System.out.printf("%d horas, %d minutos e %d segundos", horas, minutos, segundos);




    }
}

