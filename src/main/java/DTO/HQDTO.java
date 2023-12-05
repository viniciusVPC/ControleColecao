package DTO;

public class HQDTO extends LivroDTO {

    String serie;
    int volume;

    public HQDTO(long livroID, String titulo, String autor, String serie, int volume, int diaCompra, int mesCompra, int anoCompra) {
        super(livroID, titulo, autor, diaCompra, mesCompra, anoCompra);
        this.serie = serie;
        this.volume = volume;
    }

    public HQDTO(String titulo, String autor, String serie, int volume, int diaCompra, int mesCompra, int anoCompra) {
        super(titulo, autor, diaCompra, mesCompra, anoCompra);
        this.serie = serie;
        this.volume = volume;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws ValorNegativoExceptionDTO {
        if (volume >= 0) {
            this.volume = volume;
        } else {
            throw new ValorNegativoExceptionDTO();
        }
    }

    @Override
    public String toString() {
        return "Informações: "
                + "\n\tTitulo: " + titulo
                + "\n\tAutor: " + autor
                + "\n\tSérie: " + serie
                + "\n\tVolume: " + volume
                + "\n\tData da compra: " + diaCompra + "/" + mesCompra + "/" + anoCompra;
    }

}
