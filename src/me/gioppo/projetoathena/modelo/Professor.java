package me.gioppo.projetoathena.modelo;

import me.gioppo.projetoathena.modelo.base.Cpf;
import me.gioppo.projetoathena.modelo.base.Senha;

public class Professor extends Usuario{
    
    public Professor(String identificador, String nomeDeUsuario, Senha senha, String primeiroNome, String sobrenome, Cpf cpf) {
        super(identificador, nomeDeUsuario, senha, Usuario.TIPO_PROFESSOR, primeiroNome, sobrenome, cpf);
    }
    
}
