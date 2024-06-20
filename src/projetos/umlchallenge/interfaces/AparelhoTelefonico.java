package projetos.umlchallenge.interfaces;

import projetos.umlchallenge.classes.Contato;

/**
 * @author Pedro Lôbo Nascimento
 */
public interface AparelhoTelefonico {
    public void ligar(String numero);
    public void enviarMensagem(String mensagem, Contato contato);
    public void listarContatos();
    public void criarConferencia();
    public void atender();
    public void encerrarChamada();
    public void pausarChamada();
    public void iniciarCorreioVoz();
    public void adicionarContato(Contato contato);

}
