package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas(){
    this.pessoaList = new ArrayList<>();
  }
  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }
  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(listaOrdenadaPorIdade);
      return listaOrdenadaPorIdade;
    } else {//Implementar retorno null
      throw new RuntimeException("Lista vazia!");
    }
  }
  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> listaOrdenadaPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()){
      Collections.sort(listaOrdenadaPorAltura, new ComparatorPorAltura());
      return listaOrdenadaPorAltura;
    } else {
      throw new RuntimeException("Lista vazia!");
    }
  }
  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
    ordenacaoPessoas.adicionarPessoa("Ivo",34,1.68);
    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
    ordenacaoPessoas.adicionarPessoa("Pedro", 29, 1.77);

    // Exibindo a lista de pessoas adicionadas
    System.out.println("Exibindo a lista de pessoas adicionadas");
    System.out.println(ordenacaoPessoas.pessoaList);

    // Ordenando e exibindo por idade
    System.out.println("Ordenando e exibindo por idade");
    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    // Ordenando e exibindo por altura
    System.out.println("Ordenando e exibindo por altura");
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}

