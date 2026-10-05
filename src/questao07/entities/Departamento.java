package questoes.src.questao07.entities;

import java.util.ArrayList;

public class Departamento {

    private String nome;
    private String codigo;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.funcionarios = new ArrayList<>();
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

    public void contratarFuncionario(Funcionario funcionarioNovo){
        funcionarios.add(funcionarioNovo);
    }

    public void resgistrarFuncionarioAntigo(Funcionario funcionarioAntigo){
        funcionarios.add(funcionarioAntigo);
    }

    public void listarFuncionarios(){
        for (Funcionario funcionario : funcionarios){
            IO.println(funcionario.toString());
        }
    }

    public double calcularFolhaSalarial(){
        double folhaSalarial = 0;
        for (Funcionario funcionario : funcionarios){
            folhaSalarial += funcionario.getSalario();
        }
        return folhaSalarial;
    }

    public Funcionario funcionarioComMaiorSalario(){
        Funcionario funcionarioComMaiorSalario = new Funcionario();
        for (Funcionario funcionario : funcionarios){
            if (funcionario.getSalario() > funcionarioComMaiorSalario.getSalario()){
                funcionarioComMaiorSalario = funcionario;
            }
        }
        return funcionarioComMaiorSalario;
    }

    public int totalDeFuncionariosAdmitidos(int anoDeAdmissao){
        int totalDeFuncionarios = 0;
        for (Funcionario funcionario : funcionarios){
            if (funcionario.getDataAdmissao().getYear() == anoDeAdmissao){
                totalDeFuncionarios++;
            }
        }
        return totalDeFuncionarios;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

}
