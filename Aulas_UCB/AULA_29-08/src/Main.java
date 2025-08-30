public class Main {
    public static void main(String[] args) {
        //Informações de livros e autores
        Livro livro = new Livro();
        livro.setTitulo("O pequeno principe");
        livro.setCategoria("Historia");
        livro.setPreco(50.39);
        livro.setCod(678);
        Autor autor = new Autor();
        autor.setNome("Fulano de Tal");
        autor.setCpf("123.456.789-98");
        autor.setEmail("fulanodetal@gmail.com");
        livro.setAutor(autor);

        Livro livro2 = new Livro();
        livro2.setTitulo("Jogos Vorases");
        livro2.setCategoria("Ação");
        livro2.setPreco(59.98);
        livro2.setCod(689);
        Autor autor2 = new Autor();
        autor2.setNome("Ciclaro de Tal");
        autor2.setCpf("987.654.321-87");
        autor2.setEmail("ciclanodetal@gmail.com");
        livro2.setAutor(autor2);

        livro.dados_livros();
        livro.aplicarDesconto(15);
        System.out.printf("Valor do livro com desconto: %.2f\n\n",livro.getPreco());

        livro2.dados_livros();
        livro2.aplicarDesconto(15);
        System.out.printf("Valor do livro com desconto: %.2f",livro2.getPreco());

    }
}