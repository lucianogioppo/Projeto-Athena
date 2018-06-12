package me.gioppo.projetoathena.servicos.util;

import javax.swing.JOptionPane;
import me.gioppo.projetoathena.contratos.util.Mensageiro;

public class MensageiroSwing implements Mensageiro{

    @Override
    public boolean confirmacao(String mensagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void info(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void alerta(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void erro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    @Override
    public void falha(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
