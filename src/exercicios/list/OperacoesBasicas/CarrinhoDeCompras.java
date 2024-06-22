package exercicios.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pedro Lôbo Nascimento
 */
public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                itensParaRemover.add(item);
            }
        }

        itens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double precoTotal = 0.0;

        for (Item item : itens) {
            precoTotal += item.getPreco() * item.getQuantidade();
        }

        return precoTotal;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O valor total dos itens é: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Televisao", 1000, 2);
        carrinhoDeCompras.adicionarItem("Crime e Castigo", 92, 1);
        carrinhoDeCompras.adicionarItem("Cadeira de escritorio", 500, 3);
        System.out.println("O valor total dos itens é: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Cadeira de escritorio");
        System.out.println("O valor total dos itens é: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();

    }
}
