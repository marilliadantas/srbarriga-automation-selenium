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
        Assert.assertEquals(msgEsperada, paginaContas.validaMsg());
        screenshot();
    }

    @Quando("clicar em editar")
    public void clicarEmEditar() {
        paginaContas.clicarEditar();
        screenshot();
    }

    @Quando("editar o nome da conta")
    public void editarONomeDaConta() {
        paginaContas.editarNome();
        screenshot();
    }

    @Entao("o sistema exibe o nome da conta editado")
    public void oSistemaExibeONomeDaContaEditado() {
        Assert.assertEquals(paginaContas.validaNomeContaEditada(), "C6 Bank (conta editada)");
        screenshot();
    }

    @Entao("o sistema exibe uma conta {string}")
    public void oSistemaExibeUmaConta(String string) {
        Assert.assertEquals(paginaContas.validaPrimeiraDaLista(), "Nubank");
        screenshot();
    }


    @Quando("clicar em remover conta")
    public void clicarEmRemoverConta() {
        paginaContas.clicarRemover();
        screenshot();
    }
}
