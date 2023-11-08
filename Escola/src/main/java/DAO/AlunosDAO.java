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
import model.AlunosModel;

/**
 *
 * @author aluno
 */
public class AlunosDAO {

    Connection con = null;
    PreparedStatement pstm = null;
    
    public void Atualizar(AlunosModel alunos) {
        String sql = "update alunos set where cpf=?,nome=?,idade=?";
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, alunos.getCpf());
            pstm.setString(2, alunos.getNome());
            pstm.setInt(3, alunos.getIdade());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Aluno Atualizado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Atualizar:" + e);
        }
    }

    public List<AlunosModel> getAlunos() {
        String sql = "select * from produto";
        con = Conexao.createConnection();
       
        try {
            pstm = con.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            ArrayList<AlunosModel> alunos = new ArrayList<>();
            
            while (rset.next()) {
                AlunosModel alunos = new AlunosModel();
                
                alunos.setCpf(rset.getInt("cpf"));
                alunos.setNome(rset.getString("nome"));
                alunos.setIdade(rset.getInt("idade"));
                alunos.add(alunos);
            }

            return alunos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro get:" + e);
            return null;
        }
    }

}