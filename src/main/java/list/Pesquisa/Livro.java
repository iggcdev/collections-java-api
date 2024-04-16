package main.java.list.Pesquisa;

public class Livro {
    private String autor;
    private String titulo;
    private int anoPublicacao;
    private String categoria;

    public Livro(String titulo, String autor ,int anoPublicacao, String categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return String.format("| %-25s | %-30s | %-15d | %-20s |",titulo, autor, anoPublicacao, categoria);
    }

    public static class OpcaoInvalidaException extends Throwable {
        public OpcaoInvalidaException(String s) {
            super(s);
        }
    }
}
