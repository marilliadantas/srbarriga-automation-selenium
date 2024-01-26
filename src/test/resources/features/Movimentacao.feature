#language: pt

@movimentacao
Funcionalidade: Movimentação

  @criar-movimentacao-receita-pago
  Cenario: Criar movimentação do tipo receita com sucesso
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario insere a data da movimentacao
    E o usuario insere a data do pagamento
    E o usuario insere uma descricao
    E o usuario insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pago
    E o usuário clica em salvar
    Entao o sistema deve exibira mensagem "Movimentação adicionada com sucesso!"