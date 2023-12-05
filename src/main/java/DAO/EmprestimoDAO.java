package DAO;

import DTO.EmprestimoDTO;
import java.sql.*;
import javax.swing.JOptionPane;


public class EmprestimoDAO {
    //atributos
    private Connection co;
    private PreparedStatement pstm;
    
    public void cadastrarEmprestimo(EmprestimoDTO objEmprestimoDTO) {
        co = new ConexaoDAO().conectar();

        try {
            String sql = "insert into empresimos (PessoaID, LivroID, DataEmprestimo) values(?,?,toDate(?,'dd-mm-yyyy'))";
            pstm = co.prepareStatement(sql);

            pstm.setLong(1, objEmprestimoDTO.getPessoa().getPessoaID());
            pstm.setLong(2, objEmprestimoDTO.getLivro().getLivroID());
            pstm.set
           
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }
}
