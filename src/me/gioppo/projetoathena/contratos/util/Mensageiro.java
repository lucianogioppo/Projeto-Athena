package me.gioppo.projetoathena.contratos.util;

public interface Mensageiro {
    
    public boolean confirmacao(String mensagem);
    public void info(String mensagem);
    public void alerta(String mensagem);
    public void erro(String mensagem);
    public void falha(String mensagem);
    
}
