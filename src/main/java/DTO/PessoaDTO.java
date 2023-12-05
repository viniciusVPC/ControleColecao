package DTO;

public class PessoaDTO {

    long pessoaID;
    String nome, telefoneContato, corFavorita;

    public PessoaDTO(long pessoaID, String nome, String telefoneContato, String corFavorita) {
        this.pessoaID = pessoaID;
        this.nome = nome;
        this.telefoneContato = telefoneContato;
        this.corFavorita = corFavorita;
    }

    public PessoaDTO(String nome, String telefoneContato, String corFavorita) {
        this.nome = nome;
        this.telefoneContato = telefoneContato;
        this.corFavorita = corFavorita;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) throws TelefoneInvalidoExceptionDTO {
        if (telefoneContato.length() == 11) {
            this.telefoneContato = telefoneContato;
        } else {
            throw new TelefoneInvalidoExceptionDTO();
        }
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }

    public long getPessoaID() {
        return pessoaID;
    }

    public void setPessoaID(long pessoaID) {
        this.pessoaID = pessoaID;
    }

    
}
