package com.clara.TarefaPOO.test;

import com.clara.TarefaPOO.model.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
    Aluno aluno = new Aluno("Clara", "Matemática", 7.3);
    System.out.println(aluno.mostrarAluno());
    System.out.println("Situação: "+aluno.mostrarSituacao());
    }
    }
