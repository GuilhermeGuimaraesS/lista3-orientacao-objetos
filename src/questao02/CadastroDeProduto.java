
import questoes.src.questao02.entities.Produto;

static void main(){

    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    IO.println("=======================================");
    IO.println("            LOJA DEVFORCE");
    IO.println("=======================================");

    ArrayList<Produto> estoque = new ArrayList<>();

    IO.println("Quantos produtos serão cadastrados? ");
    int quantidadeDeProdutos = entrada.nextInt();
    entrada.nextLine();
    IO.println("CADASTRO DE PRODUTO");
    for (int indice = 0; indice < quantidadeDeProdutos; indice++){
        IO.println("Produto #"+(indice + 1));
        IO.println("Código: ");
        String codigo = entrada.nextLine();
        IO.println("nome: ");
        String nome = entrada.nextLine();
        IO.println("preço ");
        double preco = entrada.nextDouble();
        entrada.nextLine();

        Produto novoProduto = new Produto(codigo, nome, preco);
        estoque.add((novoProduto));
    }

    IO.println("-----------------------------------------");
    IO.println("Produtos cadastrados");
    for (Produto produto : estoque ){
        IO.println(produto.toString());
    }
    IO.println("=========================================");
    IO.println("Quantidade de produtos cadastrados: " + quantidadeDeProdutos);
    IO.println("=========================================");

    IO.println();
    IO.println("-----------------------------------------");
    IO.println("Produto mais caro");
    double maiorPreco = 0;
    Produto produtoMaisCaro = null;
    for (Produto produto : estoque ){
        if (produto.getPreco() > maiorPreco){
            maiorPreco = produto.getPreco();
            produtoMaisCaro = produto;
        }
    }

    IO.println(produtoMaisCaro.toString());

    IO.println();
    IO.println("-----------------------------------------");
    IO.println("Produtos que custam mais de R$100.00");
    for (Produto produto : estoque ){
        if (produto.getPreco() > 100){
            IO.println(produto.toString());
        }
    }

    entrada.close();

}

