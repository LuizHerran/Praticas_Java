package Pessoas;

public class Artistas extends Pessoa{

    public void dadosPessoa(){
        System.out.printf("""
                |/
                ||\tNome: %s
                ||\tGenero: %s
                |\\
                """, getNome(), getGenero());
    }
}
