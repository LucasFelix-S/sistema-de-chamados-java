package projeto;
import java.util.Scanner;

public class Menus {
	Usuarios usuarios = new Usuarios();
	Scanner entrada = new Scanner(System.in);

	public void telaInicial() {
		System.out.println("+-----------------------------------------+");
		System.out.println(" Seja bem-vindo(a) ao sistema de chamados! ");
		System.out.println("+-----------------------------------------+");
		System.out.println("         Selecione a opção desejada        ");
		System.out.println("1 - Fazer Login");
		System.out.println("2 - Sobre");
		System.out.println("3 - Sair");
		System.out.println("\n");
		System.out.println(">>");
		String entradaMenu = entrada.nextLine();
		validaTelaInicial(entradaMenu);
	}	
		
	public void validaTelaInicial(String entrada) {
		if(entrada.equals("1")) {
			telaLogin();
			
		} else if(entrada.equals("2")) {
			System.out.println("O sistemas de chamado foi criado por Lucas Felix Santos, como um pequeno projeto para testar");
			System.out.println("as suas habilidades com a linguagem Java");
			telaLogin();
			
		} else if(entrada.equals("3")) {
			System.out.println("Saindo do sistema...");
			
		} else {
			System.out.println("Opção inválida!");
			System.out.println("Tente novamente...");
			telaInicial();
		}
	}
	
	public void telaLogin() {
		System.out.println("+-----------------------------------------+");
		System.out.println("             FAÇA SEU LOGIN               ");
		System.out.println("\n");
		System.out.println("Usuário >> ");
		String usuario = entrada.nextLine();
		System.out.println("Senha >> ");
		String senha = entrada.nextLine();
		validaLogin(usuario, senha);
	}
	
	public void erroLogin() {
		System.out.println("+-----------------------------------------+");
		System.out.println("Usuário >> ");
		String usuarioErro = entrada.nextLine();
		System.out.println("Senha >> ");
		String senhaErro = entrada.nextLine();
		validaLogin(usuarioErro, senhaErro);
	}
	
	public void validaLogin(String usuario, String senha) {
		if(usuario.equals(usuarios.getDbUsuario()) && senha.equals(usuarios.getDbSenha())) {
			System.out.println("\n");
			System.out.println("Login efetuado com sucesso!");
			System.out.println("Acessando o sistema...");
			telaSistema();
			
		} else {
			System.out.println("\n");
			System.out.println("Credenciais incorretas!");
			System.out.println("Tente novamente...");
			erroLogin();
		}
	}
	
	public void telaSistema() {
		while(true) {
			System.out.println("+-----------------------------------------+");
			System.out.println("            Crie o seu chamado             ");
			System.out.println("+-----------------------------------------+");
			System.out.println("\n");
			
			System.out.println("Nome >>");
			String nome = entrada.nextLine();
			
			System.out.println("E-mail >>");
			String email = entrada.nextLine();
			
			System.out.println("Setor >>");
			String setor = entrada.nextLine();
			
			System.out.println("Seu problema >>");
			String problema = entrada.nextLine();
			
			System.out.println("\n");
			System.out.println("Seu chamado foi criado com sucesso!!!");
			
			System.out.println("Deseja validar seu chamado? [Y/N]");
			String resposta = entrada.nextLine();
			
			validaChamado(nome, email, setor, problema, resposta);
			break;
		}
	}
	
	public void validaChamado(String nome, String email, String setor, String problema, String resposta) {
		if(resposta.equals("Y") || resposta.equals("y")) {
			System.out.println("\n");
			System.out.println("Ótimo, vamos validar o seu chamado: \n");
			System.out.println("seu nome: " + nome);
			System.out.println("seu e-mail: " + email);
			System.out.println("Seu setor: " + setor);
			System.out.println("Seu problema: " + problema);
			System.out.println("\n");
			menuFinal();
			
		} else if (resposta.equals("N") || resposta.equals("n")) {
			System.out.println("\n");
			System.out.println("Você optou por não validar seu chamado.");
			menuFinal();
			
		} else {
			
		}
	}
	
	public void menuFinal() {
		System.out.println("+-----------------------------------------+");
		System.out.println("          O que deseja fazer agora?        ");
		System.out.println("1. Cadastrar novo chamado.");
		System.out.println("2. Encerrar o sistema.");
		String opcao = entrada.nextLine();
		
		if(opcao.equals("1")) {
			System.out.println("\n");
			telaSistema();
			
		} else if(opcao.equals("2")) {
			System.out.println("\n");
			System.out.println("Saindo do sistema!!!");
			System.out.println("Obrigado por usar :)");
			
		} else {
			System.out.println("\n");
			System.out.println("Opção inválida!");
			System.out.println("Encerrando o sitema...");
		}	
	}	
}