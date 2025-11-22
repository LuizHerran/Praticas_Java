package Controler;

import java.util.List;

import Model.Tarefa;
import Model.TarefaRepository;
import View.ConsoleTarefaViw;

public class TarefaControle {

    private final TarefaRepository Repository;
    private final ConsoleTarefaViw viw; //view
    private final boolean executando = true;

    private void tratarOpcao(int opcao){
        switch(opcao){
            case 1 -> listaDeTarefas();
            case 2 -> adicionarTarefas();
            case 3 -> concluirTarefa();
            case 4 -> removerTarefa();
            case 6 -> sair();
            default -> viw.mostrarMensagem("Opção invalida!");
        }
    }

    public TarefaControle(TarefaRepository tarefaRepository, ConsoleTarefaViw viw) {
        this.Repository = tarefaRepository;
        this.viw = viw;
    }

    public void iniciar(){
        while(executando){
            viw.mostrarMenu();
            int opcao = viw.lerOpcaoMenu();
            tratarOpcao(opcao);
        }
    }

    private void listaDeTarefas(){
        List<Tarefa> tarefas = Repository.listarTodas();
        viw.mostrarTarefa(tarefas);
    }

    private void adicionarTarefas(){
        String descricao = viw.lerDescricaoTarefa();
        Tarefa t = Repository.buscarPorId();
        if(t == null){
            viw.mostrarMensagem("Tarefa não encontrada!");
        } else {
            t.marcarConcluida();
            viw.mostrarMensagem("Tarefa concluida com Sucesso!");
        }
    }

    private void removerTarefa(){
        int id = viw.lerIdTarefa();
        boolean removida  = Repository.remover(id);
        if(removida){
            viw.mostrarMensagem("Tarefa removida com Sucesso!");
        } else {
            viw.mostrarMensagem("Tarefa não encontrada!");
        }
    }

    private void concluirTarefa(){

    }

    private void sair(){


    }
}
