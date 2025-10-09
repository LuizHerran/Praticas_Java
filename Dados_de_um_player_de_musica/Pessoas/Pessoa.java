package Pessoas;

public class Pessoa {
    private String nome;
    private int quantidadeDeIntegrantes = 1;
    private String genero;



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeIntegrantes() {
        return quantidadeDeIntegrantes;
    }
    public void setQuantidadeDeIntegrantes(int quantidadeDeIntegrantes) {
        this.quantidadeDeIntegrantes = quantidadeDeIntegrantes;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
