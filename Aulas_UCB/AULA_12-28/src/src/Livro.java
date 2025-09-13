public class Livro {
    private String titulo;
    private String categoria;
    private int cod;
    private double preco;
    private Autor autor;
    private Ebook ebook;
    private Livro_Fisico livro_fisico;

    public Livro(Autor autor){
        this.autor = autor;
    }

    Livro(){}

    Livro(String titulos, String categorias, int cods, double preco, Autor autor, Ebook ebook, Livro_Fisico livro_fisico){
        titulo = titulos;
        categoria = categorias;
        cod = cods;
        this.preco = preco;
        this.autor = autor;
        this.ebook = ebook;
        this.livro_fisico = livro_fisico;
    }



    void dados_livros(){
        System.out.printf("""
                //=====================================\\\\
                ||
                ||\tTitulo: %s
                ||\tCategoria: %s
                ||\tPreço %.2f
                ||\tCodigo %d
                |\\""",titulo,categoria,preco,cod);
            autor.dados_autor();
            livro_fisico.dadosImpressao();
            ebook.dadosEbook();
        System.out.printf("\\\\============================//\n\n");

    }

    boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 20){
            System.out.println("Desconto maior que 20%");
            return false;
        }
        preco -= preco * porcentagem / 100;
        return true;
    }

    public Ebook getEbook() {
        return ebook;
    }

    public void setEbook(Ebook ebook) {
        this.ebook = ebook;
    }

    public Livro_Fisico getLivro_fisico() {
        return livro_fisico;
    }

    public void setLivro_fisico(Livro_Fisico livro_fisico) {
        this.livro_fisico = livro_fisico;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}