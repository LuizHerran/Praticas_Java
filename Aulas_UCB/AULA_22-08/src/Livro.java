public class Livro {
    String titulo;
    String categoria;
    int cod;
    double preco;
    Autor autor;



    void dados_livros(){
        System.out.printf("""
                //=====================================\\\\
                ||
                ||\tTitulo: %s
                ||\tCategoria: %s
                ||\tPreço %.2f
                ||\tCodigo %d
                |\\
                """,titulo,categoria,preco,cod);
        autor.dados_autor();
    }
}
