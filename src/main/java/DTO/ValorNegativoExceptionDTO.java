package DTO;

public class ValorNegativoExceptionDTO extends Exception{
    @Override
    public String getMessage(){
        return("O valor inserido não pode ser negativo.");
    }
    
}
