package projetos.projeto_poo.dominio;

import java.util.Set;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    protected Set<String> linguagens;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLinguagens() {
        return this.linguagens.toString();
    }

    public void adicionarLinguagem(String linguagem) {
        this.linguagens.add(linguagem);
    }
}
