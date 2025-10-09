import Conteudos.Musicas;
import Conteudos.Podcasts;
import Pessoas.Apresentadores;
import Pessoas.Artistas;
import Pessoas.Bandas;

public class main {
    public static void main(String[] args) {

        Musicas musica1 = new Musicas();
        musica1.setNome("Lepo Lepo");
        musica1.setDuracao(2.45);
        musica1.setGenero("Ache");

        Artistas artista1 = new Artistas();
        artista1.setNome("Leo Santana");
        artista1.setGenero("Ache");
        musica1.setArtista(artista1);

        Musicas musica2 = new Musicas();
        musica2.setNome("Prey");
        musica2.setDuracao(4.43);
        musica2.setGenero("Pop");
        Bandas banda1 = new Bandas();
        banda1.setNome("The Neiboghbouhood");
        banda1.setGenero("Pop");
        banda1.setQuantidadeDeIntegrantes(4);
        musica2.setArtista(banda1);

        Podcasts podcast1 = new Podcasts();
        podcast1.setNome("PodHerran");
        podcast1.setGenero("Comedia");
        podcast1.setDuracao(3.32);
        Apresentadores apresentador1 = new Apresentadores();
        apresentador1.setNome("Herran");
        apresentador1.setGenero("Comedia");
        podcast1.setApresentadores(apresentador1);

        musica1.dadosConteudo();
        musica2.dadosConteudo();
        podcast1.dadosConteudo();

        }
}
