package me.gioppo.projetoathena.contratos;

import me.gioppo.projetoathena.modelo.Funcionario;

public interface RepositorioDeFuncionarios {
    
    public void salvarFuncionario(Funcionario funcionario);
    public void excluirFuncionario(Funcionario funcionario);
    public void atualizarFuncionario(Funcionario funcionario);
    public Funcionario buscarPorIdentificador(String identificador);

}
