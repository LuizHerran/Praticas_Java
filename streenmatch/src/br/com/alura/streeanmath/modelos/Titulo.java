package br.com.alura.streeanmath.modelos;

public class Titulo {
    private String nome;
    private int AnoDeLancamento;
    private boolean IncluidoNoPlano;
    private Double somadasavaliacoes = 0.0;
    private int totalDeAvaliacoes;
    private int DuracaoEmMinutos;
    private String Genero;

    public void exibeFichaTencica(){
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
                """, nome, AnoDeLancamento, DuracaoEmMinutos, Genero, IncluidoNoPlano, pegamedia());
    }

    public void avalia(double nota){
        somadasavaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegamedia(){
        return somadasavaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return AnoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        AnoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return IncluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        IncluidoNoPlano = incluidoNoPlano;
    }

    public Double getSomadasavaliacoes() {
        return somadasavaliacoes;
    }
    public void setSomadasavaliacoes(Double somadasavaliacoes) {
        this.somadasavaliacoes = somadasavaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        DuracaoEmMinutos = duracaoEmMinutos;
    }

    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }
}
