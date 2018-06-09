package me.gioppo.projetoathena.contratos;

import me.gioppo.projetoathena.modelo.Usuario;

public interface RepositorioDeUsuarios {

    public Usuario buscarPorNomeDeUsuario(String nomeDeUsuario);

}
