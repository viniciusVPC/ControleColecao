package DTO;

import DAO.LivroDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControleColecaoLivrosDTO {

    public ArrayList<LivroDTO> biblioteca = new ArrayList<LivroDTO>();

    public void addLivro(LivroDTO livro) {
        //biblioteca.add(livro);
        LivroDAO livroDAO = new LivroDAO();
        livroDAO.cadastrarLivro(livro);
    }
    
    public void addManga(MangaDTO manga) {
        //biblioteca.add(livro);
        LivroDAO livroDAO = new LivroDAO();
        livroDAO.cadastrarManga(manga);
    }
    
    public void addHQ(HQDTO hq) {
        //biblioteca.add(livro);
        LivroDAO livroDAO = new LivroDAO();
        livroDAO.cadastrarHQ(hq);
    }

    public LivroDTO getLivro(LivroDTO livro) {
        return biblioteca.get(biblioteca.indexOf(livro));
    }

    public LivroDTO getLivro(int index) {
        try {
            return biblioteca.get(index - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Livro(s) não encontrado(s)");
            return null;
        }
    }

    public ArrayList<LivroDTO> getLivro(String titulo) {
        ArrayList<LivroDTO> livros = new ArrayList<LivroDTO>();
        for (LivroDTO liv : biblioteca) {
            if (liv.getTitulo() == titulo) {
                livros.add(liv);
            }
        }
        if (!livros.isEmpty()) {
            return livros;
        }
        System.out.println("Livro(s) não encontrado(s).");
        return null;
    }

    public ArrayList<LivroDTO> getLivro(String autor, int num) {
        ArrayList<LivroDTO> livros = new ArrayList<LivroDTO>();
        for (LivroDTO liv : biblioteca) {
            if (liv.getAutor() == autor) {
                livros.add(liv);
            }
        }
        if (!livros.isEmpty()) {
            return livros;
        }
        System.out.println("Livro(s) não encontrado(s).");
        return null;
    }

    public ArrayList<LivroDTO> getLivro(LocalDate dataCompra) {
        ArrayList<LivroDTO> livros = new ArrayList<LivroDTO>();
        for (LivroDTO liv : biblioteca) {
            if (liv.getDataCompra() == dataCompra) {
                livros.add(liv);
            }
        }
        if (!livros.isEmpty()) {
            return livros;
        }
        System.out.println("Livro(s) não encontrado(s).");
        return null;

    }

    public void removeLivro(LivroDTO livro) {
        biblioteca.remove(biblioteca.indexOf(livro));
    }

    public void atualizaLivro(LivroDTO livro) {
        biblioteca.set(biblioteca.indexOf(livro), livro);
    }

    public void displayLivros() {
        LivroDAO livroDAO = new LivroDAO();
        System.out.println("teste");
        try {
            livroDAO.exibirTudo();
        } catch (ValorNegativoExceptionDTO ex) {
            Logger.getLogger(ControleColecaoLivrosDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
