package questoes.src.questao05;

import questoes.src.questao05.entities.Fornecedor;
import questoes.src.questao05.entities.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        ArrayList<Produto> produtosFornecidos = new ArrayList<>();
        Produto mouse = new Produto("123", "Mouse", 120);
        produtosFornecidos.add(mouse);
        Produto teclado = new Produto("234", "Teclado", 200);
        produtosFornecidos.add(teclado);

        Fornecedor fornecedor = new Fornecedor("Redragon", produtosFornecidos);
        fornecedor.listarProdutos();

        IO.println("Digite o código do produto que você quer remover: ");
        String codigo = entrada.nextLine();
        Produto produtoBuscado = fornecedor.buscarProduto(codigo);
        if(produtoBuscado == null){
            IO.println("Produto não encontrado!");
        } else {
            fornecedor.removerProduto(produtoBuscado);
        }
        IO.println("--------------------------------");
        fornecedor.listarProdutos();

        IO.println("Valor medio: R$" + fornecedor.calcularValorMedioProdutos());
        entrada.close();
    }
}
