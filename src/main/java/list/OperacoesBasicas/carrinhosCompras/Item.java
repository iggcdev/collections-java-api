package main.java.list.OperacoesBasicas.carrinhosCompras;

import java.util.Comparator;

public class Item implements Comparable<Item> {
    private  String nome;
    private  int quantidade;
    private double preco;

    public Item(String nome,int quantidade,double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public int compareTo(Item i) {
        return this.nome.compareToIgnoreCase(i.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  nome +
                ", quantidade: " + quantidade +
                ", preco: " + preco+"\n";
    }
}
class ComparatorPorQuantidade implements Comparator<Item>{
    @Override
    public int compare(Item i1, Item i2) {
        return Integer.compare(i1.getQuantidade(), i2.getQuantidade());
    }
}
class ComparatorPorPreco implements Comparator<Item>{
    @Override
    public int compare(Item i1, Item i2) {
        return Double.compare(i1.getPreco(), i2.getPreco());
    }
}