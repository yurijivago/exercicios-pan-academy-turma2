package lambdas;

public class Pessoa {
    private int idade;

    public Pessoa(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcularFator(){
        /* A possibilidade que temos de, dentro de uma expressão lambda referenciar variáveis que estão definidas fora,
         *  dessa expressão é o recurso Closure. E 'idade', presente na expressão abaixo, não faz parte do corpo da
         *  expressão, mas foi definida como atributo da classe.
         *  No entanto, quando temos referência a uma variável que está no mesmo escopo da expressão lambda, essa
         *  variável não poderá ser alterá-la. Ela poderá ser definida como final (o que faria com que não fosse possível
         *  essa alteração) ou de fato tratá-la como final, ou seja, não alterar seu valor.
         *  É o que acontece com a variável 'ajuste'.
         *  Já a vairável 'idade' poderá ter seu valor alterado.
         * */
        double ajuste = 0.4;
        FactorCalculator calc = () -> idade * 10 / 2 * ajuste;
        //A linha abaixo provoca um erro pois o valor de 'ajuste' não pode ser alterado.
        //ajuste = 0.2;

        /* Não temos esse problema com 'idade' pois trata-se de um atributo definido fora do escopo, no caso o método
        *  onde a expressão está inserida
        * */
        idade = 10;
        return calc.calculate();
    }
}
