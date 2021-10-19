package lambdas;

public class MainClosure {
    public static void main (String [] args){
        Pessoa p = new Pessoa(28);
        double fator = p.calcularFator();
        System.out.println(fator);
    }
}
