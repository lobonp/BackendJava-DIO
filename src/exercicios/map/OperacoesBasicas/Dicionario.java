package exercicios.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pedro Lôbo Nascimento
 */
public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    public Map<String, String> exibirPalavras() {
        return dicionarioMap;
    }

    public String pesquisarPorPalavra(String palavra) {
        return dicionarioMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        System.out.println(dicionario.exibirPalavras());

        dicionario.adicionarPalavra("rocha", "Massa sólida e natural que compõem a crosta terrestre.");
        dicionario.adicionarPalavra("toalete", "aposento sanitário; banheiro, latrina.");
        dicionario.adicionarPalavra("eternidade", "característica, atributo, qualidade do que não tem início ou fim.");

        System.out.println(dicionario.exibirPalavras());

        System.out.println(dicionario.pesquisarPorPalavra("eternidade"));
        System.out.println(dicionario.pesquisarPorPalavra("pedregulho"));

        dicionario.removerPalavra("rocha");

        System.out.println(dicionario.exibirPalavras());
    }
}
