#language: pt

@login
Funcionalidade: Login

    @login-sucesso
    Cenario: Login com sucesso
        Dado que o usuario esta na tela de login
        Quando o usuario insere credenciais validas
        E clica em "Entrar"
        Entao o sistema redireciona para a página inicial exibindo a mensagem "Bem vindo, Kylian!"

    Cenario: Login com sucesso - ENTER
        Dado que o usuario esta na tela de login
        Quando o usuario insere credenciais validas
        E pressiona "Enter"
        Entao o sistema redireciona para a página inicial exibindo a mensagem "Bem vindo, Kylian!"

    @login-excecoes
    Esquema do Cenario: Login com <Fluxo>
        Dado que o usuario esta na tela de login
        Quando o usuario insere <Email> e <Senha> invalidas
        E clica em "Entrar"
        Entao o sistema exibe a <Mensagem>

    Exemplos:
    | Fluxo                     | Email                      | Senha           | Mensagem                           |
    | email invalido            | "email@invalido.com"       | "1234Teste"     | "Problemas com o login do usuário" |
    | senha invalida            | "kylianmb@teste.com"       | "senha_invalida"| "Problemas com o login do usuário" |
    | email em branco           | ""                         | "1234Teste"     | "Email é um campo obrigatório"     |
    | senha em branco           | "kylianmb@teste.com"       | ""              | "Senha é um campo obrigatório"     |
    | todos os campos em branco | ""                         | ""              | "Email é um campo obrigatório", "Senha é um campo obrigatório" |