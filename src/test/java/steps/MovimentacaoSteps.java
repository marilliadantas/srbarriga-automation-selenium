package steps;

import io.cucumber.java.pt.*;
import pages.HomePage;
import pages.MovimentacaoPage;
import runner.base_class.BaseSteps;

public class MovimentacaoSteps extends BaseSteps {
    HomePage paginaHome = new HomePage();
    MovimentacaoPage paginaMovimentacao = new MovimentacaoPage();

    @Quando("o usuario clicar em Criar movimentacao")
    public void o_usuario_clicar_em_criar_movimentacao() {
        paginaHome.clicarCriarMovimentacao();
        screenshot();
    }

    @Quando("o usuario insere a data da movimentacao")
    public void oUsuarioInsereADataDaMovimentacao() {
        paginaMovimentacao.inserirDataMovimentacao();
        screenshot();
    }

    @E("o usuario insere a data do pagamento")
    public void oUsuarioInsereADataDoPagamento() {
        paginaMovimentacao.inserirDataPagamento();
        screenshot();
    }

    @E("o usuario insere uma descricao")
    public void oUsuarioInsereUmaDescricao() {
        paginaMovimentacao.inserirDescricao();
        screenshot();
    }

    @E("o usuario insere um interessado")
    public void oUsuarioInsereUmInteressado() {
        paginaMovimentacao.inserirInteressado();
        screenshot();
    }

    @E("o usuario insere um valor")
    public void oUsuarioInsereUmValor() {
        paginaMovimentacao.inserirValor();
        screenshot();
    }

    @E("o usuario seleciona uma conta")
    public void oUsuarioSelecionaUmaConta() {
        paginaMovimentacao.selecionarConta();
        screenshot();
    }

    @E("o usuario seleciona pago")
    public void oUsuarioSelecionaPago() {
        paginaMovimentacao.clicarPago();
        screenshot();
    }

    @E("o usuário clica em salvar")
    public void oUsuárioClicaEmSalvar() {
        paginaMovimentacao.clicarBotaoSalvar();
        screenshot();
    }

    @Entao("o sistema deve exibira mensagem {string}")
    public void oSistemaDeveExibiraMensagem(String string) {

    }
}
