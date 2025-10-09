package br.com.alura.streeanmath.modelos;

import br.com.alura.streeanmath.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome,  int AnoDeLancamento, boolean IncluidoNoPlano, int DuracaoEmMinutos,
                 String Genero) {
        super(nome, AnoDeLancamento, IncluidoNoPlano, DuracaoEmMinutos, Genero);
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegamedia() / 2;
    }

    public String toString(){
        return "Filme: " + this.getNome() + " (" +  this.getAnoDeLancamento() + ")";
    }
}
