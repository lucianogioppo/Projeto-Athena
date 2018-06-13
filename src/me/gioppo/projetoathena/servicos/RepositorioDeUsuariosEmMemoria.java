package me.gioppo.projetoathena.servicos;

import java.util.ArrayList;
import java.util.List;
import me.gioppo.projetoathena.contratos.RepositorioDeUsuarios;
import me.gioppo.projetoathena.modelo.Diretor;
import me.gioppo.projetoathena.modelo.Secretaria;
import me.gioppo.projetoathena.modelo.Usuario;
import me.gioppo.projetoathena.modelo.base.Cpf;
import me.gioppo.projetoathena.modelo.base.Senha;

public class RepositorioDeUsuariosEmMemoria implements RepositorioDeUsuarios{

    private final List<Usuario> usuariosEmMemoria;
    
    public RepositorioDeUsuariosEmMemoria(){
        usuariosEmMemoria = new ArrayList<>();
        usuariosEmMemoria.add(new Secretaria("sec_1", "admin", new Senha("12345"), "Administrador", "do Sistema", new Cpf("123")));
        usuariosEmMemoria.add(new Diretor("dir_1", "diretor", new Senha("12345"), "Diretor", "do Sistema", new Cpf("123")));
    }
    
    @Override
    public Usuario buscarPorNomeDeUsuario(String nomeDeUsuario) {
        for(Usuario usuario : usuariosEmMemoria){
            if(usuario.getNomeDeUsuario().equals(nomeDeUsuario)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public boolean adicionarUsuario(Usuario usuario) {
        usuariosEmMemoria.add(usuario);
        return true;
    }
    
}
