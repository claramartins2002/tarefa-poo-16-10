package com.clara.TarefaPOO.model;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora) {
        this.hora = hora;
    }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String mostrarHora() {
        return hora+":"+minuto+":"+segundo;
    }
}
