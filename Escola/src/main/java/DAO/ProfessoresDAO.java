/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mycompany.escola.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ProfessoresModel;

/**
 *
 * @author aluno
 */
public class ProfessoresDAO {

    Connection con = null;
    PreparedStatement pstm = null;
    
    public void Atualizar(ProfessoresModel professores) {
        String sql = "update alunos set where cpf=?,nome=?,idade=?,disciplina=?";
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, professores.getCpf());
            pstm.setString(2, professores.getNome());
            pstm.setInt(3, professores.getIdade());
            pstm.setString(4,professores.getDisciplina());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Professor Atualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Atualizar:" + e);
        }
    }

    public List<ProfessoresModel> getProfessores() {
        String sql = "select * from professores";
        con = Conexao.createConnection();
       
        try {
            pstm = con.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            ArrayList<ProfessoresModel> professores = new ArrayList<>();
            
            while (rset.next()) {
                ProfessoresModel professores = new ProfessoresModel();
                
                Professores.setCpf(rset.getInt("cpf"));
                Professores.setNome(rset.getString("nome"));
                Professores.setIdade(rset.getInt("idade"));
                Professores.setDisciplina(rset.getString("disciplina"));
                Professores.add(professores);
            }

            return professores;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro get:" + e);
            return null;
        }
    }

    private static class Professores {

        private static void setCpf(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setDisciplina(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setNome(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setIdade(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void add(ProfessoresModel professores) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Professores() {
        }
    }

}