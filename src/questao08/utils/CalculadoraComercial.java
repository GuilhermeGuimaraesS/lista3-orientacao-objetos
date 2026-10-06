package questoes.src.questao08.utils;

public class CalculadoraComercial {

    public static final double PERCENTUAL_PADRAO = 0.15;

    public static double calcularDesconto(double preco){
        return (preco * PERCENTUAL_PADRAO);
    }

    public static double calcularDesconto(double preco, double percentual) {
        return (preco * (percentual / 100)) ;
    }


    public static double calcularDesconto(double preco, double percentual, int quantidade){
        return ((preco * (percentual / 100 ))  * quantidade);
    }
}
