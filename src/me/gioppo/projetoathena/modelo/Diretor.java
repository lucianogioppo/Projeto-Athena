package me.gioppo.projetoathena.modelo;

import me.gioppo.projetoathena.modelo.base.Cpf;
import me.gioppo.projetoathena.modelo.base.Senha;

public class Diretor extends Usuario{
    
    public Diretor(String identificador, String nomeDeUsuario, Senha senha, String primeiroNome, String sobrenome, Cpf cpf) {
        super(identificador, nomeDeUsuario, senha, Usuario.TIPO_DIRETOR, primeiroNome, sobrenome, cpf);
    }
    
}
