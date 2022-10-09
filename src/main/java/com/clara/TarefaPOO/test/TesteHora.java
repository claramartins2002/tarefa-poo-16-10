package com.clara.TarefaPOO.test;

import com.clara.TarefaPOO.model.Hora;

public class TesteHora {
    public static void main(String[] args) {
        Hora hora = new Hora(18, 48, 03);
        System.out.println("Que horas são? "+hora.mostrarHora());
    }
    }
