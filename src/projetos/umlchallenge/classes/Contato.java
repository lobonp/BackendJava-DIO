package projetos.umlchallenge.classes;

/**
 * @author Pedro Lôbo Nascimento
 */
public class Contato {
    private String nome;
    private String numero;
    private boolean chamadaAtiva = false;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public boolean isChamadaAtiva() {
        return chamadaAtiva;
    }

    public void setChamadaAtiva(boolean status) {
        this.chamadaAtiva = status;
    }

    @Override
    public String toString() {
        return nome + " - " + numero;
    }
}
