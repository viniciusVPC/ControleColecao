package DAO;

import DTO.HQDTO;
import DTO.LivroDTO;
import DTO.MangaDTO;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class LivroDAO {

    //atributos
    private Connection co;
    private PreparedStatement pstm;

    public void cadastrarLivro(LivroDTO objLivroDTO) {
        co = new ConexaoDAO().conectar();
        LocalDate date = LocalDate.of(objLivroDTO.getAnoCompra(), objLivroDTO.getMesCompra(), objLivroDTO.getDiaCompra());

        try {
            String sql = "insert into livros (Titulo, Autor, DataCompra) values(?,?,toDate(?,'dd-mm-yyyy'))";
            pstm = co.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getTitulo());
            pstm.setString(2, objLivroDTO.getAutor());
            pstm.setString(3, String.valueOf(date));
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }

    public void cadastrarHQ(HQDTO objHQDTO) {
        co = new ConexaoDAO().conectar();
        LocalDate date = LocalDate.of(objHQDTO.getAnoCompra(), objHQDTO.getMesCompra(), objHQDTO.getDiaCompra());

        try {
            String sql = "insert into livros (Titulo, Serie, Autor, Volume, DataCompra) values(?,?,?,?,toDate(?,'dd-mm-yyyy'))";
            pstm = co.prepareStatement(sql);
            pstm.setString(1, objHQDTO.getTitulo());
            pstm.setString(2, objHQDTO.getSerie());
            pstm.setString(3, objHQDTO.getAutor());
            pstm.setInt(4, objHQDTO.getVolume());
            pstm.setString(5, String.valueOf(date));
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "HQ cadastrada com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }

    public void cadastrarHQ(MangaDTO objMangaDTO) {
        co = new ConexaoDAO().conectar();
        LocalDate date = LocalDate.of(objMangaDTO.getAnoCompra(), objMangaDTO.getMesCompra(), objMangaDTO.getDiaCompra());

        try {
            String sql = "insert into livros (Titulo, Autor, Volume, DataCompra) values(?,?,?,toDate(?,'dd-mm-yyyy'))";
            pstm = co.prepareStatement(sql);
            pstm.setString(1, objMangaDTO.getTitulo());
            pstm.setString(3, objMangaDTO.getAutor());
            pstm.setInt(4, objMangaDTO.getVolume());
            pstm.setString(5, String.valueOf(date));
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Manga cadastrado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }
}
