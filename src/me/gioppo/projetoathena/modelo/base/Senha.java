package me.gioppo.projetoathena.modelo.base;

public class Senha {

    private String textoDaSenha;

    public Senha(String senha) {
        this.textoDaSenha = senha;
    }

    public boolean compararSenha(Senha senha) {
        if (this.textoDaSenha.equals(senha.getTextoDaSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public String getTextoDaSenha() {
        return textoDaSenha;
    }

}
