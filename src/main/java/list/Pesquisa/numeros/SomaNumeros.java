package main.java.list.Pesquisa.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> somaNumeros;

    public SomaNumeros() {
        this.somaNumeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "somaNumeros=" + somaNumeros +
                '}';
    }

    public void adicionarNumero(int... numeros){
        for (int i : numeros){
            somaNumeros.add(i);
        }
    }
    public int calcularSoma(){
        int numerosSomados = 0;
        if (!somaNumeros.isEmpty()){
            for (int i : somaNumeros){
                numerosSomados += i;
            }
        }
        return numerosSomados;
    }
    public int encontrarMaiorNumero(){
        int maiorNumeroAtual = Integer.MIN_VALUE;
        if (!somaNumeros.isEmpty()){
            for (int i: somaNumeros){
                if (i > maiorNumeroAtual){
                    maiorNumeroAtual = i;
                }
            }
        }
        return maiorNumeroAtual;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!somaNumeros.isEmpty()){
            for (int i: somaNumeros){
                if (i < menorNumero){
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1,2,3,22,74);
        System.out.println(somaNumeros);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
