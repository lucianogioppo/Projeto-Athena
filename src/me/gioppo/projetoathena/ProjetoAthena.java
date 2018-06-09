package me.gioppo.projetoathena;

import java.util.Scanner;
import me.gioppo.projetoathena.contratos.RepositorioDeFuncionarios;
import me.gioppo.projetoathena.contratos.RepositorioDeUsuarios;
import me.gioppo.projetoathena.contratos.SessaoDeUsuario;
import me.gioppo.projetoathena.controladores.ControladorFuncionarios;
import me.gioppo.projetoathena.controladores.ControladorLogin;
import me.gioppo.projetoathena.modelo.Funcionario;
import me.gioppo.projetoathena.modelo.Usuario;
import me.gioppo.projetoathena.modelo.base.Cpf;
import me.gioppo.projetoathena.modelo.base.Senha;
import me.gioppo.projetoathena.servicos.RepositorioDeFuncionariosEmMemoria;
import me.gioppo.projetoathena.servicos.RepositorioDeUsuariosEmMemoria;
import me.gioppo.projetoathena.servicos.SessaoDeUsuarioEmMemoria;

public class ProjetoAthena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepositorioDeUsuarios meuRepositorio = new RepositorioDeUsuariosEmMemoria();
        RepositorioDeFuncionarios meuRepositorioFuncionarios = new RepositorioDeFuncionariosEmMemoria();
        SessaoDeUsuario minhaSessao = new SessaoDeUsuarioEmMemoria();
        ControladorLogin meuControlador = new ControladorLogin(meuRepositorio, minhaSessao);
        ControladorFuncionarios meuControladorFuncionarios = new ControladorFuncionarios(minhaSessao, meuRepositorioFuncionarios);

        // Lê a entrada do usuario e senha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome de usuário: ");
        String nomeDeUsuario = scanner.next();

        System.out.print("Senha: ");
        String senha = scanner.next();

        Usuario usuario = meuControlador.fazerLogin(nomeDeUsuario, senha);
        if (usuario == null) {
            System.out.println("Usuário e/ou senha incorretos");
        } else {
            System.out.println("Seja bem vindo, " + usuario.getNomeCompleto());
        }

        RepositorioDeFuncionariosEmMemoria repo = (RepositorioDeFuncionariosEmMemoria) meuRepositorioFuncionarios;
        System.out.println(repo.contarFuncionarios());
        Funcionario funcionarioAIncluir = new Funcionario("func_1", "funcio", new Senha("54321"), "Severino", "de Aracaju", new Cpf("321"));
        meuControladorFuncionarios.incluirFuncionario(funcionarioAIncluir);
        System.out.println(repo.contarFuncionarios());
    }

}
