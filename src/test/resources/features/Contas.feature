#language: pt

@contas
Funcionalidade: Contas

  @criar-conta-sucesso
  Cenario: Criar conta com sucesso
    Dado que o usuario esta na tela home
    Quando clicar em contas
    E clicar em adicionar
    E inserir o nome da conta
    E clicar em salvar
    Entao o sistema redireciona para a pagina de contas
    E exibe uma mensagem "Conta adicionada com sucesso!"