package exercicios.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pedro Lôbo Nascimento
 */
public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> contagemPalavra : contagemPalavrasMap.entrySet()) {
            if (contagemPalavra.getValue() > maiorContagem) {
                maiorContagem = contagemPalavra.getValue();
                palavraMaisFrequente = contagemPalavra.getKey();
            }
        }

        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("rato", 5);
        contagemPalavras.adicionarPalavra("sinal", 4);
        contagemPalavras.adicionarPalavra("muleta", 9);
        contagemPalavras.adicionarPalavra("farol", 8);
        contagemPalavras.adicionarPalavra("tulipa", 3);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("muleta");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("A palavra mais frequente é: "+ contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
