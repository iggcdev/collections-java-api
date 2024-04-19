package main.java.map.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer>  agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome,numero);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        System.out.println("Criando e exibindo contatos, agenda vazia.");
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Gabriel",123);
        agendaContatos.adicionarContato("Mariana",321);
        agendaContatos.adicionarContato("Gael",312);
        agendaContatos.adicionarContato("Gael",311);

        System.out.println("Exibindo contatos");
        agendaContatos.exibirContatos();

        System.out.println("Pesquisar numero de contato por nome: Gael");
        System.out.println(agendaContatos.pesquisarPorNome("Gael"));

        System.out.println("Remover contato: Gabriel");
        agendaContatos.removerContato("Gabriel");
        System.out.println("Pesquisar contato gabriel, retornara null, pois foi apagado");
        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));

    }
}
