package main.java.set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>() {
        };
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoExcluido = null;
        if (!convidadoSet.isEmpty()){
           for (Convidado c : convidadoSet){
               if (c.getCodigoConvite() == codigoConvite){
                   convidadoExcluido = c;
                   break;
               }
           }
           if (!(convidadoExcluido == null)){
               convidadoSet.remove(convidadoExcluido);
           } else {
               throw new RuntimeException("Codigo não encontrado.");
           }
        }
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Gabriel", 001);
        conjuntoConvidados.adicionarConvidado("Mariana", 2);
        conjuntoConvidados.adicionarConvidado("Gael", 3);
        conjuntoConvidados.adicionarConvidado("candidato 4", 3);

        System.out.println("Contar convidados.");
        System.out.println(conjuntoConvidados.contarConvidados());
        System.out.println("Exibir Set");
        conjuntoConvidados.exibirConvidados();
        System.out.println("Lista com codigo de convidado 1 excluido.");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Tentando remover codigo inexistente, lançando exception");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(4);


    }
}
