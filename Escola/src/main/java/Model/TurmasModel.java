/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aluno
 */
public class TurmasModel {
    int numero;
    String professor;
    String alunos;
    String disciplina;

    public TurmasModel() {
    }

    
    public TurmasModel(int numero, String nome, String alunos, String disciplina) {
        this.numero = numero;
        this.professor = professor;
        this.alunos = alunos;
        this.disciplina = disciplina;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int codigo) {
        this.numero = numero;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getAlunos() {
        return alunos;
    }

    public void setAlunos(String alunos) {
        this.alunos = alunos;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    

       
}