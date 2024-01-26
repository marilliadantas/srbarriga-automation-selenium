package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.CadastroPage;
import pages.LoginPage;
import runner.base_class.BaseSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CadastroSteps extends BaseSteps {
     Faker faker = new Faker(Locale.forLanguageTag("pt-BR"));
     String nome = faker.name().fullName();
     String email = faker.internet().emailAddress();
     String senha = "Teste1234$";


    // Página usada nos testes
    CadastroPage paginaCadastro = new CadastroPage();
    LoginPage paginaLogin = new LoginPage();


    // Fluxo Base
    @Dado("que o usuario esta na tela inicial do site")
    public void queOUsuarioEstaNaTelaInicialDoSite() {
        paginaLogin.validaPaginaLogin();
        screenshot();
    }

    @E("clica no link {string}")
    public void clicaNoLink(String string) {
        paginaLogin.clicarNovoUsuario();
    }

    @Quando("preenche os campos nome, email e senha")
    public void preencheOsCamposNomeEmailESenha() {
        paginaCadastro.preencherCamposCadastro(nome, email, senha);
        screenshot();
    }

    @E("clica no botao cadastrar")
    public void clicaNoBotaoCadastrar() {
        paginaCadastro.clicarCadastrar();
    }

    @Entao("o sistema exibe a mensagem {string}")
    public void oSistemaExibeAMensagem(String msgEsperada) {
        Assert.assertEquals(msgEsperada, paginaCadastro.validarMensagem());
        screenshot();
    }

    // Fluxo alternativo

    @Quando("pressiona ENTER no teclado")
    public void pressionaENTERNoTeclado() {
        paginaCadastro.pressEnter();
    }

    // Fluxos de exceção

    @Quando("preenche os campos {string}, {string} e {string}")
    public void preencheOsCamposE(String nome, String email, String senha) {
        paginaCadastro.preencherCamposCadastro(nome, email, senha);
        screenshot();
    }

    @Entao("o sistema exibe a {string}, {string}, {string}")
    public void oSistemaExibeA(String msgErroNome, String msgErroEmail, String msgErrosenha) {
        List<String> erros = paginaLogin.ListaMsgErro();
        List<String> retorno = new ArrayList<String>();
        retorno.add(msgErroNome);
        retorno.add(msgErroEmail);
        retorno.add(msgErrosenha);
        Assert.assertEquals(erros,retorno);
        screenshot();
    }
}
