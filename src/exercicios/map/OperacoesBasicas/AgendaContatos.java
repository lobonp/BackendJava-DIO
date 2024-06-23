package exercicios.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pedro Lôbo Nascimento
 */
public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        agendaContatoMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if (agendaContatoMap.isEmpty()) return null;
        return agendaContatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Pedro", 5665);
        agendaContatos.adicionarContato("Pedro Lobo", 111111);
        agendaContatos.adicionarContato("Pedro LN", 654987);
        agendaContatos.adicionarContato("Jose Silva", 111111);
        agendaContatos.adicionarContato("Pedro", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Jose Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Pedro LN"));
    }



}
