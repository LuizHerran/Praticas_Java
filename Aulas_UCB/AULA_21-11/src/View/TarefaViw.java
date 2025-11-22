package View;

import Model.Tarefa;
import java.util.List;

public interface TarefaViw {

    void mostrarMenu();
    int lerOpcaoMenu();
    String lerDescricaoTarefa();
    int lerIdTarefa();
    void mostrarTarefa(List<Tarefa> tarefas);
    void mostrarMensagem(String mensagem);

}
