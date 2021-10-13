package br.com.yurijivago.secao03;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio39 {
    public static void main (String [] args){
        //39. A importância de R$780.000,00 será dividida entre três ganhadores de um concurso.
        /*
        * Sendo que da quantia total:
        *   - O primeiro ganhador receberá 46%;
        *   - O segundo receberá 32%
        *   - O terceiro receberá o restante;
        * */

        Locale localeBR = new Locale("pt", "BR");
        NumberFormat valorMonetario = NumberFormat.getCurrencyInstance(localeBR);
        /*
        * O método getCurrencyInstace() nos retorna um objeto paraformatarmos valores monetários com base n idioma
        * e localiadde informados (o nosso localeBR (Locale).
        * Agora poderemos formatar os nossos valores utilizando valorMonetario, que nos retornará uma String.
        * */

        double premio = 780000.00;
        double primeiroGanhador = premio * 0.46;
        double segundoGanhador = premio * 0.32;
        double terceiroGanhador = premio - primeiroGanhador - segundoGanhador;

        System.out.printf("Primeiro ganhador: %s\n" +
                "Segundo ganhador: %s\n" +
                "Terceiro ganhador: %s.", valorMonetario.format(primeiroGanhador),
                valorMonetario.format(segundoGanhador),
                valorMonetario.format(terceiroGanhador));


    }
}
