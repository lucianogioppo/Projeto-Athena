package me.gioppo.projetoathena.visao;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import me.gioppo.projetoathena.contratos.RepositorioDeUsuarios;
import me.gioppo.projetoathena.contratos.SessaoDeUsuario;
import me.gioppo.projetoathena.contratos.util.Mensageiro;
import me.gioppo.projetoathena.contratos.verificadores.VerificadorControleFuncionario;
import me.gioppo.projetoathena.controladores.ControladorFuncionarios;
import me.gioppo.projetoathena.controladores.ControladorLogin;
import me.gioppo.projetoathena.servicos.RepositorioDeFuncionariosEmMemoria;
import me.gioppo.projetoathena.servicos.RepositorioDeUsuariosEmMemoria;
import me.gioppo.projetoathena.servicos.SessaoDeUsuarioEmMemoria;
import me.gioppo.projetoathena.servicos.util.MensageiroSwing;
import me.gioppo.projetoathena.servicos.verificadores.VerificadorControleFuncionarioFuncao;

public class ControleDeTela {
    
    
    public static final String TELA_LOGIN = "login";
    public static final String TELA_MENU = "menu";
    public static final String TELA_ADD_FUNC = "adicionarFuncionario";
    public static final String TELA_LS_FUNC = "listarFuncionario";
    
    private static Janela janela;
    private static Map<String, PainelTrocavel> paineis;
    
    private static void init() {
        ControleDeTela.janela = new Janela();
        
        ControleDeTela.paineis = new HashMap<>();
        
        SessaoDeUsuario sessao = new SessaoDeUsuarioEmMemoria();
        Mensageiro mensageiro = new MensageiroSwing();
        RepositorioDeUsuarios repoUsuarios = new RepositorioDeUsuariosEmMemoria();
        VerificadorControleFuncionario verificadorFuncionario = new VerificadorControleFuncionarioFuncao(sessao, mensageiro);
        
        ControladorFuncionarios controladorFuncionario = new ControladorFuncionarios(
                verificadorFuncionario, 
                new RepositorioDeFuncionariosEmMemoria(),
                repoUsuarios
        );
        
        paineis.put(ControleDeTela.TELA_LOGIN, new PainelDeLogin(
                new ControladorLogin(
                        repoUsuarios, 
                        sessao), 
                mensageiro
        ));
        
        paineis.put(ControleDeTela.TELA_MENU, new PainelMenuPrincipal(sessao, verificadorFuncionario));
        
        paineis.put(ControleDeTela.TELA_ADD_FUNC, new PainelAdicionarFuncionario(controladorFuncionario, mensageiro));
        
        paineis.put(ControleDeTela.TELA_LS_FUNC, new PainelListaFuncionarios(controladorFuncionario));
    }
    
    
    public static void executar() {
        ControleDeTela.init();
        ControleDeTela.mudarPainel("login");
        ControleDeTela.janela.setVisible(true);
    }
    
    public static void mudarPainel(String nomeDoPainel){
        PainelTrocavel painelTrocavel = ControleDeTela.paineis.get(nomeDoPainel);
        painelTrocavel.acoesQuandoTrocar();
        JPanel painel = (JPanel) painelTrocavel;
        ControleDeTela.janela.setPainelAtual(painel);
    }
    
}
