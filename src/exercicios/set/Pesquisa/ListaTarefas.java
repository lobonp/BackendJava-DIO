package exercicios.set.Pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Pedro Lôbo Nascimento
 */
public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemovida = new Tarefa(descricao);
        tarefaSet.remove(tarefaRemovida);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaPendente = new Tarefa(descricao);
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.equals(tarefaPendente)) {
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = new Tarefa(descricao);
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.equals(tarefaPendente)) {
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Levar o lixo");
        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Arrumar a cama");

        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Levar o lixo");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Lavar a louça");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Lavar a louça");
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.contarTarefas();
        listaTarefas.removerTarefa("Levar o lixo");

        listaTarefas.contarTarefas();
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

    }

}
