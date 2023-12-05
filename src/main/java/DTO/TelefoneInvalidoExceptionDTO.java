package DTO;

public class TelefoneInvalidoExceptionDTO extends Exception {

    @Override
    public String getMessage() {
        return ("Numero de telefone inválido. Por favor insira um número com 11 dígitos (com o 9 na frente)");
    }
}
