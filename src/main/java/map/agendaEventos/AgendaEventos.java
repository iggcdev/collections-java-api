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
    public void adicionarEvento(LocalDate data,String nome,String atracao, int duracaoMinutos){
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

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024,07,04),"New Job","Work",360);
    }
}
