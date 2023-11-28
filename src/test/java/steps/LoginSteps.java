package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import runner.base_class.BaseSteps;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps extends BaseSteps {

    LoginPage paginaLogin = new LoginPage();
    HomePage paginaHome = new HomePage();

    @Dado("que o usuario esta na tela de login")
    public void queOUsuarioEstaNaTelaDeLogin() {
        paginaLogin.validaPaginaLogin();
        screenshot();
    }

    @Quando("o usuario insere credenciais validas")
    public void oUsuarioInsereCredenciaisValidas() {
        paginaLogin.preencherEmail("kylianmb@teste.com");
        paginaLogin.preencherSenha("1234Teste");
        screenshot();
    }

    @E("clica em {string}")
    public void clicaEmEntrar(String string) {
        paginaLogin.clicarEntrar();
    }

    @E("pressiona {string}")
    public void pressiona(String string) {
        paginaLogin.pressionarEnter();
    }

    @Entao("o sistema redireciona para a página inicial exibindo a mensagem {string}")
    public void oSistemaRedirecionaParaAPáginaInicialExibindoAMensagem(String msgEsperada) {
        Assert.assertEquals(msgEsperada, paginaHome.validarMensagemWelcome());
        screenshot();
    }

    @Quando("o usuario insere {string} e {string} invalidas")
    public void oUsuarioInsereEInvalidas(String email, String senha) {
        paginaLogin.preencherEmail(email);
        paginaLogin.preencherSenha(senha);
        screenshot();
    }

    @Entao("o sistema exibe a {string}")
    public void oSistemaExibeA(String msgEsperada) {
        Assert.assertEquals(msgEsperada, paginaLogin.validaMensagemErro());
        screenshot();
    }

    @Entao("o sistema exibe a {string}, {string}")
    public void oSistemaExibeA(String msgErroEmail, String msgErroSenha) {
        List<String> erros = paginaLogin.ListaMsgErro();
        List<String> retorno = new ArrayList<String>();
        retorno.add(msgErroEmail);
        retorno.add(msgErroSenha);
        Assert.assertEquals(erros,retorno);
        screenshot();
    }
}
