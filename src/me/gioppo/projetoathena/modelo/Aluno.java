package me.gioppo.projetoathena.modelo;

import me.gioppo.projetoathena.modelo.base.Cpf;

public class Aluno extends Pessoa{
    
    private String matricula;
    
    public Aluno(String identificador, String matricula, String primeiroNome, String sobrenome, Cpf cpf) {
        super(identificador, primeiroNome, sobrenome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    
}
