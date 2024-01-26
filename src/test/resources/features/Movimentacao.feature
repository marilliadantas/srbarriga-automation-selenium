#language: pt

@movimentacao
Funcionalidade: Movimentação

  @criar-movimentacao-receita-pago
  Cenario: 01 - Criar movimentação receita com pagamento pago
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
    Entao o sistema deve exibir a mensagem "Movimentação adicionada com sucesso!"

  @criar-movimentacao-receita-pendente
  Cenario: 02 - Criar movimentação receita com pagamento pendente
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario insere a data da movimentacao
    E o usuario insere a data do pagamento
    E o usuario insere uma descricao
    E o usuario insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pendente
    E o usuário clica em salvar
    Entao o sistema deve exibir a mensagem "Movimentação adicionada com sucesso!"

  @criar-movimentacao-despesa-pago
  Cenario: 03 - Criar movimentação despesa com pagamento pago
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario clicar em tipo de movimentacao
    E o usuario clicar em "Despesa"
    E o usuario insere a data da movimentacao
    E o usuario insere a data do pagamento
    E o usuario insere uma descricao
    E o usuario insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pago
    E o usuário clica em salvar
    Entao o sistema deve exibir a mensagem "Movimentação adicionada com sucesso!"

  @criar-movimentacao-despesa-pendente
  Cenario: 04 - Criar movimentação despesa com pagamento pendente
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario clicar em tipo de movimentacao
    E o usuario clicar em "Despesa"
    E o usuario insere a data da movimentacao
    E o usuario insere a data do pagamento
    E o usuario insere uma descricao
    E o usuario insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pendente
    E o usuário clica em salvar
    Entao o sistema deve exibir a mensagem "Movimentação adicionada com sucesso!"

  @criar-movimentacao-dataMovimentacaoEmBranco
  Cenario: 05 - Criar movimentação com data de movimentação em branco
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario não inserir data de movimentacao
    E o usuario insere a data do pagamento
    E o usuario insere uma descricao
    E o usuario insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pago
    E o usuário clica em salvar
    Entao o sistema deve exibir a mensagem "Data da Movimentação é obrigatório"

  @criar-movimentacao-dataPagamentoEmBranco
  Cenario: 06 - Criar movimentação com data de pagamento em branco
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario insere a data da movimentacao
    E o usuario nao insere a data de pagamento
    E o usuario insere uma descricao
    E o usuario insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pago
    E o usuário clica em salvar
    Entao o sistema deve exibir a mensagem "Data do pagamento é obrigatório"

  @criar-movimentacao-DescricaoEmBranco
  Cenario: 07 - Criar movimentação com data de pagamento em branco
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario insere a data da movimentacao
    E o usuario insere a data do pagamento
    E o usuario nao insere uma descricao
    E o usuario insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pago
    E o usuário clica em salvar
    Entao o sistema deve exibir a mensagem "Descrição é obrigatório"

  @criar-movimentacao-InteressadoEmBranco
  Cenario: 08 - Criar movimentação com data de pagamento em branco
    Dado que o usuario esta na tela home
    Quando o usuario clicar em Criar movimentacao
    E o usuario insere a data da movimentacao
    E o usuario insere a data do pagamento
    E o usuario insere uma descricao
    E o usuario nao insere um interessado
    E o usuario insere um valor
    E o usuario seleciona uma conta
    E o usuario seleciona pago
    E o usuário clica em salvar
    Entao o sistema deve exibir a mensagem "Interessado é obrigatório"