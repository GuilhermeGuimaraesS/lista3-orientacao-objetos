package questoes.src.questao08;

import questoes.src.questao08.utils.CalculadoraComercial;

public class Main {

    public static void main(String [] args){
        IO.println("Desconto: R$" + CalculadoraComercial.calcularDesconto(50));
        IO.println("---------------------------------------------------------------------");
        IO.println("Desconto: R$" + CalculadoraComercial.calcularDesconto(50, 25));
        IO.println("---------------------------------------------------------------------");
        IO.println("Desconto: R$" + CalculadoraComercial.calcularDesconto(50, 10, 5));
        IO.println("---------------------------------------------------------------------");
    }

}
