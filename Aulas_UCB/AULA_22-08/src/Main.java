public class Main {
    public static void main(String[] args) {
        //Informações de livros e autores
        Livro livro = new Livro();
        livro.titulo = "O pequeno principe";
        livro.categoria = "Historia";
        livro.preco = 50.25;
        livro.cod = 678;
        Autor autor = new Autor();
        autor.nome = "Fulano de Tal";
        autor.cpf = "123.456.789-98";
        autor.email = "fulanodetal@gmail.com";
        livro.autor = autor;

        Livro livro2 = new Livro();
        livro2.titulo = "Jogos Vorases";
        livro2.categoria = "Ação";
        livro2.preco = 59.98;
        livro2.cod = 689;
        Autor autor2 = new Autor();
        autor2.nome = "Ciclaro de Tal";
        autor2.cpf = "987.654.321-87";
        autor2.email = "ciclanodetal@gmail.com";
        livro2.autor = autor2;

        livro.dados_livros();
        livro2.dados_livros();

    }
}