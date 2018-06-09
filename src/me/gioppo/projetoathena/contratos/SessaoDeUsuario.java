package me.gioppo.projetoathena.contratos;

import me.gioppo.projetoathena.modelo.Usuario;

public interface SessaoDeUsuario {
    
    public Usuario getUsuarioLogado();
    public void logarUsuario(Usuario usuario);
    public boolean sessaoAtiva();
    public void deslogarUsuario();
    
}
