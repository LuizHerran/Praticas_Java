package Conteudos;
import Pessoas.Artistas;
import Pessoas.Bandas;

public class Musicas extends Conteudo {

    private Artistas artista;
    private Bandas banda;

    public void dadosConteudo(){
        System.out.printf("""
                |/
                ||\tNome da música: %s
                ||\tDuração de: %.2f
                ||\tGenero: %s
                ||\tArtista/Banda: %s
                ||
                |\\
                """, getNome(), getDuracao(), getGenero(), artista.getNome() == null ? banda.getNome() : artista.getNome());
    }

    public Artistas getArtista() {
        return artista;
    }
    public void setArtista(Artistas artista) {
        this.artista = artista;
    }

    public Bandas getBanda() {
        return banda;
    }
    public void setBanda(Bandas banda) {
        this.banda = banda;
    }
}
