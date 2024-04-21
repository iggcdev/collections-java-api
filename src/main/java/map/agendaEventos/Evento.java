package main.java.map.agendaEventos;

public class Evento {
    private String nome;
    private String atraca;
    private int duracaoMinutos;

    public Evento(String nome, String atraca, int duracaoMinutos) {
        this.nome = nome;
        this.atraca = atraca;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atraca='" + atraca + '\'' +
                ", duracaoMinutos=" + duracaoMinutos +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtraca() {
        return atraca;
    }

    public void setAtraca(String atraca) {
        this.atraca = atraca;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
