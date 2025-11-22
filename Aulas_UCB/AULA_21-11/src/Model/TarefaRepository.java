package Model;

import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {

    private final List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public Tarefa adiciona(String descricao){
        Tarefa tarefa = new Tarefa(proximoId++, descricao);
        tarefas.add(tarefa);
        return tarefa;
    }

    public List<Tarefa> listarTodas(){
        return new ArrayList<>(tarefas);
    }

    public Tarefa buscarPorId(int id){
        //t percorre todo Array tarefas
        for(Tarefa t : tarefas){
            //Verifica se o id em t é igual a alguma em tarefas
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    public boolean remover(int id){
        Tarefa t = buscarPorId(id);
        if( t != null){
            return tarefas.remove(t);
        }
        return false;
    }

}
