package main.java.list.OperacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //ListaTarefa é o nome da classe que irá criar objetos do tipo
    //lita de objetos do tipo Tarefa.
    private List<Tarefa> tarefaList;
    //definição do atributo privado tarefaList, atributo que sera do tipo Lista de tarefas

    public ListaTarefa() {
    //construtor vazio, diz que sempre sera iniciado um arraylist vazio ao criar o objeto
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
    //metodo que adiciona objetos do tipo tarefa, a lista de tarefas tarefaList
    //sendo passado como parametro a descricao dessa tarefa
        tarefaList.add(new Tarefa(descricao));
        //é necessario criar um novo objeto new Tarefa sempre ao add tarefa
    }
    public void removerTarefa(String descricao){
    //Para se remover tarefas da tarefaList, é necessario criar um objeto
    //TarefasParaRemover do tipo lista de tarefas, para receber todas as tarefas
    //que serão removidas.
        List<Tarefa> TarefasParaRemover = new ArrayList<>();
        //Faz-se um loop onde, para cada tarefa t, em tarefaList
        //se a descricao de t for igual a descricao passada,
        //adicione essa tarefa t, a lista de tarefas TarefasParaRemover
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){//.equalsIgnoreCase ignora diferenca ente maiusculas e minusculas
                TarefasParaRemover.add(t);
            }
        }
        //Da lista de tarefas tarefaList, remove-se da lista, tudo que estiver
        //na lista TarefasParaRemover.
        tarefaList.removeAll(TarefasParaRemover);
    }
    //Obter quantidade de tarefas na lista de tarefas:
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    //Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1.");
        listaTarefa.adicionarTarefa("Tarefa 2.");
        listaTarefa.adicionarTarefa("Tarefa 2.");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 2.");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
