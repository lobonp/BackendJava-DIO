package exercicios.list.OperacoesBasicas;

/**
 * @author Pedro Lôbo Nascimento
 */
public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        return nome + ", R$" + preco + ", " + quantidade;
    }
}
