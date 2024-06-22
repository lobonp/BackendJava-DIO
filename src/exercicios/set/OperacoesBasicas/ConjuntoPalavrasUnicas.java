package exercicios.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pedro Lôbo Nascimento
 */
public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for (String palavraRemover : palavras) {
            if (palavraRemover.equalsIgnoreCase(palavra)) {
                palavras.remove(palavraRemover);
                break;
            }
        }
    }

    public void verificarPalavra(String palavra) {
        if (palavras.contains(palavra)) {
            System.out.println(palavra + " está contido em palavrasUnicas");
        } else {
            System.out.println(palavra + " não está contido em palavrasUnicas");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Teclado");
        conjuntoPalavrasUnicas.adicionarPalavra("Mouse");
        conjuntoPalavrasUnicas.adicionarPalavra("Mouse");
        conjuntoPalavrasUnicas.adicionarPalavra("Monitor");

        conjuntoPalavrasUnicas.verificarPalavra("Tomada");
        conjuntoPalavrasUnicas.verificarPalavra("Teclado");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }
}
