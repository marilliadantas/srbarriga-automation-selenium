package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import runner.base_class.BaseSteps;

public class HomeSteps extends BaseSteps {
    LoginPage paginaLogin = new LoginPage();
    HomePage paginaHome = new HomePage();

    @Dado("que o usuario esta na tela home")
    public void queOUsuarioEstaNaTelaHome() {
        paginaLogin.fazerLogin();
        screenshot();
    }

    @Quando("clicar em sair")
    public void clicarEmSair() {
        paginaHome.clicarSair();
    }

    @Quando("clicar em {string}")
    public void clicarEm(String string) {
        paginaHome.clicarContas();
        screenshot();
    }

    @Entao("o sistema redireciona para a pagina de login")
    public void oSistemaRedirecionaParaAPaginaDeLogin() {
        String urlEsperada = "https://seubarriga.wcaquino.me/logout";
        Assert.assertEquals(urlEsperada, browser.getCurrentUrl());
        screenshot();
    }

    @Quando("clicar em listar")
    public void clicarEmListar() {
        paginaHome.clicarListar();
    }
}
