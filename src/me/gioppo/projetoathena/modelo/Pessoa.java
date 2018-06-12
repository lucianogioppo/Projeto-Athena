package me.gioppo.projetoathena.modelo;

import me.gioppo.projetoathena.modelo.base.Cpf;

abstract public class Pessoa {
    
    private final String identificador;
    protected String primeiroNome;
    protected String sobrenome;
    protected Cpf cpf;

    public Pessoa(String identificador, String primeiroNome, String sobrenome, Cpf cpf) {
        this.identificador = identificador;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getIdentificador() {
        return identificador;
    }
    
    public String getNomeCompleto() {
        return primeiroNome + " " + sobrenome;
    }
    
    public Cpf getCpf() {
        return cpf;
    }
    
}
