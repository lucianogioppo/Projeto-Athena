package me.gioppo.projetoathena.contratos.verificadores;

public interface VerificadorControleFuncionario {
    
    public boolean verificarPermissaoParaIncluir();
    public boolean verificarPermissaoParaAtualizar();
    public boolean verificarPermissaoParaExcluir();
    public boolean verificarPermissaoParaVisualizar();
    
}
