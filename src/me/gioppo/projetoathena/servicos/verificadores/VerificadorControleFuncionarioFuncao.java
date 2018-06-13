package me.gioppo.projetoathena.servicos.verificadores;

import me.gioppo.projetoathena.contratos.SessaoDeUsuario;
import me.gioppo.projetoathena.contratos.util.Mensageiro;
import me.gioppo.projetoathena.contratos.verificadores.VerificadorControleFuncionario;
import me.gioppo.projetoathena.modelo.Usuario;

public class VerificadorControleFuncionarioFuncao implements VerificadorControleFuncionario{

    private final SessaoDeUsuario sessao;
    private final Mensageiro mensageiro;

    public VerificadorControleFuncionarioFuncao(
            SessaoDeUsuario sessao,
            Mensageiro mensageiro
    ) {
        this.sessao = sessao;
        this.mensageiro = mensageiro;
    }
    
    @Override
    public boolean verificarPermissaoParaIncluir() {
        return verificarSecretariaLogadaPadrao();
    }

    @Override
    public boolean verificarPermissaoParaAtualizar() {
        return verificarSecretariaLogadaPadrao();
    }

    @Override
    public boolean verificarPermissaoParaExcluir() {
        return verificarSecretariaLogadaPadrao();
    }

    @Override
    public boolean verificarPermissaoParaVisualizar() {
        return verificarSecretariaLogadaPadrao();
    }
    
    private boolean verificarSecretariaLogadaPadrao() {
        return verificarSecretariaLogada(
                "Você precisa estar logado para realizar essa ação", 
                "Você não tem permissão para realizar essa ação"
        );
    }
    
    private boolean verificarSecretariaLogada(
            String mensagemNaoLogado, 
            String mensagemSemPermissao
    ) {
        boolean usuarioEstaLogado = sessao.sessaoAtiva();
        if(!usuarioEstaLogado){
            mensageiro.erro(mensagemNaoLogado);
            return false;
        }
            
        Usuario usuarioLogado = sessao.getUsuarioLogado();
        if(usuarioLogado.getTipoDeUsuario() != Usuario.TIPO_SECRETARIA){
            mensageiro.erro(mensagemSemPermissao);
            return false;
        }
        
        return true;
    }
    
    
    
}
