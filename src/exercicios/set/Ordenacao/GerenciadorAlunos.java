package exercicios.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Pedro Lôbo Nascimento
 */
public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(Long matricula) {
        Aluno alunoRemovido = new Aluno("teste", matricula, 10.0);
        for (Aluno aluno : alunoSet) {
            if (aluno.equals(alunoRemovido)) {
                alunoSet.remove(aluno);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNota());
        alunosPorNome.addAll(alunoSet);
        return alunosPorNome;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Pedro", 12345L, 10.0);
        gerenciadorAlunos.adicionarAluno("Judas", 12345L, 0.0);
        gerenciadorAlunos.adicionarAluno("João", 54321L, 9.5);
        gerenciadorAlunos.adicionarAluno("Tiago", 123789L, 9.0);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.adicionarAluno("Judas", 456789L, 0.0);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(456789L);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
