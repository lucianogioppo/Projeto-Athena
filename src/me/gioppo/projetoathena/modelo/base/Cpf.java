package me.gioppo.projetoathena.modelo.base;

public class Cpf {
    
    private String cpfTexto;

    public Cpf(String cpfTexto) {
        this.cpfTexto = cpfTexto;
    }
    
    public String getCpfFormatado() {
        return cpfTexto;
    }
    
    public boolean cpfValido() {
        return true;
    }
    
}
