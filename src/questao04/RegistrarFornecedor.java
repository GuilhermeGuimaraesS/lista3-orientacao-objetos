package questoes.src.questao04;

import questoes.src.questao04.entities.Fornecedor;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class RegistrarFornecedor {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        IO.println("===========================================================");
        IO.println("              REGISTRO DE FORNECEDORES");
        IO.println("===========================================================");

        IO.println("Quantos fornecedores serão cadastrados? ");
        int totalFornecedores = entrada.nextInt();
        entrada.nextLine();

        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        Fornecedor fornecedor = null;
        for (int indice = 0; indice < totalFornecedores; indice++) {
            IO.println("Nome do fornecedor #" + (indice + 1) + ": ");
            String nome = entrada.nextLine();
            IO.println("CNPJ: ");
            String cnpj = entrada.nextLine();
            IO.println("-----------------------------------------------------------");
            IO.println("Fornecedor novo ou antigo? ");
            String tipoFornecedor = entrada.nextLine();

            if (tipoFornecedor.equalsIgnoreCase("novo")) {
                fornecedor = new Fornecedor(nome, cnpj);
            } else if (tipoFornecedor.equalsIgnoreCase("antigo")){
                IO.println("Data e hora de cadastro");
                IO.println("Dia: ");
                int dia = entrada.nextInt();
                IO.println("Mes: ");
                int mes = entrada.nextInt();
                IO.println("Ano: ");
                int ano = entrada.nextInt();
                IO.println("Hora: ");
                int hora = entrada.nextInt();
                IO.println("Minuto: ");
                int minuto = entrada.nextInt();
                LocalDateTime dataCadastro = LocalDateTime.of(ano, mes, dia, hora, minuto);
                fornecedor = new Fornecedor(nome, cnpj, dataCadastro);
                entrada.nextLine();
            }
            fornecedores.add(fornecedor);
        }

        IO.println("===========================================================");
        IO.println("              FORNECEDORES CADASTRADOS");
        IO.println("===========================================================");
        for (Fornecedor fornecedorCadastrado : fornecedores){
            IO.println(fornecedorCadastrado.toString());
        }

        entrada.close();
    }

}
