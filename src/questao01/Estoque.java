import questoes.src.questao01.entities.Produto;

static void main(){

    Scanner entrada = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    IO.println("=======================================");
    IO.println("            LOJA DEVFORCE");
    IO.println("=======================================");

    List<Produto> estoque = new ArrayList<>();

    IO.println("CADASTRO DE PRODUTO");
    for(int indice = 0; indice < 5; indice++){
        IO.println("Produto #"+(indice + 1));
        IO.println("Código: ");
        String codigo = entrada.nextLine();
        IO.println("nome: ");
        String nome = entrada.nextLine();
        IO.println("preço ");
        double preco = entrada.nextDouble();

        IO.println("Deseja cadastrar estoque? (s/n)");
        entrada.nextLine();
        String decisao = entrada.nextLine();
        if (decisao.equalsIgnoreCase("n")){
            Produto novoProduto = new Produto(codigo, nome, preco);
            estoque.add(novoProduto);
        } else{

            IO.println("Quantidade em estoque: ");
            int quantidadeEmEstoque = entrada.nextInt();
            entrada.nextLine();
            Produto novoProduto = new Produto(codigo, nome, preco, quantidadeEmEstoque);
            estoque.add(novoProduto);
        }
    }

    double valorTotalEstoque = 0;
    for (Produto produto : estoque ){
        valorTotalEstoque += (produto.getPreco() * produto.getQuantidadeEmEstoque());
        IO.println(produto.toString());
    }

    IO.println("O valor total do estoque é R$" + df.format(valorTotalEstoque));

    entrada.close();

}
