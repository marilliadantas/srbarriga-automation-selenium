#language: pt

@contas
Funcionalidade: Contas

  @criar-conta-sucesso
  Cenario: 01 - Criar conta com sucesso
      Dado que o usuario esta na tela home
      Quando clicar em contas
      E clicar em adicionar
      E inserir o nome da conta
      E clicar em salvar
      Entao o sistema redireciona para a pagina de contas
      E exibe uma mensagem "Conta adicionada com sucesso!"

  @listar-conta
  Cenario: 02 - Listar conta
      Dado que o usuario esta na tela home
      Quando clicar em contas
      E clicar em listar
      Entao o sistema exibe uma conta "Nubank"

  @editar-conta
  Cenario: 03 - Editar conta - Primeira da Lista
      Dado que o usuario esta na tela home
      Quando clicar em contas
      E clicar em listar
      E clicar em editar
      E editar o nome da conta
      E clicar em salvar
      Entao o sistema exibe o nome da conta editado
      E exibe uma mensagem "Conta alterada com sucesso!"

  @remover-conta
  Cenario: 04 - Remover conta - Primeira da Lista
      Dado que o usuario esta na tela home
      Quando clicar em contas
      E clicar em listar
      E clicar em remover conta
      Entao o sistema exibe a mensagem "Conta removida com sucesso!"
