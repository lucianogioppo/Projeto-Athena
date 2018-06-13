package me.gioppo.projetoathena.servicos;

import java.util.ArrayList;
import java.util.List;
import me.gioppo.projetoathena.contratos.RepositorioDeFuncionarios;
import me.gioppo.projetoathena.modelo.Funcionario;

public class RepositorioDeFuncionariosEmMemoria implements RepositorioDeFuncionarios{

    private final List<Funcionario> funcionariosEmMemoria;
    
    public RepositorioDeFuncionariosEmMemoria(){
        this.funcionariosEmMemoria = new ArrayList<>();
    }
    
    @Override
    public boolean salvarFuncionario(Funcionario funcionario) {
        this.funcionariosEmMemoria.add(funcionario);
        return true;
    }

    @Override
    public boolean excluirFuncionario(Funcionario funcionario) {
        this.funcionariosEmMemoria.remove(funcionario);
        return true;
    }

    @Override
    public boolean atualizarFuncionario(Funcionario funcionario) {
        Funcionario funcionarioEmMemoria = this.buscarPorIdentificador(funcionario.getIdentificador());
        if(funcionarioEmMemoria == null){
            System.out.println("Deu erro aqui, o usuário precisa estar inserido para ser atualizado");
            return false;
        }
        this.excluirFuncionario(funcionarioEmMemoria);
        this.salvarFuncionario(funcionario);
        return true;
    }

    @Override
    public Funcionario buscarPorIdentificador(String identificador) {
        for(Funcionario funcionario : funcionariosEmMemoria){
            if(funcionario.getIdentificador().equals(identificador)){
                return funcionario;
            }
        }
        
        return null;
    }
    
    public int contarFuncionarios() {
        return this.funcionariosEmMemoria.size();
    }

    @Override
    public List<Funcionario> listarFuncionarios() {
        return funcionariosEmMemoria;
    }
}
