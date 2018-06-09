package me.gioppo.projetoathena.controladores;

import me.gioppo.projetoathena.contratos.RepositorioDeUsuarios;
import me.gioppo.projetoathena.contratos.SessaoDeUsuario;
import me.gioppo.projetoathena.modelo.Usuario;
import me.gioppo.projetoathena.modelo.base.Senha;

public class ControladorLogin {
    
    private RepositorioDeUsuarios repositorioDeUsuarios;
    private SessaoDeUsuario sessaoDeUsuario;

    public ControladorLogin(RepositorioDeUsuarios repositorioDeUsuarios, SessaoDeUsuario sessaoDeUsuario) {
        this.repositorioDeUsuarios = repositorioDeUsuarios;
        this.sessaoDeUsuario = sessaoDeUsuario;
    }
    
    public Usuario fazerLogin(String nomeDeUsuario, String senha) {
        Usuario possivelUsuario = this.repositorioDeUsuarios.buscarPorNomeDeUsuario(nomeDeUsuario);
        if(possivelUsuario == null){
            return null;
        }else{
            Senha senhaInformada = new Senha(senha);
            Senha senhaDoUsuario = possivelUsuario.getSenha();
            
            if(senhaInformada.compararSenha(senhaDoUsuario)){
                this.sessaoDeUsuario.logarUsuario(possivelUsuario);
                return possivelUsuario;
            }else{
                return null;
            }
        }
    }
    
}
