package me.gioppo.projetoathena.contratos;

import me.gioppo.projetoathena.modelo.Usuario;

public interface RepositorioDeUsuarios {

    public boolean adicionarUsuario(Usuario usuario);
    
    public Usuario buscarPorNomeDeUsuario(String nomeDeUsuario);

}
