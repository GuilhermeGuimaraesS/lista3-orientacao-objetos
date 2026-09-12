package questoes.src.questao02.entities;

import java.time.LocalDate;

public class Produto {
    private String codigo;
    private String nome;
    private Double preco;
    private LocalDate dataCadastro;

    public Produto(String codigo, String nome, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.dataCadastro = LocalDate.now();
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    private void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    private void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "-----------------------------------------" +
                "\nCodigo: " + codigo +
                "\nNome: " + nome +
                "\nPreco: " + String.format("R$%.2f ", preco) +
                "\nData de cadastro: " + dataCadastro;
    }

}