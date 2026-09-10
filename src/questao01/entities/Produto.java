    /*Crie uma classe Produto com os atributos privados codigo, nome, preco e quantidadeEstoque.
    Implemente um construtor para inicializar todos os atributos e outro construtor que receba apenas codigo,
    nome e preco, iniciando a quantidade em estoque com zero. Crie um vetor com 5 produtos e utilize um for
    para exibir todos os produtos, calcular o valor de cada item em estoque e o valor total do estoque.*/
package questoes.src.questao01.entities;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String codigo, String nome, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
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

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    private void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    @Override
    public String toString() {
        return "-----------------------------------------" +
                "\nCodigo: " + codigo +
                "\nNome: " + nome +
                "\nPreco: R$" + preco +
                "\nQuantidadeEmEstoque: " + quantidadeEmEstoque;
    }
}
