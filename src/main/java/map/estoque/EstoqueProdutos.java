package main.java.map.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod,String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod,new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
          }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        System.out.println("Criando e Exibindo estoque de produtos vazio.");
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        System.out.println("Adicionando produtos, e exibindo");
        estoqueProdutos.adicionarProduto(1L,"Arroz",200,25.0);
        estoqueProdutos.adicionarProduto(2L,"Feijão",150,20.0);
        estoqueProdutos.adicionarProduto(3L,"Macarrão",70,15.0);
        estoqueProdutos.adicionarProduto(4L,"Batata",90,12.0);
        estoqueProdutos.adicionarProduto(5L,"Caixa de Ovo",100,18.0);
        estoqueProdutos.adicionarProduto(6L,"Açúcar",50,9.0);
        estoqueProdutos.adicionarProduto(7L,"Papel",50,2.0);
        estoqueProdutos.adicionarProduto(1L,"Arroz integral",100,29.0);
        estoqueProdutos.exibirProdutos();

        System.out.println("Calcular valor total do estoque.");
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Saber produto mais caro.");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

    }
}
