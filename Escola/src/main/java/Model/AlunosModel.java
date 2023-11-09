/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aluno
 */
public class AlunosModel {
    int id_alunos;
    int cpf;
    String nome;
    int idade;
    public int getId_alunos;
    

    public AlunosModel() {
    }

    
    public AlunosModel(int id_alunos, int cpf, String nome, int idade) {
        this.id_alunos = id_alunos;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
    
    public int getId_alunos() {
        return id_alunos;
    }

    public void setId_alunos(int id_alunos) {
        this.id_alunos = id_alunos;
        
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

    public void add(AlunosModel alunos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }       
}