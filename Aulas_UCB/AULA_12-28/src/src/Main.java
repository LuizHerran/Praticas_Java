public class Main {
    public static void main(String[] args) {
        //Informações de livros e autores
        Autor autor = new Autor("Fulano de Tal", "fulano@gmail.com", "098.123.654-34");
        Ebook ebook = new Ebook("Marca");
        Livro_Fisico livroFisico = new Livro_Fisico(6.50);
        Livro livro = new Livro("O pequeno principe", "Historia", 678, 50.39, autor, ebook, livroFisico);

        livro.dados_livros();
    }
}