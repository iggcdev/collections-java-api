package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, quantidade, preco);
        carrinhoDeCompras.add(item);
    }
    public String removerItem(String nome){
        List<Item> ProdutosARemover = new ArrayList<>();
        Boolean existe = false;
        String resposta = null;
        for (Item i: carrinhoDeCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                ProdutosARemover.add(i);
                existe = true;
                }
        }
        if (existe){
            resposta = "Item " + nome + " removido com sucesso.";
        } else {
            resposta = "Item " +nome+" não existe no carrinho.";
        }
        carrinhoDeCompras.removeAll(ProdutosARemover);
        return resposta;
    }
    public void calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item i: carrinhoDeCompras){
            valorTotal += i.getPreco();
        }
        System.out.println("O valor total do carrinho é: " + valorTotal+" dinheiros");
    }
    public void exibirItens(){
        System.out.println("Os itens no carrinho são:\n" + carrinhoDeCompras+"\n"+
                "Totalizando: " + carrinhoDeCompras.size() + " itens.");
    }

    public String calcularValorPorProduto(String produto){
       double total = 0;
       String resposta;
       Boolean existe = false;
       for (Item i: carrinhoDeCompras){
           if (i.getNome().equalsIgnoreCase(produto)){
               total += i.getPreco();
               existe = true;
           }
       }
       if(!existe){
           resposta = "O produto: " + produto + " não existe no carrinho.";
       } else {
           resposta = "O valor total de produtos: "+produto+" é: "+ total + " dinheiros.";
       }
       return resposta;
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Arroz",40.0,5);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.adicionarItem("Feijão",30.0,3);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        System.out.println(carrinhoDeCompras.calcularValorPorProduto("Arroz"));
        carrinhoDeCompras.adicionarItem("Arroz",40.0,5);
        carrinhoDeCompras.adicionarItem("Arroz",40.0,5);
        System.out.println(carrinhoDeCompras.calcularValorPorProduto("arroz"));
        System.out.println(carrinhoDeCompras.calcularValorPorProduto("Feijão"));
        System.out.println(carrinhoDeCompras.calcularValorPorProduto("Farinha"));
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.removerItem("arroz"));
        carrinhoDeCompras.exibirItens();
    }
}
