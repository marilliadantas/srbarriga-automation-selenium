package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.HomePage;
import pages.MovimentacaoPage;
import runner.base_class.BaseSteps;

import java.util.List;

public class MovimentacaoSteps extends BaseSteps {
    HomePage paginaHome = new HomePage();
    MovimentacaoPage paginaMovimentacao = new MovimentacaoPage();

    @Quando("o usuario clicar em Criar movimentacao")
    public void o_usuario_clicar_em_criar_movimentacao() {
        paginaHome.clicarCriarMovimentacao();
        screenshot();
    }

    @E("o usuario clicar em tipo de movimentacao")
    public void o_usuario_clicar_em_tipo_de_movimentacao() {
        paginaMovimentacao.clicarTipoMovimentacao();
        screenshot();
    }

    @E("o usuario clicar em {string}")
    public void o_usuario_clicar_em(String string) {
        paginaMovimentacao.clicarDespesa();
        screenshot();
    }

    @E("o usuario insere a data da movimentacao")
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

    @E("o usuario seleciona pendente")
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

    @E("o usuario nao inserir data de movimentacao")
    public void oUsuarioNaoInserirDataDeMovimentacao() {
        screenshot();
    }

    @E("o usuario nao insere a data de pagamento")
    public void oUsuarioNaoInsereADataDePagamento() {
        screenshot();
    }

    @E("o usuario nao insere uma descricao")
    public void oUsuarioNaoInsereUmaDescricao() {
        screenshot();
    }

    @E("o usuario nao insere um interessado")
    public void oUsuarioNaoInsereUmInteressado() {
        screenshot();
    }

    @E("o usuario nao insere um valor")
    public void oUsuarioNaoInsereUmValor() {
        screenshot();
    }

    @Entao("o sistema deve exibir as mensagens {string}, {string}, {string}, {string}, {string}, {string}")
    public void oSistemaDeveExibirAsMensagens(String msg1, String msg2, String msg3, String msg4, String msg5, String msg6) {
        List<String> erros = paginaMovimentacao.ListaMsgErro();
        String mensagensEsperadas = msg1 + "\n" + msg2 + "\n" + msg3 + "\n" + msg4 + "\n" + msg5 + "\n" + msg6;

        Assert.assertEquals(mensagensEsperadas, String.join("\n", erros));

        screenshot();
    }

    @E("o usuario insere um valor invalido")
    public void oUsuarioInsereUmValorInvalido() {
        paginaMovimentacao.inserirValorInvalido();
        screenshot();
    }

    @Entao("o sistema deve exibir a mensagem {string}, {string}")
    public void oSistemaDeveExibirAMensagem(String msg1, String msg2) {
        List<String> erros = paginaMovimentacao.ListaMsgErro();
        String mensagensEsperadas = msg1 + "\n" + msg2;

        Assert.assertEquals(mensagensEsperadas, String.join("\n", erros));

        screenshot();
    }
}