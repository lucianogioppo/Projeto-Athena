package me.gioppo.projetoathena.servicos.util;

import java.util.Scanner;
import me.gioppo.projetoathena.contratos.util.Mensageiro;

public class MensageiroLinhaDeComando implements Mensageiro{

    @Override
    public boolean confirmacao(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        boolean respostaValida = false;
        String resposta = "";
        do{
            exibirNoTerminal(mensagem + "(s ou n)");
            resposta = scanner.next();
            if(resposta.toLowerCase().equals("s") || resposta.toLowerCase().equals("n")){
                respostaValida = true;
            }else{
                exibirNoTerminal("Você deve respoder s ou n");
            }
        }while(!respostaValida);
        
        return resposta.equals("s");
    }

    @Override
    public void info(String mensagem) {
        exibirNoTerminal(mensagem);
    }

    @Override
    public void alerta(String mensagem) {
        exibirNoTerminal(mensagem);
    }

    @Override
    public void erro(String mensagem) {
        exibirNoTerminal(mensagem);
    }

    @Override
    public void falha(String mensagem) {
        exibirNoTerminal(mensagem);
    }
    
    private void exibirNoTerminal(String mensagem) {
        System.out.println(mensagem);
    }
    
}
