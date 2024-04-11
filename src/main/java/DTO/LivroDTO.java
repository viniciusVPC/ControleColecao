package DTO;

import java.time.LocalDate;

public class LivroDTO {

    long livroID;
    String titulo, autor;
    LocalDate dataCompra;

    public LivroDTO() {
    }

    ;
    
    public LivroDTO(long livroID, String titulo, String autor, LocalDate dataCompra) {
        this.livroID = livroID;
        this.titulo = titulo;
        this.autor = autor;
        this.dataCompra = dataCompra;
    }

    public LivroDTO(String titulo, String autor, LocalDate dataCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataCompra = dataCompra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public long getLivroID() {
        return livroID;
    }

    public void setLivroID(long livroID) {
        this.livroID = livroID;
    }

    public String toString() {
        return "Informações: "
                + "\n\tTitulo: " + titulo
                + "\n\tAutor: " + autor
                + "\n\tData da compra: " + dataCompra;
    }

}
