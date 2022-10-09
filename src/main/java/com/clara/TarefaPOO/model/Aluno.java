package com.clara.TarefaPOO.model;

public class Aluno {
    private String nome;
    private String disciplina;
    private double notaFinal;

    public Aluno(String n, String d, double nf) {
        nome = n;
        disciplina = d;
        notaFinal = nf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String mostrarSituacao(){
        if(notaFinal>6){
            return "Aprovado";
        }
        else if(notaFinal >=4){
            return "Recuperação";
        }
        return "Reprovado";
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }



    public String mostrarAluno() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
