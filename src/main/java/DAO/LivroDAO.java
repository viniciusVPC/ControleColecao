package DAO;

import DTO.HQDTO;
import DTO.LivroDTO;
import DTO.MangaDTO;
import DTO.ValorNegativoExceptionDTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LivroDAO {

    //atributos
    private Connection co;
    private PreparedStatement pstm;

    public void cadastrarLivro(LivroDTO objLivroDTO) {
        co = new ConexaoDAO().conectar();

        try {
            String sql = "insert into livros (Titulo, Serie, Autor, Volume, DataCompra) values(?,?,?,?,STR_TO_DATE(?,'%Y-%m-%d'))";
            pstm = co.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getTitulo());
            pstm.setString(2, null);
            pstm.setString(3, objLivroDTO.getAutor());
            pstm.setString(4, null);
            pstm.setString(5, String.valueOf(objLivroDTO.getDataCompra()));
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }

    public void cadastrarHQ(HQDTO objHQDTO) {
        co = new ConexaoDAO().conectar();

        try {
            String sql = "insert into livros (Titulo, Serie, Autor, Volume, DataCompra) values(?,?,?,?,STR_TO_DATE(?,'%Y-%m-%d'))";
            pstm = co.prepareStatement(sql);
            pstm.setString(1, objHQDTO.getTitulo());
            pstm.setString(2, objHQDTO.getSerie());
            pstm.setString(3, objHQDTO.getAutor());
            pstm.setInt(4, objHQDTO.getVolume());
            pstm.setString(5, String.valueOf(objHQDTO.getDataCompra()));
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "HQ cadastrada com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }

    public void cadastrarManga(MangaDTO objMangaDTO) {
        co = new ConexaoDAO().conectar();

        try {
            String sql = "insert into livros (Titulo, Serie, Autor, Volume, DataCompra) values(?,?,?,?,STR_TO_DATE(?,'%Y-%m-%d'))";
            pstm = co.prepareStatement(sql);
            pstm.setString(1, objMangaDTO.getTitulo());
            pstm.setString(2, null);
            pstm.setString(3, objMangaDTO.getAutor());
            pstm.setInt(4, objMangaDTO.getVolume());
            pstm.setString(5, String.valueOf(objMangaDTO.getDataCompra()));
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Manga cadastrado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }

    public ResultSet AcessarTabela() {
        co = new ConexaoDAO().conectar();
        try {
            String sql = "select * from livros";
            pstm = co.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
            return null;
        }
    }

//    public void cadastrarLivro(MangaDTO objLivroDTO) {
//        co = new ConexaoDAO().conectar();
//
//        try {
//            String sql = "insert into livros (Titulo, Serie, Autor, Volume, DataCompra) values(?,?,?,?,STR_TO_DATE(?,'%d-%m-%Y'))";
//            pstm = co.prepareStatement(sql);
//            pstm.setString(1, objLivroDTO.getTitulo());
//            pstm.setString(2, null);
//            pstm.setString(3, objLivroDTO.getAutor());
//            pstm.setInt(4, objLivroDTO.getVolume());
//            pstm.setString(5, String.valueOf(objLivroDTO.getDataCompra()));
//            pstm.execute();
//            pstm.close();
//            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!!!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
//        }
//    }
//
//    public void cadastrarLivro(HQDTO objLivroDTO) {
//        co = new ConexaoDAO().conectar();
//
//        try {
//            String sql = "insert into livros (Titulo, Serie, Autor, Volume, DataCompra) values(?,?,?,?,STR_TO_DATE(?,'%d-%m-%Y'))";
//            pstm = co.prepareStatement(sql);
//            pstm.setString(1, objLivroDTO.getTitulo());
//            pstm.setString(2, objLivroDTO.getSerie());
//            pstm.setString(3, objLivroDTO.getAutor());
//            pstm.setInt(4, objLivroDTO.getVolume());
//            
//            pstm.setString(5, String.valueOf(objLivroDTO.getDataCompra()));
//            pstm.execute();
//            pstm.close();
//            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!!!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
//        }
//    }
    public void exibirTudo() throws ValorNegativoExceptionDTO {
        ArrayList<HQDTO> lista = new ArrayList<HQDTO>();
        try {
            co = new ConexaoDAO().conectar();
            String sql = "select * from livros";
            pstm = co.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                HQDTO objHQ = new HQDTO();
                objHQ.setTitulo(rs.getString("Titulo"));
                objHQ.setSerie(rs.getString("Serie"));
                objHQ.setAutor(rs.getString("Autor"));
                objHQ.setVolume(rs.getInt("Volume"));
                objHQ.setDataCompra(LocalDate.parse(rs.getString("DataCompra")));

                lista.add(objHQ);
            }

            System.out.println(lista);
            pstm.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro LivroDAO: " + ex.getMessage());
        }
    }

    public int contarLivros() {
        try {
            co = new ConexaoDAO().conectar();
            String sql = "select count(*) from livros";
            pstm = co.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                pstm.close();
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
