package projetos.umlchallenge.interfaces;

/**
 * @author Pedro Lôbo Nascimento
 */
public interface ReprodutorMusical {
    public void selecionarAlbum(String nomeAlbum);

    public void selecionarMusica(String musica);

    public void pularMusica();

    public void voltarMusica();

    public void tocar();

    public void pausar();

}
