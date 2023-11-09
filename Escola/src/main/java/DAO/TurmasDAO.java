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
import model.TurmasModel;

/**
 *
 * @author aluno
 */
public class TurmasDAO {

    Connection con = null;
    PreparedStatement pstm = null;
    
    public void Atualizar(TurmasModel turmas) {
        String sql = "update alunos set numero=?,professor=?,alunos=?,disciplina=? where id_turmas=?";
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, turmas.getId_turmas());
            pstm.setInt(2, turmas.getNumero());
            pstm.setString(3, turmas.getProfessor());
            pstm.setString(4, turmas.getAlunos());
            pstm.setString(5,turmas.getDisciplina());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Turma Atualizada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Atualizar:" + e);
        }
    }

    public List<TurmasModel> getTurmas() {
        String sql = "select * from turmas";
        con = Conexao.createConnection();
       
        try {
            pstm = con.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            ArrayList<TurmasModel> turmas = new ArrayList<>();
            
            while (rset.next()) {
                TurmasModel turmas = new TurmasModel();
                
                
                turmas.setCpf(rset.getInt("numero"));
                turmas.setNome(rset.getString("nome"));
                turmas.setIdade(rset.getInt("idade"));
                turmas.setDisciplina(rset.getString("disciplina"));
                turmas.add(turmas);
            }

            return turmas;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro get:" + e);
            return null;
        }
    }

    private static class Turmas {

        private static void setCpf(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setNome(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setIdade(int aInt) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setDisciplina(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void add(TurmasModel turmas) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Turmas() {
        }
    }

}