package exercicios.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pedro Lôbo Nascimento
 */
public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        for (Produto produto : estoqueProdutosMap.values()) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValor = null;
        double precoTotal = 0.0;
        for (Produto produto : estoqueProdutosMap.values()) {
            double precoProduto = 0.0;
            for (int i = produto.getQuantidade(); i > 0; i--) precoProduto += produto.getPreco();
            if (precoProduto > precoTotal) {
                produtoMaiorQuantidadeValor = produto;
                precoTotal = precoProduto;
            }
        }
        return produtoMaiorQuantidadeValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("Valor Total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais caro no total: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }



}
