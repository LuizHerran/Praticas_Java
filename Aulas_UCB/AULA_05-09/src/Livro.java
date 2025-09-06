public class Livro {
    private String titulo;
    private String categoria;
    private int cod;
    private double preco;
    private Autor autor;
    private Ebook ebook;

    public Livro(Autor autor){
        this.autor = autor;
    }

    Livro(){}

    Livro(String titulos, String categorias, int cods, double preco, Autor autor, Ebook ebook){
        titulo = titulos;
        categoria = categorias;
        cod = cods;
        this.preco = preco;
        this.autor = autor;
        this.ebook = ebook;
    }

    boolean temAutor(){
        return autor != null;
    }
    boolean temEbook(){ return ebook != null;}

    void dados_livros(){
        System.out.printf("""
                //=====================================\\\\
                ||
                ||\tTitulo: %s
                ||\tCategoria: %s
                ||\tPreço %.2f
                ||\tCodigo %d
                |\\""",titulo,categoria,preco,cod);
        if(temAutor()){
            autor.dados_autor();
        }
        if(temEbook()){
            ebook.dadosEbook();
        }
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
