# Sistema de Chamados em Java

## 📌 Sobre o projeto  

Este é um Sistema de Chamados desenvolvido em Java, rodando no terminal. O objetivo do projeto é praticar conceitos fundamentais da linguagem, incluindo:  

- **Programação Orientada a Objetos (POO)**  
- **Manipulação de entrada de dados com Scanner**  
- **Estruturas de repetição e condicionais**  

O sistema permite que um usuário faça login e registre chamados, validando as credenciais e coletando informações do problema relatado.  

---

## 🚀 Funcionalidades  

✅ Exibe um menu inicial com opções para login, informações e saída do sistema  
✅ Valida credenciais do usuário para acesso ao sistema  
✅ Permite o registro de chamados com nome, e-mail, setor e descrição do problema  
✅ Exibe um resumo do chamado antes da finalização  
✅ Permite interação com o usuário via Scanner  

---

## 🖥️ Exemplo de Execução  

Abaixo está um exemplo de como o sistema funciona no terminal:

+-----------------------------------------+ Seja bem-vindo(a) ao sistema de chamados!
+-----------------------------------------+
Selecione a opção desejada
1 - Fazer Login
2 - Sobre
3 - Sair

1

+-----------------------------------------+
FAÇA SEU LOGIN
+-----------------------------------------+

Usuário >> admin
Senha >> 102030

Login efetuado com sucesso!
Acessando o sistema...

+-----------------------------------------+
Crie o seu chamado
+-----------------------------------------+

Nome >> João Silva
E-mail >> joao@email.com
Setor >> Contabilidade
Seu problema >> Computador não liga

Seu chamado foi criado com sucesso!!!
Deseja validar seu chamado? [Y/N]

Y

Ótimo, vamos validar o seu chamado:

Seu nome: João Silva
Seu e-mail: joao@email.com
Seu setor: Contabilidade
Seu problema: Computador não liga
+-----------------------------------------+
O que deseja fazer agora?

Cadastrar novo chamado.
Encerrar o sistema.
2

Saindo do sistema!!!
Obrigado por usar :)

---

## 🛠️ Tecnologias Utilizadas  

O projeto foi desenvolvido utilizando as seguintes tecnologias:  

- **Java SE**  
- **Eclipse IDE** (para desenvolvimento e testes)  

---

## 📂 Estrutura do Projeto  

ProjetoChamado/
│-- src/
│ ├── projeto/
│ │ ├── Main.java
│ │ ├── Menus.java
│ │ ├── Usuarios.java
│-- .classpath
│-- .project
│-- README.md

📌 **Explicação dos arquivos:**  
- **Main.java**: Ponto de entrada do programa.  
- **Menus.java**: Gerencia a interface e interação com o usuário.  
- **Usuarios.java**: Armazena as credenciais do usuário administrador.  
- **README.md**: Documentação do projeto.  

---

## 📖 Como executar o projeto  

1️⃣ Clone este repositório para sua máquina local:  

```bash
git clone https://github.com/seu-usuario/sistema-de-chamados-java.git

2️⃣ Importe o projeto em sua IDE Java (Eclipse, IntelliJ, VS Code, etc.).
3️⃣ Execute a classe Main.java.
4️⃣ Siga as instruções no terminal para testar o sistema.

📢 Contribuições
Fique à vontade para contribuir com melhorias! Caso tenha sugestões ou encontre algum bug, abra uma Issue ou envie um Pull Request. 😃

📜 Licença
Este projeto está sob a licença MIT.

Se você gostou do projeto ou tem alguma sugestão, me chame no LinkedIn! 🚀
