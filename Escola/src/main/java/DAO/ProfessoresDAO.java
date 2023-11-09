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
        String sql = "update alunos set cpf=?,nome=?,idade=?,disciplina=? where id_professores=?";
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1, professores.getId_professores());
            pstm.setInt(2, professores.getCpf());
            pstm.setString(3, professores.getNome());
            pstm.setInt(4, professores.getIdade());
            pstm.setString(5,professores.getDisciplina());
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
                
                professores.setId_professores(rset.getInt("Id_professores"));
                professores.setCpf(rset.getInt("cpf"));
                professores.setNome(rset.getString("nome"));
                professores.setIdade(rset.getInt("idade"));
                professores.setDisciplina(rset.getString("disciplina"));
                professores.add(professores);
            }

            return professores;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro get:" + e);
            return null;
        }
    }

    

}