import br.com.alura.streeanmath.calculos.CalculadoraDeTempo;
import br.com.alura.streeanmath.calculos.FiltroDeRecomendacao;
import br.com.alura.streeanmath.modelos.Episodio;
import br.com.alura.streeanmath.modelos.Filme;
import br.com.alura.streeanmath.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setGenero("Ação");
        meuFilme.setAnoDeLancamento(1990);
        meuFilme.setDuracaoEmMinutos(145);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(1990);
        lost.setIncluidoNoPlano(true);
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
        filtro.filtra(episodio);


    }
}