package projetos.umlchallenge.classes;

import java.util.ArrayList;

/**
 * @author Pedro Lôbo Nascimento
 */
public class Album {
    private String nome;
    private String artista;
    private int quantidadeMusicas;
    private int anoLancamento;
    private String duracao;
    private ArrayList<String> musicas = new ArrayList<>();

    public Album(String nome, String artista, int quantidadeMusicas, int anoLancamento, String duracao, ArrayList<String> musicas) {
        this.nome = nome;
        this.artista = artista;
        this.quantidadeMusicas = quantidadeMusicas;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getMusicas() {
        return musicas;
    }

    @Override
    public String toString() {
        return nome + " (" + anoLancamento + ")";
    }
}
