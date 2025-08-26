public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nomeFilme = "O poderoso Chefão";
        meuFilme.Genero = "Ação";
        meuFilme.AnoDeLancamento = 1990;
        meuFilme.DuracaoEmMinutos = 120;
        meuFilme.IncluidoNoPlano = true;

        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        meuFilme.avalia(3.9);
        meuFilme.avalia(2.1);
        meuFilme.avalia(9.5);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTencica();
    }
}