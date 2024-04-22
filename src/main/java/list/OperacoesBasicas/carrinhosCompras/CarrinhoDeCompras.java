package main.java.list.OperacoesBasicas.carrinhosCompras;

import java.util.*;

public class CarrinhoDeCompras {
    List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, quantidade, preco));
    }
    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!carrinhoDeCompras.isEmpty()){
            for (Item i : carrinhoDeCompras){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }
            carrinhoDeCompras.removeAll(itemsParaRemover);
        } else {
            throw new RuntimeException("Carrinho vazio!");
        }

    }
    public double calcularValorTotal(){
        Double valorTotal = Double.MIN_VALUE;
        if (!carrinhoDeCompras.isEmpty()){
            for (Item  i : carrinhoDeCompras){
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Carrinho vazio!");
        }
        
    }
    public void exibirItens(){
        if (!carrinhoDeCompras.isEmpty()) {
            System.out.println(carrinhoDeCompras);
        } else {
            throw new RuntimeException("Carrinho vazio!");
        }
    }
    public List<Item> ordenarListaPorNome(){
        List<Item> listaOrdenada = new ArrayList<>(carrinhoDeCompras);
        if (!carrinhoDeCompras.isEmpty()) {
            listaOrdenada.sort(Comparator.comparing(Item::getNome));
            return listaOrdenada;
        } else {
            throw new RuntimeException("Carrinho vazio.");
        }
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
//        System.out.println("Exibindo carrinho vazio");
//        carrinhoDeCompras.exibirItens();

        System.out.println("Adicionando items, e exibindo.");
        carrinhoDeCompras.adicionarItem("Arroz", 25,3);
        carrinhoDeCompras.adicionarItem("Feijão", 20,2);
        carrinhoDeCompras.adicionarItem("Macarrão", 15,2);
        carrinhoDeCompras.adicionarItem("Óleo de Soja", 9,2);
        carrinhoDeCompras.adicionarItem("Café", 12,4);
        carrinhoDeCompras.adicionarItem("Leite", 20,2);
        carrinhoDeCompras.exibirItens();

        System.out.println("Calcular valor total.");
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        System.out.println("Removendo Arroz");
        carrinhoDeCompras.removerItem("Arroz");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        System.out.println("Exibir lista por nome:");
        System.out.println(carrinhoDeCompras.ordenarListaPorNome());





    }
}
