/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.gioppo.projetoathena.visao;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import me.gioppo.projetoathena.contratos.SessaoDeUsuario;
import me.gioppo.projetoathena.controladores.ControladorLogin;
import me.gioppo.projetoathena.servicos.RepositorioDeUsuariosEmMemoria;
import me.gioppo.projetoathena.servicos.SessaoDeUsuarioEmMemoria;
import me.gioppo.projetoathena.servicos.util.MensageiroSwing;

/**
 *
 * @author alisonbnt
 */
public class ControleDeTela {
    
    private static Janela janela;
    private static Map<String, PainelTrocavel> paineis;
    
    private static void init() {
        ControleDeTela.janela = new Janela();
        
        ControleDeTela.paineis = new HashMap<>();
        
        SessaoDeUsuario sessao = new SessaoDeUsuarioEmMemoria();
        
        paineis.put("login", new PainelDeLogin(
                new ControladorLogin(
                        new RepositorioDeUsuariosEmMemoria(), 
                        sessao), 
                new MensageiroSwing()
        ));
        
        paineis.put("menu", new PainelMenuPrincipal(sessao));
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
