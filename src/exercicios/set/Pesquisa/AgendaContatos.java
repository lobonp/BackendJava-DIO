package exercicios.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;
/**
 * @author Pedro Lôbo Nascimento
 */
public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPesquisados = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPesquisados.add(contato);
            }
        }
        return contatosPesquisados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pedro", 123456);
        agendaContatos.adicionarContato("Pedro", 0);
        agendaContatos.adicionarContato("Pedro Lobo", 111111);
        agendaContatos.adicionarContato("Pedro LN", 654987);
        agendaContatos.adicionarContato("Jose Silva", 111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Pedro"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Jose Silva", 555555));

        agendaContatos.exibirContatos();
    }
}