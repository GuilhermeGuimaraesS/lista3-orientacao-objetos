package questoes.src.questao07.entities;

import java.time.LocalDate;

public class Funcionario {

    private String matricula;
    private String nome;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = LocalDate.now();
    }

    public Funcionario(String matricula, String nome, double salario, LocalDate dataAdmissao) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

}
