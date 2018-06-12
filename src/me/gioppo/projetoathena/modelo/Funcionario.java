package me.gioppo.projetoathena.modelo;

import me.gioppo.projetoathena.modelo.base.Cpf;
import me.gioppo.projetoathena.modelo.base.Senha;

public class Funcionario extends Usuario{
    
    public Funcionario(String identificador, String nomeDeUsuario, Senha senha, String primeiroNome, String sobrenome, Cpf cpf) {
        super(identificador, nomeDeUsuario, senha, Usuario.TIPO_FUNCIONARIO, primeiroNome, sobrenome, cpf);
    }
    
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    
}
