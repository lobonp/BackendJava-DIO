# [DIO](www.dio.me) - Trilha Java Básico

## Autor do desafio
- [Gleyson Sampaio](https://github.com/glysns)
- [Link do desafio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Resolução do Desafio - Diagrama (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +selecionarAlbum(String nomeAlbum)
        +selecionarMusica(String musica)
        +pularMusica()
        +voltarMusica()
        +tocar()
        +pausar()
    }

    class Album {
        - String nome
        - String artista
        - int quantidadeMusicas
        - int anoLancamento
        - String duracao
        - ArrayList~String~ musicas
        +getNome() String
        +getMusicas() ArrayList~String~
        +toString() String
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +enviarMensagem(String mensagem, Contato contato)
        +listarContatos()
        +criarConferencia()
        +atender()
        +encerrarChamada()
        +pausarChamada()
        +iniciarCorreioVoz()
        +adicionarContato(Contato contato)
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Contato {
        -String nome
        -String numero
        -boolean chamadaAtiva
        +getNome() String
        +getNumero() String
        +isChamadaAtiva() boolean
        +setChamadaAtiva(boolean status)
        +toString() String
    }

    class iPhone {
        -ArrayList~Contato~ contatos
        -ArrayList~Album~ albuns
        -listarMusicasAlbum(String nomeAlbum)
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
    ReprodutorMusical --> Album
    AparelhoTelefonico --> Contato
```