package questoes.src.questao06.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {

    private String nome;
    private final String CNPJ;
    private LocalDate dataFundacao;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nome, String CNPJ, LocalDate dataFundacao, ArrayList<Departamento> departamentos) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.departamentos = departamentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }


    public void registrarDepartamento(Departamento novoDepartamento){
        departamentos.add(novoDepartamento);
    }

    public void listarDepartamentos(){
        for (Departamento departamento : departamentos){
            IO.println(departamento.toString());
            IO.println("----------------------------------------");
        }
    }

    public Departamento buscarDepartamento(String codigo){
        for (Departamento departamento : departamentos){
            if (codigo.equals(departamento.getCodigo())){
                return departamento;
            }
        }
        return null;
    }

    public int quantidadeDeDepartamentos(){
        return departamentos.size();
    }

}
