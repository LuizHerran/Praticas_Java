public class Filme {
    String nomeFilme;
    int AnoDeLancamento;
    boolean IncluidoNoPlano;
    Double somadasavaliacoes = 0.0;
    int totalDeAvaliacoes;
    int DuracaoEmMinutos;
    String Genero;

    void exibeFichaTencica(){
        System.out.printf("""
                //========================================\\\\
                ||
                ||\tNome do Filme: %s
                ||\tAno de lançamento: %d
                ||\tDuração: %d
                ||\tGereno: %s
                ||\tIncluido no plano: %b
                ||\tAvaliação: %.2f
                ||
                \\\\========================================//
                """, nomeFilme, AnoDeLancamento, DuracaoEmMinutos, Genero, IncluidoNoPlano, pegamedia());
    }

    void avalia(double nota){
        somadasavaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    double pegamedia(){
        return somadasavaliacoes / totalDeAvaliacoes;
    }
}
