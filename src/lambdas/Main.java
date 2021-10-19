package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main (String [] args){
        /*
        //Antes das expressões lambdas, faríamos assim para calcular o quadrado de um número
        Calculator calc = new Calculator() {
            @Override
            public void calculate(int x) {
                x*=x;
                System.out.println(x);
            }
        };
        calc.calculate(10);


        //Utilizando as expressões lambdas, teremos
        Calculator calc2 = e -> {
            e *= e;
            System.out.println(e);
        };
        calc2.calculate(10);

        //Utilizando expressões lambdas para calcular o dobro de um número
        calc2 = e -> System.out.println("Dobro: " + e*2);
        calc2.calculate(5);
        */


        //Utilizando os métodos adicionados à interface em virtude dos métodos default (a partir do Java 8 esse métodos podem ter impementação
        List<Integer> lista = Arrays.asList(4, 5, 2, 1, 0, 3);
        /*
        //Sem expressões lambdas
        System.out.println("Imprimindo os elementos sem utilizar expressões lambdas");
        for (Integer i: lista){
            System.out.println(i);
        }

        //Com expressões lambdas, podemos iterar nessa lista passando um Consumer<T> como parâmetro para o forEach()
        System.out.println("Imprimindo os elementos utilizando expressões lambdas");
        lista.forEach( e -> System.out.println(e));
         */

        /*
        lista.sort((x, y) -> x.compareTo(y));//ordenando de forma ascendente
        lista.forEach( e -> System.out.println(e));
        System.out.println("----------------------");
        lista.sort((x, y) -> -x.compareTo(y));//ordenando de forma descendente
        lista.forEach( e -> System.out.println(e));
         */

        /*
        lista.forEach( e -> System.out.println(e));
        System.out.println("----------------------");
        //UnaryOperator é herda de Function e serve para alterar o dado, porém mantendo o tipo.
        //Alterando cada elemeto da lista para o seu dobro
        lista.replaceAll( e -> e * 2);
        lista.forEach( e -> System.out.println(e));
         */

        /*
        //O removeIt remove um elemento se atendido um certo critério
        //Nesse caso não podemos usar o Array.asList pois ele não permite que os dados sejam alterados
        List<Integer> listaNova = new ArrayList<>();
        listaNova.add(4);
        listaNova.add(5);
        listaNova.add(2);
        listaNova.add(1);
        listaNova.add(0);
        listaNova.add(3);

        System.out.println("Lista inicial");
        listaNova.forEach( e -> System.out.print(e + " "));

        System.out.println("\nLista atualizada, sem os número ímpares");
        listaNova.removeIf( e -> e % 2 != 0);

        listaNova.forEach( e -> System.out.print(e + " "));
        */

        //Referências a métodos com expressões lambdas
//        List<String> nomes = Arrays.asList("Alfredo", "Joana", "Ricardo", "Marina");

//        System.out.println("Imprimindo utilizando expressões lambdas");
//        nomes.forEach(e -> System.out.print(e));
        /* Como já existe um método que recebe um parâmetro e o imprime, podemos utilizar a referência a esse método
        *  e suprimir a expressão lambda
        * */
//        System.out.println("\nImprimindo utilizando referência a métodos");
//        nomes.forEach(System.out::println);
        //Obs.: Só funciona se o método for compatível com a nossa expressão lambda

        //Alterando os nomes para maiúsculas
        //Com expressões lambdas
//        nomes.replaceAll(e -> e.toUpperCase(Locale.ROOT));
//        nomes.forEach(System.out::println);

        //Com referência a métodos
//        nomes.replaceAll(String::toUpperCase);
//        nomes.forEach(System.out::println);

        /* Não estamos limitados a métodos existentes no próprio Java. Podemos criar nossos próprios métodos
        *  e referenciá-los
        * */

        /*
        List<String> nomes = Arrays.asList("Alfredo", "Joana", "Ricardo", "Marina");
        //sem referenciar o método
        //nomes.replaceAll(e -> Main.intercalete(e));
        nomes.replaceAll(Main::intercalete);
        nomes.forEach(System.out::println);
        */
    }

    private static String intercalete(String s){
        char [] chars = s.toCharArray();

        boolean lowerCase = true;
        StringBuilder sb = new StringBuilder();
        for (char c : chars){
            if(lowerCase) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
            lowerCase = !lowerCase;
        }
        return sb.toString();
        //9:05
    }
}
