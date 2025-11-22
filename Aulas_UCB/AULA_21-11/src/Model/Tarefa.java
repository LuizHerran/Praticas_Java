package Model;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarConcluida(){
        this.concluida = true;
    }

    public String toString(){
        return "[" + id + "]" + descricao + (concluida ? "Concluida" :  "Não Concluida");
    }


    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }


}
