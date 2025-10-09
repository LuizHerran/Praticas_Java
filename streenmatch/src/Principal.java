import br.com.alura.streeanmath.calculos.CalculadoraDeTempo;
import br.com.alura.streeanmath.calculos.FiltroDeRecomendacao;
import br.com.alura.streeanmath.modelos.Episodio;
import br.com.alura.streeanmath.modelos.Filme;
import br.com.alura.streeanmath.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso Chefão", 1990, true, 300
        , "Ação");
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.exibeFichaTencica();

        Serie lost = new Serie("Lost", 1980, true, 5000, "Suspence");
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();

        Episodio episodio = new Episodio();
        episodio.setNome("Episodio");
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        var filmeDoLuiz = new Filme("Piratas do Caribe", 1990, true,
        300, "Ação");
        filmeDoLuiz.avalia(8);
        filmeDoLuiz.exibeFichaTencica();

        var listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoLuiz);
        System.out.println("\nTamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).toString());


    }
}