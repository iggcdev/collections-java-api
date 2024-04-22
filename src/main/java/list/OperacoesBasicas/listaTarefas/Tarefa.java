package main.java.list.OperacoesBasicas.listaTarefas;

public class Tarefa {
    //Atribs
    private String descricao;


    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
