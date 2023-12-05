package DAO;

import DTO.PessoaDTO;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class PessoaDAO {

    //atributos
    private Connection co;
    private PreparedStatement pstm;

    public void cadastrarPessoa(PessoaDTO objPessoaDTO) {
        co = new ConexaoDAO().conectar();

        try {
            String sql = "insert into pessoas (Nome, TelefoneContato, CorFavorita) values(?,?,?)";
            pstm = co.prepareStatement(sql);

            pstm.setString(1, objPessoaDTO.getNome());
            pstm.setString(2, objPessoaDTO.getTelefoneContato());
            pstm.setString(3, objPessoaDTO.getCorFavorita());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }
}
