package me.gioppo.projetoathena.controladores;

import me.gioppo.projetoathena.contratos.RepositorioDeFuncionarios;
import me.gioppo.projetoathena.contratos.SessaoDeUsuario;
import me.gioppo.projetoathena.modelo.Funcionario;
import me.gioppo.projetoathena.modelo.Usuario;

public class ControladorFuncionarios {

    private SessaoDeUsuario sessaoDeUsuario;
    private RepositorioDeFuncionarios repositorioDeFuncionarios;

    public ControladorFuncionarios(SessaoDeUsuario sessaoDeUsuario, RepositorioDeFuncionarios repositorioDeFuncionarios) {
        this.sessaoDeUsuario = sessaoDeUsuario;
        this.repositorioDeFuncionarios = repositorioDeFuncionarios;
    }

    public void incluirFuncionario(Funcionario funcionario) {
        if (!this.sessaoDeUsuario.sessaoAtiva()) {
            System.out.println("Você precisa estar logado para realizar essa ação");
            return;
        }

        Usuario usuarioLogado = this.sessaoDeUsuario.getUsuarioLogado();
        if (usuarioLogado.getTipoDeUsuario() != Usuario.TIPO_SECRETARIA) {
            System.out.println("Você não tem permissão para realizar essa ação");
            return;
        }

        this.repositorioDeFuncionarios.salvarFuncionario(funcionario);

    }

    public void atualizarFuncionario(Funcionario funcionario) {

    }

    public void visualizarFuncionario(String identificador) {

    }

    public void excluirFuncionario(Funcionario funcionario) {

    }

}
