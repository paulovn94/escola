/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Conexao {
    public static final String url = "jdbc:mysql://localhost/escola";
    public static final String user = "root";
    public static final String pass = "";
    
    public static Connection createConnection(){
        try {
            Connection con = DriverManager.getConnection(url,user,pass);
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public static void main(String[] args) throws SQLException {
        Connection con = createConnection();
        if (con!=null) {
            JOptionPane.showMessageDialog(null, "Conexão Realizada");
            con.close();
        }
    }
}