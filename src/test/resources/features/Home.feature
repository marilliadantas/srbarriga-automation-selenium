#language: pt

@logout
Funcionalidade: Logout

  @logout-sucesso
  Cenario: Logout com sucesso
    Dado que o usuario esta na tela home
    Quando clicar em sair
    Entao o sistema redireciona para a pagina de login