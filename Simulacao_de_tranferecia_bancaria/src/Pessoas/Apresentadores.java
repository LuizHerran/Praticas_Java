package Pessoas;

public class Apresentadores extends Pessoa{

        public void dadosPessoa(){
            System.out.printf("""
                    |/
                    ||\tNome: %s
                    ||\tGenero: %s
                    |\\
                    """, getNome(), getGenero());
        }
}
