package questoes.src.questao05.entities;

public class Produto {

    private String codigo;
    private String nome;
    private double valor;

    public Produto(String codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }
}
