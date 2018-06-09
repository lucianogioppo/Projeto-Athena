package me.gioppo.projetoathena.servicos;

import me.gioppo.projetoathena.contratos.SessaoDeUsuario;
import me.gioppo.projetoathena.modelo.Usuario;

public class SessaoDeUsuarioEmMemoria implements SessaoDeUsuario {

    private Usuario usuarioLogado;

    public SessaoDeUsuarioEmMemoria() {
        this.usuarioLogado = null;
    }

    @Override
    public Usuario getUsuarioLogado() {
        return this.usuarioLogado;
    }

    @Override
    public void logarUsuario(Usuario usuario) {
        this.usuarioLogado = usuario;
    }

    @Override
    public void deslogarUsuario() {
        this.usuarioLogado = null;
    }

    @Override
    public boolean sessaoAtiva() {
        if (this.usuarioLogado != null) {
            return true;
        } else {
            return false;
        }
    }

}
