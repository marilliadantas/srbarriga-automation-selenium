package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.ContasPage;
import pages.HomePage;
import runner.base_class.BaseSteps;

public class ContasSteps extends BaseSteps {
    HomePage paginaHome = new HomePage();
    ContasPage paginaContas = new ContasPage();

    @Quando("clicar em contas")
    public void clicarEmContas() {
        paginaHome.clicarContas();
        screenshot();
    }

    @E("clicar em adicionar")
    public void clicarEmAdicionar() {
        paginaHome.clicarAdicionar();
        screenshot();
    }

    @E("inserir o nome da conta")
    public void inserirONomeDaConta() {
        paginaContas.nomeConta();
        screenshot();
    }
    @E("clicar em salvar")
    public void clicarEmSalvar() {
        paginaContas.clicarSalvar();
    }

    @Entao("o sistema redireciona para a pagina de contas")
    public void oSistemaRedirecionaParaAPaginaDeContas() {

    }

    @E("exibe uma mensagem {string}")
    public void exibeUmaMensagem(String msgEsperada) {
        Assert.assertEquals(msgEsperada, paginaContas.validaMsgContaCriada());
        screenshot();
    }

}
