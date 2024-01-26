package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    @Quando("o usuario clicar em tipo de movimentacao")
    public void o_usuario_clicar_em_tipo_de_movimentacao() {
        paginaMovimentacao.clicarTipoMovimentacao();
        screenshot();
    }

    @Quando("o usuario clicar em {string}")
    public void o_usuario_clicar_em(String string) {
        paginaMovimentacao.clicarDespesa();
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

    }

    @E("o usuario seleciona pago")
    public void oUsuarioSelecionaPago() {
        paginaMovimentacao.clicarPago();
        screenshot();
    }

    @Quando("o usuario seleciona pendente")
    public void oUsuarioSelecionaPendente() {
        paginaMovimentacao.clicarPendente();
        screenshot();
    }

    @E("o usuário clica em salvar")
    public void oUsuárioClicaEmSalvar() {
        paginaMovimentacao.clicarBotaoSalvar();
    }

    @Entao("o sistema deve exibir a mensagem {string}")
    public void oSistemaDeveExibiraMensagem(String msgEsperada) {
        Assert.assertEquals(msgEsperada, paginaMovimentacao.validaMsg());
        screenshot();
    }

    @Quando("o usuario não inserir data de movimentacao")
    public void oUsuarioNãoInserirDataDeMovimentacao() {
        screenshot();
    }

    @Quando("o usuario nao insere a data de pagamento")
    public void oUsuarioNaoInsereADataDePagamento() {
        screenshot();
    }

    @Quando("o usuario nao insere uma descricao")
    public void oUsuarioNaoInsereUmaDescricao() {
        screenshot();
    }

    @Quando("o usuario nao insere um interessado")
    public void oUsuarioNaoInsereUmInteressado() {
        screenshot();
    }
}
