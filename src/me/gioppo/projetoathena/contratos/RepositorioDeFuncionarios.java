package me.gioppo.projetoathena.contratos;

import java.util.List;
import me.gioppo.projetoathena.modelo.Funcionario;

public interface RepositorioDeFuncionarios {
    
    public boolean salvarFuncionario(Funcionario funcionario);
    public boolean excluirFuncionario(Funcionario funcionario);
    public boolean atualizarFuncionario(Funcionario funcionario);
    public Funcionario buscarPorIdentificador(String identificador);
    public List<Funcionario> listarFuncionarios();

}
