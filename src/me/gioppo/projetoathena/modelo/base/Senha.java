/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.gioppo.projetoathena.modelo.base;

/**
 *
 * @author alisonbnt
 */
public class Senha {
    
    private String textoDaSenha;

    public Senha(String senha) {
        this.textoDaSenha = senha;
    }
    
    public boolean compararSenha(Senha senha) {
        if(this.textoDaSenha.equals(senha.getTextoDaSenha())){
            return true;
        }else{
            return false;
        }
    }

    public String getTextoDaSenha() {
        return textoDaSenha;
    }
    
    
}
