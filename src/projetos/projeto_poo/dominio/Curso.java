package projetos.projeto_poo.dominio;

import java.util.HashSet;
import java.util.Set;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
        this.linguagens = new HashSet<>();
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", linguagens='" + getLinguagens() + '\'' +
                ", cargaHoraria =" + cargaHoraria +
                '}';
    }
}
