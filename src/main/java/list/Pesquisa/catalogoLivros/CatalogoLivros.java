package main.java.list.Pesquisa.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros implements Iterable<Livro> {
    List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    @Override
    public java.util.Iterator<Livro> iterator() {
        return livroList.iterator();
    }
    public void adicionarLivro(
            String titulo,
            String autor,
            int anoPublicacao,
            String categoria
    ) {
//        Livro l = new Livro(titulo,autor,anoPublicacao,categoria);
//        livroList.add(l);
            livroList.add(new Livro(titulo, autor, anoPublicacao, categoria));
    }
    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        for(Livro l: livroList){
            if(!livroList.isEmpty())if(l.getAutor().equalsIgnoreCase(autor)) livrosPorAutor.add(l);
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarLivros(String selecao, String valor) throws Livro.OpcaoInvalidaException {
        List<Livro> livrosEncontrados = new ArrayList<>();
        switch (selecao) {
            case "titulo":
                for(Livro l: livroList) {
                    if (l.getTitulo().equalsIgnoreCase(valor)) {
                        livrosEncontrados.add(l);
                    }
                }
                break;
            case "autor":
                for(Livro l: livroList) {
                    if (l.getAutor().equalsIgnoreCase(valor)) {
                        livrosEncontrados.add(l);
                    }
                }
                break;
            case "anoPublicacao":
                for(Livro l: livroList) {
                    if (Integer.toString(l.getAnoPublicacao()).equals(valor)) {
                        livrosEncontrados.add(l);
                    }
                }
                break;
            case "categoria":
                for(Livro l: livroList) {
                    if (l.getCategoria().equalsIgnoreCase(valor)) {
                        livrosEncontrados.add(l);
                    }
                    }
                break;
            default:
                throw new Livro.OpcaoInvalidaException("Seleção inválida.");

        }
    return livrosEncontrados;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();
        //Boolean encontrado = false;
        for(Livro l: livroList){
            if (!livroList.isEmpty()) if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) livrosEncontrados.add(l);
        }
        return livrosEncontrados;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) for (Livro l : livroList) if (l.getTitulo().equalsIgnoreCase(titulo)) livroPorTitulo = l;
        return livroPorTitulo;
    }

    public void listarLivros(){
        System.out.println("+---------------------------+--------------------------------+-----------------+--------------------+");
        System.out.println("| Titulo                     | Autor                         | Ano Publicação  | Categoria          |");
        System.out.println("+---------------------------+--------------------------------+-----------------+--------------------+");

        for (Livro l: livroList) {
            System.out.println(l);
        }

        System.out.println("+---------------------------+--------------------------------+-----------------+--------------------+");    }
    public static void main(String[] args) throws Livro.OpcaoInvalidaException {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("1984","George Orwell",1949,"Ficção");
        catalogoLivros.adicionarLivro("Dom Quixote","Machado de Assis",1794,"Aventura");
        catalogoLivros.adicionarLivro("O Pequeno Principe","Antoine de Saint-Exupéry",1943,"Literatura Infantil");
        catalogoLivros.adicionarLivro("A Revolução dos Bichos","George Orwell",1945,"Sátira");
        catalogoLivros.adicionarLivro("teste","Gabriel",1990,"fantasia");


        catalogoLivros.listarLivros();

//      System.out.println(catalogoLivros.pesquisarLivros("autor","George Orwell"));
        System.out.println("Livros entre anos 1200 e 1900:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1200,1900));
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Pesquisa por titulo");
        System.out.println(catalogoLivros.pesquisarPorTitulo("A Revolução dos Bichos"));
        System.out.println("--------------------------------------------------------------------------");
        for (Livro l : catalogoLivros.pesquisarLivrosPorAutor("Ivo")) System.out.println(l);
        for (Livro l : catalogoLivros.pesquisarLivrosPorAutor("George Orwell")) System.out.println(l);


    }
}
