package me.gioppo.projetoathena.controladores;

import java.util.List;
import me.gioppo.projetoathena.contratos.RepositorioDeFuncionarios;
import me.gioppo.projetoathena.contratos.verificadores.VerificadorControleFuncionario;
import me.gioppo.projetoathena.modelo.Funcionario;

public class ControladorFuncionarios {

    private final VerificadorControleFuncionario verificadorControleFuncionario;
    private final RepositorioDeFuncionarios repositorioDeFuncionarios;

    public ControladorFuncionarios(
            VerificadorControleFuncionario verificarControleFuncionario,
            RepositorioDeFuncionarios repositorioDeFuncionarios
    ) {
        this.verificadorControleFuncionario = verificarControleFuncionario;
        this.repositorioDeFuncionarios = repositorioDeFuncionarios;
    }

    public void incluirFuncionario(Funcionario funcionario) {
        if(verificadorControleFuncionario.verificarPermissaoParaIncluir()){
            repositorioDeFuncionarios.salvarFuncionario(funcionario);
        }
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        if(verificadorControleFuncionario.verificarPermissaoParaIncluir()){
            repositorioDeFuncionarios.atualizarFuncionario(funcionario);
        }
    }
    
    public List<Funcionario> listarFuncionarios() {
        if(verificadorControleFuncionario.verificarPermissaoParaVisualizar()){
            return repositorioDeFuncionarios.listarFuncionarios();
        }
        return null;
    }
    
    public Funcionario visualizarFuncionario(String identificador) {
        if(verificadorControleFuncionario.verificarPermissaoParaVisualizar()){
            return repositorioDeFuncionarios.buscarPorIdentificador(identificador);
        }
        return null;
    }

    public void excluirFuncionario(Funcionario funcionario) {
        if(verificadorControleFuncionario.verificarPermissaoParaIncluir()){
            repositorioDeFuncionarios.excluirFuncionario(funcionario);
        }
    }

}
