package DTO;

public class EmprestimoDTO {

    long emprestimoID;
    PessoaDTO pessoa;
    LivroDTO livro;
    int diaEmp, mesEmp, anoEmp;

    public EmprestimoDTO(long emprestimoID, PessoaDTO pessoa, LivroDTO livro, int diaEmp, int mesEmp, int anoEmp) {
        this.emprestimoID = emprestimoID;
        this.pessoa = pessoa;
        this.livro = livro;
        this.diaEmp = diaEmp;
        this.mesEmp = mesEmp;
        this.anoEmp = anoEmp;
    }
    
    public EmprestimoDTO(PessoaDTO pessoa, LivroDTO livro, int diaEmp, int mesEmp, int anoEmp) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.diaEmp = diaEmp;
        this.mesEmp = mesEmp;
        this.anoEmp = anoEmp;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public LivroDTO getLivro() {
        return livro;
    }

    public void setLivro(LivroDTO livro) {
        this.livro = livro;
    }

    public int getDiaEmp() {
        return diaEmp;
    }

    public void setDiaEmp(int diaEmp) {
        this.diaEmp = diaEmp;
    }

    public int getMesEmp() {
        return mesEmp;
    }

    public void setMesEmp(int mesEmp) {
        this.mesEmp = mesEmp;
    }

    public int getAnoEmp() {
        return anoEmp;
    }

    public void setAnoEmp(int anoEmp) {
        this.anoEmp = anoEmp;
    }

    
}
