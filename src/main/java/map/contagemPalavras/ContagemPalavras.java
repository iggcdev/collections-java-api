package main.java.map.contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String,Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    @Override
    public String toString() {
        return "ContagemPalavras{" +
                "contagemPalavras=" + contagemPalavras +
                '}';
    }


    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        contagemPalavras.remove(palavra);
    }
    public Map<String,Integer> exibirContagemPorPalavra(String palavra){
        Map<String,Integer> mapaComPalavraEncontrada = new HashMap<>();
        if (!contagemPalavras.isEmpty()) {
            if (contagemPalavras.containsKey(palavra)){
                mapaComPalavraEncontrada.put(palavra,contagemPalavras.get(palavra));
            }
        }
        return mapaComPalavraEncontrada;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        Integer menosVezes = Integer.MIN_VALUE;
        if (!contagemPalavras.isEmpty()){
            for (String palavra : contagemPalavras.keySet()){
                if (contagemPalavras.get(palavra) > menosVezes){
                    palavraMaisFrequente = palavra;
                    menosVezes = contagemPalavras.get(palavra);
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Gabriel",748);
        contagemPalavras.adicionarPalavra("Mariana",258);
        System.out.println(contagemPalavras);
        System.out.println(contagemPalavras.exibirContagemPorPalavra("Gabriel"));
        contagemPalavras.removerPalavra("Gabriel");
        System.out.println(contagemPalavras.exibirContagemPorPalavra("Gabriel"));
        contagemPalavras.adicionarPalavra("Gabriel",748);
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
