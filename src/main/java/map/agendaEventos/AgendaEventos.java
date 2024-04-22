package main.java.map.agendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> agendaEventos;

    public AgendaEventos() {
        this.agendaEventos = new HashMap<>();
    }

    @Override
    public String toString() {
        return "AgendaEventos{" +
                "agendaEventos=" + agendaEventos +
                '}';
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao, int duracaoMinutos){
        agendaEventos.put(data,new Evento(nome,atracao,duracaoMinutos));
    }
    public Map<LocalDate,Evento> exibirAgenda(){
        Map<LocalDate,Evento> agendaEmOrdem = new TreeMap<>(agendaEventos);
        if (!agendaEmOrdem.isEmpty()){
            return agendaEmOrdem;
        } else {
            throw new RuntimeException("Agenda Vazia!");
        }

    }
    public Map<LocalDate, Evento> obterProximoEvento(){
        Map<LocalDate,Evento> proximoEvento = new HashMap<>();
        Map<LocalDate,Evento> agendaEmOrdem = new TreeMap<>(agendaEventos);
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : agendaEventos.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximoEvento.put(entry.getKey(),entry.getValue());
                break;
            }
        }
        return proximoEvento;

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024,07,04),"Promotio Job","Work",360);
        agendaEventos.adicionarEvento(LocalDate.of(2024,05,01),"New Job","Work",360);
        agendaEventos.adicionarEvento(LocalDate.of(2025,05,01),"New Promotion Job","Work",360);

        System.out.println("Exibe agenda:");
        System.out.println(agendaEventos.exibirAgenda());

        System.out.println("Mostra proximo evento:");
        System.out.println(agendaEventos.obterProximoEvento());
    }
}
