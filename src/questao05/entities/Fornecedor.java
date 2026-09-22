package questoes.src.questao05.entities;

import java.util.ArrayList;
import java.util.UUID;

public class Fornecedor {

    private UUID id;
    private String nome;
    private ArrayList<Produto> produtosFornecidos;

    public Fornecedor(String nome, ArrayList<Produto> produtosFornecidos) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.produtosFornecidos = produtosFornecidos;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Produto> getProdutosFornecidos() {
        return produtosFornecidos;
    }

    public void adicionarProduto(Produto produto){
        produtosFornecidos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtosFornecidos.remove(produto);
    }

    public void listarProdutos(){
        for (Produto produto : produtosFornecidos){
            IO.println("Código: " + produto.getCodigo() +
                    "\nNome: " + produto.getNome() +
                    "\nValor: R$" + produto.getValor() +
                    "\n--------------------------------"
            );
        }
    }

    public Produto buscarProduto(String codigo){
        for (Produto produto : produtosFornecidos){
            if (produto.getCodigo().equals(codigo)){
                return produto;
            }
        }
        return null;
    }

    public double calcularValorMedioProdutos(){
        double soma = 0;
        for (Produto produto : produtosFornecidos){
            soma += produto.getValor();
        }
        return soma / produtosFornecidos.size();
    }

}
