package Pessoas;

public class Bandas extends Artistas{

    @Override
    public void dadosPessoa() {
        System.out.printf("""
                |/
                ||\tNome da banda: %s
                ||\tGenero: %s
                ||\tQuantidadeDeIntegrantes: %d
                |\\
                """, getNome(), getGenero(),  getQuantidadeDeIntegrantes());
        }
    }