package DTO;

public class LivroDTO {

    long livroID;
    String titulo, autor;
    int diaCompra, mesCompra, anoCompra;

    public LivroDTO(long livroID, String titulo, String autor, int diaCompra, int mesCompra, int anoCompra) {
        this.livroID = livroID;
        this.titulo = titulo;
        this.autor = autor;
        this.diaCompra = diaCompra;
        this.mesCompra = mesCompra;
        this.anoCompra = anoCompra;
    }

    public LivroDTO(String titulo, String autor, int diaCompra, int mesCompra, int anoCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.diaCompra = diaCompra;
        this.mesCompra = mesCompra;
        this.anoCompra = anoCompra;
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

    public int getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(int diaCompra) throws ValorNegativoExceptionDTO {
        if (diaCompra > 0) {
            this.diaCompra = diaCompra;

        } else {
            throw new ValorNegativoExceptionDTO();
        }
    }

    public int getMesCompra() {
        return mesCompra;
    }

    public void setMesCompra(int mesCompra) throws ValorNegativoExceptionDTO {
        if (mesCompra > 0) {
            this.mesCompra = mesCompra;

        } else {
            throw new ValorNegativoExceptionDTO();
        }
    }

    public int getAnoCompra() {
        return anoCompra;
    }

    public void setAnoCompra(int anoCompra) throws ValorNegativoExceptionDTO {
        if (anoCompra > 0) {
            this.anoCompra = anoCompra;

        } else {
            throw new ValorNegativoExceptionDTO();
        }
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
                + "\n\tData da compra: " + diaCompra +"/"+mesCompra+"/"+anoCompra;
    }

}
