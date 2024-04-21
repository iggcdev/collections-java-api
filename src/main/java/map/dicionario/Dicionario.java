package main.java.map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String,String> verbetes;

    public Dicionario() {
        this.verbetes = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Dicionario:" + verbetes;
    }

    public void adicionarVerbete(String palavra, String definicao){
        verbetes.put(palavra,definicao);
    }
    public void removerVerbete(String palavra){

    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarVerbete("Bola", "Algo esferico, de diversos tamanho, objeto de se chutar no futebol");

        System.out.println(dicionario);

    }
}
