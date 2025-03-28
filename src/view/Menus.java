package view;
import java.util.Scanner;
import model.Usuarios;

public class Menus {
	Usuarios usuarios = new Usuarios();
	Scanner entrada = new Scanner(System.in);

	public void telaInicial() {
		System.out.println("[+] ==INÍCIO==");
		System.out.println(" | ");
		System.out.println(" | Seja bem-vindo(a) ao sistema de chamados! \n");
		
		System.out.println("[+] ==OPÇÕES==");
		System.out.println(" | ");
		System.out.println(" | Selecione a opção desejada");
		System.out.println(" | 1 - Fazer Login.");
		System.out.println(" | 2 - Sobre.");
		System.out.println(" | 3 - Sair.\n");
		System.out.print(">> ");
		String entradaMenu = entrada.nextLine();
		validaTelaInicial(entradaMenu);
	}	
		
	public void validaTelaInicial(String entrada) {
		switch (entrada) {
			case "1": 
				telaLogin();
				break;
			case "2": 
				System.out.println("\n[+]==SOBRE==");
				System.out.println(" | O sistema de chamado foi criado por Lucas Felix Santos, como um pequeno projeto para testar" 
						+ " as suas habilidades com a linguagem Java");
				telaLogin();
				break;
			case "3":
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.err.println("Opção inválida");
		}
	}
	
	public void telaLogin() {
		System.out.println("\n[+] ==LOGIN==");
		System.out.println(" | ");
		System.out.println(" | Faça seu login:\n");
		System.out.print("Usuário >> ");
		String usuario = entrada.nextLine();
		System.out.print("Senha >> ");
		String senha = entrada.nextLine();
		validaLogin(usuario, senha);
	}
	
	public void erroLogin() {
		System.out.println("\n[+]==ERRO==");
		System.out.println(" | ");
		System.out.println(" | Credenciais incorretas. Faça login novamente:\n");
		System.out.print("Usuário >> ");
		String usuarioErro = entrada.nextLine();
		System.out.print("Senha >> ");
		String senhaErro = entrada.nextLine();
		validaLogin(usuarioErro, senhaErro);
	}
	
	public void validaLogin(String usuario, String senha) {
		if(usuario.equals(usuarios.getDbUsuario()) && senha.equals(usuarios.getDbSenha())) {
			System.out.println("\nLogin efetuado com sucesso!");
			System.out.println("Acessando o sistema...");
			telaSistema();
			
		} else {
			erroLogin();
		}
	}
	
	public void telaSistema() {
		while(true) {
			System.out.println("\n[+]==TELA DE CHAMADOS==");
			System.out.println(" | ");
			System.out.println(" | Crie o seu chamado.");

			
			System.out.print("\nNome >> ");
			String nome = entrada.nextLine();
			
			System.out.print("E-mail >> ");
			String email = entrada.nextLine();
			
			System.out.print("Setor >> ");
			String setor = entrada.nextLine();
			
			System.out.print("Seu problema >> ");
			String problema = entrada.nextLine();
			
			System.out.println("\nSeu chamado foi criado com sucesso!!!");
			
			System.out.println("Deseja validar seu chamado? [Y/N]");
			String resposta = entrada.nextLine();
			
			validaChamado(nome, email, setor, problema, resposta);
			break;
		}
	}
	
	public void validaChamado(String nome, String email, String setor, String problema, String resposta) {
		if(resposta.equals("Y") || resposta.equals("y")) {
			System.out.println("\nÓtimo, vamos validar o seu chamado: \n");
			System.out.println("seu nome: " + nome);
			System.out.println("seu e-mail: " + email);
			System.out.println("Seu setor: " + setor);
			System.out.println("Seu problema: " + problema);
			menuFinal();
			
		} else if (resposta.equals("N") || resposta.equals("n")) {
			System.out.println("\nVocê optou por não validar seu chamado.");
			menuFinal();
		} else {
			
		}
	}
	
	public void menuFinal() {
		System.out.println("\n+-----------------------------------------+");
		System.out.println("          O que deseja fazer agora?        ");
		System.out.println("1. Cadastrar novo chamado.");
		System.out.println("2. Encerrar o sistema.");
		String opcao = entrada.nextLine();
		
		if(opcao.equals("1")) {
			telaSistema();
			
		} else if(opcao.equals("2")) {
			System.out.println("\nSaindo do sistema!!!");
			System.out.println("Obrigado por usar :)");
			
		} else {
			System.err.println("\nOpção inválida!");
			System.err.println("Encerrando o sitema...");
		}	
	}	
}