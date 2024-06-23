package exercicios.map.Ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Pedro Lôbo Nascimento
 */
public class LivrariaOnline {
    private Map<String, Livro> livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livraria.remove(entry);
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> livrosOrdenados = new TreeMap<>();
        System.out.println(livrosOrdenados);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new HashMap<>();
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }

        return livrosPorAutor;
    }

    public void obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getPreco() > maiorPreco) {
                maiorPreco = entry.getValue().getPreco();
                livroMaisCaro = livraria.get(entry.getKey());
            }
        }
        System.out.println(livroMaisCaro);
    }

    public void obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
            if (entry.getValue().getPreco() < menorPreco) {
                menorPreco = entry.getValue().getPreco();
                livroMaisBarato = livraria.get(entry.getKey());
            }
        }
        System.out.println(livroMaisBarato);
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("amazon.com/123", "Crime e Castigo", "Fiódor Dostoiévski", 91.98);
        livrariaOnline.adicionarLivro("amazon.com/321", "Os Irmãos Karamazov", "Fiódor Dostoiévski", 90.93);
        livrariaOnline.adicionarLivro("amazon.com/456", "Felicidade conjugal", "Lev Tolstói", 40.92);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Fiódor Dostoiévski"));
        livrariaOnline.obterLivroMaisBarato();
        livrariaOnline.obterLivroMaisCaro();

    }
}
