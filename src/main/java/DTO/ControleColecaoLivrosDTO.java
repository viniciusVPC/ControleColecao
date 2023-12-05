package DTO;

import java.util.ArrayList;

public class ControleColecaoLivrosDTO {

    public ArrayList<LivroDTO> biblioteca = new ArrayList<LivroDTO>();

    public void addLivro(LivroDTO livro) {
        biblioteca.add(livro);
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

    public ArrayList<LivroDTO> getLivro(int dia, int mes, int ano) {
        ArrayList<LivroDTO> livros = new ArrayList<LivroDTO>();
        for (LivroDTO liv : biblioteca) {
            if (liv.getDiaCompra() == dia && liv.getMesCompra() == mes && liv.getAnoCompra() == ano) {
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
        for (LivroDTO livro : biblioteca) {
            System.out.println(livro.toString());
        }
    }
}
