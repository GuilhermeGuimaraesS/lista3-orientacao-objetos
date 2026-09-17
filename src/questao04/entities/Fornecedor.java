package questoes.src.questao04.entities;

import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.time.LocalDateTime;

public class Fornecedor {

    private UUID id;
    private String nome;
    private String cnpj;
    private LocalDateTime dataCadastro;

    public Fornecedor(String nome, String cnpj) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataCadastro = LocalDateTime.now();
    }

    public Fornecedor(String nome, String cnpj, LocalDateTime dataCadastro) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataCadastro = dataCadastro;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "id: " + id +
                "\nNome: " + nome +
                "\nCNPJ: " + cnpj +
                "\nData de Cadastro: " + dataCadastro.format(formato01) +
                "\n-----------------------------------------------------------";
    }
}
