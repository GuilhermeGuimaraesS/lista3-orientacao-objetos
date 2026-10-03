package questoes.src.questao07.entities;

import java.util.ArrayList;

public class Departamento {

    private String nome;
    private String codigo;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.funcionarios = null;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void contratarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios(){
        for (Funcionario funcionario : funcionarios){
            IO.println(funcionario.toString());
        }
    }

    // Contratar, listar, calcular, func com maior salario, total de func admitidos
    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

}
