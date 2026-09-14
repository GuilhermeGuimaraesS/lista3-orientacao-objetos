package questoes.src.questao03;

import questoes.src.questao03.entities.ProdutoPerecivel;
import questoes.src.questao03.util.VerificarValidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AnaliseDeEstoque {

    static void main(String [] args){

        LocalDate dataDeHoje = LocalDate.now();
        Scanner entrada = new Scanner(System.in);
        ArrayList<ProdutoPerecivel> listaDeProdutos = new ArrayList<>();

        IO.println("=======================================================");
        IO.println("                Analise de Estoque");
        IO.println("=======================================================");

        IO.println("Quantos produtos serão analisados? ");
        int totalDeProdutos = entrada.nextInt();
        entrada.nextLine();

        for (int indice = 0; indice < totalDeProdutos; indice++){
            IO.println("Digite o nome do produto #" + (indice + 1) + ":" );
            String nome = entrada.nextLine();
            IO.println("Digite o preço do produto: ");
            double preco = entrada.nextDouble();
            IO.println("Data de Fabricação");
            IO.println("Dia(dd): ");
            int diaFabricacao = entrada.nextInt();
            IO.println("Mês(mm): ");
            int mesFabricacao = entrada.nextInt();
            IO.println("Ano(yyyy): ");
            int anoFabricacao = entrada.nextInt();

            IO.println("-------------------------------");
            IO.println("Data de Validade");
            IO.println("Dia(dd): ");
            int diaVencimento = entrada.nextInt();
            IO.println("Mês(mm): ");
            int mesVencimento = entrada.nextInt();
            IO.println("Ano(yyyy): ");
            int anoVencimento = entrada.nextInt();
            entrada.nextLine();


            LocalDate dataDeFabricacao = LocalDate.of(anoFabricacao, mesFabricacao, diaFabricacao);
            LocalDate dataDeVencimento = LocalDate.of(anoVencimento, mesVencimento, diaVencimento);

            ProdutoPerecivel novoProduto = new ProdutoPerecivel(nome, preco, dataDeFabricacao, dataDeVencimento);
            listaDeProdutos.add(novoProduto);

        }

        for (ProdutoPerecivel produto : listaDeProdutos){
            IO.println(produto.toString());
            boolean validadeProduto = VerificarValidade.compararData(produto.getDataVencimento());
            if (validadeProduto) {
                IO.println("PRODUTO VÁLIDO");
            } else {
                IO.println("PRODUTO VENCIDO");
            }
            IO.println("-------------------------------------------------------");
        }

        entrada.close();
    }

}
