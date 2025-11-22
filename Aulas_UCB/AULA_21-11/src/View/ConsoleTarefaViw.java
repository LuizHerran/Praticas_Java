package View;

import Model.Tarefa;

import java.util.List;
import java.util.Scanner;

public class ConsoleTarefaViw implements TarefaViw {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    @Override
    public int lerOpcaoMenu(){
        String linha = sc.nextLine();
        try{
            return Integer.parseInt(linha);
        }catch(NumberFormatException e){
            return -1; //Opção invalida!
        }
    }

    @Override
    public String lerDescricaoTarefa(){
        System.out.println("Digite a descrição da tarefa: ");
        return sc.nextLine();
    }

    @Override
    public void mostrarMenu(){
        System.out.printf("""
                //==================== Gerenciador de Tarefas ====================\\\\
                ||
                ||\t 1 - Adicionar tarefas.
                ||\t 2 - Listar Tarefas.
                ||\t 3 - Marcar Tarefa como Concluida.
                ||\t 4 - Remover Tarefas.
                ||\t 5 - Sair.
                ||
                \\\\=================================================================//
                """);
    }

    @Override
    public int lerIdTarefa(){
        System.out.println("Digite o id da tarefa: ");
        sc.nextInt();
        try{
            return Integer.parseInt(sc.nextLine());
        }catch(NumberFormatException e){
            return -1;
        }
    }

    @Override
    public void mostrarTarefa(List<Tarefa> tarefas){
        System.out.println("//=============== Tarefas ===============\\\\");
        if(tarefas.isEmpty()){
            System.out.println("||\tNenhuma tarefa cadastrada!");
            System.out.println("||\n"+"\\\\=====================================//");
        }else{
            for(Tarefa t : tarefas){
                System.out.println(t);
            }
        }
    }

}
