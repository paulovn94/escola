/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aluno
 */
public class ProfessoresModel {
    int id_professores;
    int cpf;
    String nome;
    int idade;
    String disciplina;
    

    public ProfessoresModel() {
    }

    
    public ProfessoresModel(int id_professores, int cpf, String nome, int idade, String disciplina) {
        this.id_professores = id_professores;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
    }

    public int getId_professores() {
        return id_professores;
    }

    public void setId_professores(int id_professores) {
        this.id_professores = id_professores;
        
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int codigo) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
public void add(ProfessoresModel professores) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
}
}