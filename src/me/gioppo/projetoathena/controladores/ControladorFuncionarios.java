package me.gioppo.projetoathena.controladores;

import java.util.List;
import me.gioppo.projetoathena.contratos.RepositorioDeFuncionarios;
import me.gioppo.projetoathena.contratos.RepositorioDeUsuarios;
import me.gioppo.projetoathena.contratos.verificadores.VerificadorControleFuncionario;
import me.gioppo.projetoathena.modelo.Funcionario;

public class ControladorFuncionarios {

    private final VerificadorControleFuncionario verificadorControleFuncionario;
    private final RepositorioDeFuncionarios repositorioDeFuncionarios;
    private final RepositorioDeUsuarios repositorioDeUsuarios;

    public ControladorFuncionarios(
            VerificadorControleFuncionario verificarControleFuncionario,
            RepositorioDeFuncionarios repositorioDeFuncionarios,
            RepositorioDeUsuarios repositorioDeUsuarios
    ) {
        this.verificadorControleFuncionario = verificarControleFuncionario;
        this.repositorioDeFuncionarios = repositorioDeFuncionarios;
        this.repositorioDeUsuarios = repositorioDeUsuarios;
    }

    public boolean incluirFuncionario(Funcionario funcionario) {
        if(verificadorControleFuncionario.verificarPermissaoParaIncluir()){
            return repositorioDeFuncionarios.salvarFuncionario(funcionario) && repositorioDeUsuarios.adicionarUsuario(funcionario);
        }else{
            return false;
        }
    }

    public boolean atualizarFuncionario(Funcionario funcionario) {
        if(verificadorControleFuncionario.verificarPermissaoParaIncluir()){
            return repositorioDeFuncionarios.atualizarFuncionario(funcionario);
        }
        
        return false;
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

    public boolean excluirFuncionario(Funcionario funcionario) {
        if(verificadorControleFuncionario.verificarPermissaoParaIncluir()){
            return repositorioDeFuncionarios.excluirFuncionario(funcionario);
        }
        
        return false;
    }

}
