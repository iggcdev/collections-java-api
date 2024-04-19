package main.java.set.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosEncontrados = new HashSet<>();
        if (!contatoSet.isEmpty()){
            for (Contato c : contatoSet){
                if (c.getNome().startsWith(nome)){
                    contatosEncontrados.add(c);
                }
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, int numeroNovo){
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()){
            for (Contato c : contatoSet){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(numeroNovo);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;

        }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        System.out.println("Agenda criada vazia:");
        agendaContatos.exibirContatos();

        System.out.println("Adicionando 3 contatos");
        agendaContatos.adicionarContato("Gabriel Silva", 123456);
        agendaContatos.adicionarContato("Gabriel Correia", 552233);
        agendaContatos.adicionarContato("Mariana",654321);
        agendaContatos.exibirContatos();

        System.out.println("Pesquisar por Gabriel");
        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));

        System.out.println("Numero de Gabriel atualizado");
        agendaContatos.atualizarNumeroContato("Gabriel",10000);

        System.out.println("Exibir contatos");
        agendaContatos.exibirContatos();
    }
}
