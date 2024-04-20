package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    //Atributos
    private String url = "jdbc:mysql://localhost:3306/biblioteca";
    private String nome = "root";
    private String senha = "1234";
    private Connection conexao;

    public Connection conectar() {
        try {
            conexao = DriverManager.getConnection(url, nome, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ConexaoDAO: " + ex.getMessage());
        } 
        return conexao;
    }
}
