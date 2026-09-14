package questoes.src.questao03.entities;

import java.time.LocalDate;

public class ProdutoPerecivel {

    private String nome;
    private double preco;
    private LocalDate dataFabricacao;
    private LocalDate dataVencimento;

    public ProdutoPerecivel(String nome, double preco, LocalDate dataFabricacao, LocalDate dataVencimento) {
        this.nome = nome;
        this.preco = preco;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nPreco: " + String.format("R$%.2f", preco) +
                "\nData de Fabricacao: " + dataFabricacao +
                "\nData de Validade: " + dataVencimento;
    }

}
