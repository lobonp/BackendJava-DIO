package projetos.umlchallenge;

import projetos.umlchallenge.classes.Album;
import projetos.umlchallenge.classes.Contato;
import projetos.umlchallenge.interfaces.AparelhoTelefonico;
import projetos.umlchallenge.interfaces.NavegadorInternet;
import projetos.umlchallenge.interfaces.ReprodutorMusical;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Pedro Lôbo Nascimento
 */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ArrayList<Album> albuns = new ArrayList<>();
    private ArrayList<Contato> contatos = new ArrayList<>(); //o ideal seria um HashSet de contatos, mas devido a simplicidade do desafio resolvi simplificar

    public IPhone() {
        //Criando albuns para o ReprodutorMusical
        ArrayList<String> musicas = new ArrayList<>(Arrays.asList("Dark Fantasy", "Gorgeous", "Power", "All of the Lights", "All of the Lights", "Monster", "So Appalled", "Devil in a New Dress", "Runaway", "Hell of a Life", "Blame Game", "Lost in the World", "Who Will Survive in America"));
        Album mbdtf = new Album("My Beautiful Dark Twisted Fantasy", "Kanye West", 13, 2010, "1h e 8min", musicas);
        albuns.add(mbdtf);

        musicas = new ArrayList<>(Arrays.asList("Star Treatment", "One Point Perspective", "American Sports", "Tranquility Base Hotel & Casino", "Golden Trunks", "Four Out of Five", "The World's First Ever Monster Truck Front Flip", "Science Fiction", "She Looks Like Fun", "Batphone", "The Ultracheese"));
        Album tbhc = new Album("Tranquility Base Hotel & Casino", "Arctic Monkeys", 11, 2018, "40min e 57s", musicas);
        albuns.add(tbhc);

        musicas = new ArrayList<>(Arrays.asList("STARGAZING", "CAROUSEL", "SICKO MODE", "R.I.P. Screw", "STOP TRYING TO BE GOD", "NO BYSTANDERS", "SKELETONS", "WAKE UP", "5% TINT", "NC-17", "ASTROTHUNDER", "YOSEMITE", "CAN'T SAY", "WHO? WHAT!", "BUTTERFLY EFFECT", "HOUSTONFORNICATION", "COFFEE BEAN"));
        Album astroworld = new Album("ASTROWORLD", "Travis Scott", 17, 2018, "58min e 42s", musicas);
        albuns.add(astroworld);
    }

    //ReprodutorMusical
    @Override
    public void selecionarAlbum(String nomeAlbum) {
        for (Album album : albuns) {
            if (album.getNome().equals(nomeAlbum)) {
                System.out.println("SELECIONANDO ALBUM " + album);
                listarMusicasAlbum(nomeAlbum);
                return;
            }
        }
        System.out.println("ALBUM NAO ENCONTRADO");
    }

    private void listarMusicasAlbum(String nomeAlbum) {
        for (Album album : albuns) {
            if (album.getNome().equals(nomeAlbum)) {
                for (String musica : album.getMusicas()) {
                    System.out.println(musica);
                }
                return;
            }
        }
        System.out.println("ALBUM NAO ENCONTRADO");
    }

    @Override
    public void selecionarMusica(String musica) {
        for (Album album : albuns) {
            if (album.getMusicas().contains(musica)) {
                System.out.println("TOCANDO " + musica);
                return;
            }
        }
        System.out.println("MUSICA NAO ENCONTRADA");
    }

    @Override
    public void pularMusica() {
        System.out.println("MUSICA PULADA");
    }

    @Override
    public void voltarMusica() {
        System.out.println("VOLTANDO MUSICA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    //AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        for (Contato contato : contatos) {
            if (contato.getNumero().equals(numero)) contato.setChamadaAtiva(true);
        }
        System.out.println("LIGANDO PARA " + numero + "...");
    }

    @Override
    public void enviarMensagem(String mensagem, Contato contato) {
        System.out.println("MENSAGEM ENVIADA: " + mensagem + "\nPARA: "+ contato.getNome());
    }
    @Override
    public void listarContatos() {
        System.out.println("CONTATOS:");
        for (Contato contato : contatos) System.out.println(contato.toString());
    }

    @Override
    public void criarConferencia() {
        String membrosConferencia = "";
        for (Contato contato : contatos) {
            if (contato.isChamadaAtiva()) membrosConferencia += contato.getNome() + ", ";
        }

        if (!membrosConferencia.isEmpty())
            System.out.println("CONFERENCIA INICIADA COM: " + membrosConferencia.substring(0, membrosConferencia.length() - 2));
        else
            System.out.println("NAO HA MEMBROS EM CHAMADA ATIVA");
    }

    @Override
    public void atender() {
        System.out.println("CHAMADA ATENDIDA");
    }

    @Override
    public void encerrarChamada() {
        for (Contato contato : contatos) {
            if (contato.isChamadaAtiva()) contato.setChamadaAtiva(false);
        }
        System.out.println("CHAMADA ENCERRADA");
    }

    @Override
    public void pausarChamada() {
        System.out.println("CHAMADA PAUSADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO");
    }

    @Override
    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
        System.out.println(contato.toString() + " ADICIONADO A LISTA DE CONTATOS");
    }

    //NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA");
    }
}
