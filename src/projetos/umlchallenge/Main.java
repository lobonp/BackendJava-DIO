package projetos.umlchallenge;

import projetos.umlchallenge.classes.Contato;

/**
 * @author Pedro Lôbo Nascimento
 */
public class Main {
    public static void main (String[] args) {
        IPhone iphone = new IPhone();

        //Adicionando contatos
        Contato yudi = new Contato("Yudi", "40028922");
        iphone.adicionarContato(yudi);
        Contato priscila = new Contato("Priscila", "22982004");
        iphone.adicionarContato(priscila);
        Contato silvio = new Contato("Silvio", "20042298");
        iphone.adicionarContato(silvio);
        System.out.println();

        //Demonstrando metodos de AparelhoTelefonico
        iphone.ligar("40028922");
        iphone.enviarMensagem("Quero playstation", yudi);
        System.out.println();

        iphone.listarContatos();
        System.out.println();

        iphone.ligar("40028922");
        iphone.ligar("22982004");
        iphone.criarConferencia();
        iphone.encerrarChamada();
        System.out.println();

        iphone.criarConferencia();
        System.out.println();

        iphone.atender();
        System.out.println();

        iphone.ligar("20042298");
        iphone.pausarChamada();
        iphone.encerrarChamada();
        System.out.println();

        iphone.iniciarCorreioVoz();
        System.out.println();

        //Demonstrando metodos do ReprodutorMusical

        iphone.selecionarAlbum("Tranquility Base Hotel & Casino");
        System.out.println();

        iphone.selecionarMusica("SICKO MODE");
        System.out.println();

        iphone.pularMusica();
        iphone.tocar();
        iphone.voltarMusica();
        iphone.pausar();
        System.out.println();

        //Demonstrando metodos do NavegadorInternet

        iphone.exibirPagina("youtube.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
