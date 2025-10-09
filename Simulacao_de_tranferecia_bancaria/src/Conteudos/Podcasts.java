package Conteudos;
import Pessoas.Apresentadores;

public class Podcasts extends Conteudo {

    Apresentadores apresentadores;

    public void dadosConteudo(){
        System.out.printf("""
                |/
                ||\tNome do Podcast: %s
                ||\tGenero: %s
                ||\tTempo de duração: %.2f horas
                ||\tApresentador: %s
                |\\
                """, getNome(), getGenero(), getDuracao(), apresentadores.getNome());
    }

    public Apresentadores getApresentadores() {
        return apresentadores;
    }
    public void setApresentadores(Apresentadores apresentadores) {
        this.apresentadores = apresentadores;
    }
}
