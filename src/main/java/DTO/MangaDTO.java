package DTO;

import java.time.LocalDate;

public class MangaDTO extends LivroDTO {

    int volume;

    public MangaDTO(long livroID, String titulo, String autor, int volume, LocalDate dataCompra) {
        super(livroID, titulo, autor, dataCompra);
        this.volume = volume;
    }

    public MangaDTO(String titulo, String autor, int volume, LocalDate dataCompra) {
        super(titulo, autor, dataCompra);
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
                + "\n\tData da compra: " + dataCompra;
    }
}
