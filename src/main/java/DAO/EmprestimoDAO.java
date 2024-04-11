package DAO;

import DTO.EmprestimoDTO;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class EmprestimoDAO {

    //atributos
    private Connection co;
    private PreparedStatement pstm;

    public void cadastrarEmprestimo(EmprestimoDTO objEmprestimoDTO) {
        co = new ConexaoDAO().conectar();
        LocalDate date = LocalDate.of(objEmprestimoDTO.getAnoEmp(), objEmprestimoDTO.getMesEmp(), objEmprestimoDTO.getDiaEmp());
        try {
            String sql = "insert into empresimos (PessoaID, LivroID, DataEmprestimo) values(?,?,STR_TO_DATE(?,'%d-%m-%Y'))";
            pstm = co.prepareStatement(sql);

            pstm.setLong(1, objEmprestimoDTO.getPessoa().getPessoaID());
            pstm.setLong(2, objEmprestimoDTO.getLivro().getLivroID());
            pstm.setString(3, String.valueOf(date));

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Emprestimo criado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }
}
