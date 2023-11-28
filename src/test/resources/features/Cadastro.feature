#language: pt

@cadastro
Funcionalidade: Cadastro

    @cadastro-sucesso
    Cenario: Cadastro com sucesso
        Dado que o usuario esta na tela inicial do site
        E clica no link "Novo Usuário?"
        Quando preenche os campos nome, email e senha
        E clica no botao cadastrar
        Então o sistema exibe a mensagem "Usuário inserido com sucesso"

    @cadastro-pressiona-enter
    Cenario: Cadastro com sucesso - ENTER
        Dado que o usuario esta na tela inicial do site
        E clica no link "Novo Usuário?"
        Quando preenche os campos nome, email e senha
        E pressiona ENTER no teclado
        Então o sistema exibe a mensagem "Usuário inserido com sucesso"

    @cadastro-invalido
    Esquema do Cenario: Cadastro com <Fluxo>
        Dado que o usuario esta na tela inicial do site
        E clica no link "Novo Usuário?"
        Quando preenche os campos <Nome>, <Email> e <Senha>
        E clica no botao cadastrar
        Então o sistema exibe a <Mensagem>

        Exemplos:
            | Fluxo                     | Nome             | Email             | Senha     | Mensagem                       |
            | nome em branco            | ""               | "teste@teste.com" | "1234987" | "Nome é um campo obrigatório"  |
            | email em branco           | "Bernardo Luiz"  | ""                | "teste82" | "Email é um campo obrigatório" |
            | senha em branco           | "Bernardo Luiz"  | "teste@teste.com" | ""        | "Senha é um campo obrigatório" |
            | todos os campos em branco | ""               | ""                | ""        | "Nome é um campo obrigatório", "Email é um campo obrigatório", "Senha é um campo obrigatório" |