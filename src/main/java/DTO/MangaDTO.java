package DTO;

public class MangaDTO extends LivroDTO {

    int volume;

    public MangaDTO(long livroID, String titulo, String autor, int volume, int diaCompra, int mesCompra, int anoCompra) {
        super(livroID, titulo, autor, diaCompra, mesCompra, anoCompra);
        this.volume = volume;
    }

    public MangaDTO(int volume, String titulo, String autor, int diaCompra, int mesCompra, int anoCompra) {
        super(titulo, autor, diaCompra, mesCompra, anoCompra);
        this.volume = volume;
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
                + "\n\tVolume: " + volume
                + "\n\tData da compra: " + diaCompra +"/"+mesCompra+"/"+anoCompra;
    }
}
