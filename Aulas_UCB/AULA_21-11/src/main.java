//Adicionar todos pacotes dentro de br.com.ucb
//Buscar por id com erro CRITICO

import Controler.TarefaControle;
import Model.Tarefa;
import Model.TarefaRepository;
import View.ConsoleTarefaViw;
import View.TarefaViw;

public class main {
    public static void main(String[] args) {

        TarefaRepository repository = new TarefaRepository();
        ConsoleTarefaViw view = new ConsoleTarefaViw();
        TarefaControle Controle = new TarefaControle(repository, view);

        Controle.iniciar();
    }
}
