package me.gioppo.projetoathena.modelo;

import me.gioppo.projetoathena.modelo.base.Cpf;
import me.gioppo.projetoathena.modelo.base.Senha;

abstract public class Usuario extends Pessoa{
    
    public static final int TIPO_SECRETARIA = 0;
    public static final int TIPO_FUNCIONARIO = 1;
    public static final int TIPO_PROFESSOR = 2;
    public static final int TIPO_DIRETOR = 3;
    
    private String nomeDeUsuario;
    private Senha senha;
    private int tipoDeUsuario;
    
    public Usuario(String identificador, String nomeDeUsuario, Senha senha, int tipoDeUsuario, String primeiroNome, String sobrenome, Cpf cpf) {
        super(identificador, primeiroNome, sobrenome, cpf);
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public Senha getSenha() {
        return senha;
    }

    public int getTipoDeUsuario() {
        return tipoDeUsuario;
    }
    
}
